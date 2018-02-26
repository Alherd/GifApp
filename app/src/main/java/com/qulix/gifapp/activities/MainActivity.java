package com.qulix.gifapp.activities;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.jakewharton.rxbinding.view.RxView;
import com.qulix.gifapp.R;
import com.qulix.gifapp.adapter.DatumAdapter;
import com.qulix.gifapp.api.ApiService;
import com.qulix.gifapp.api.RetroClient;
import com.qulix.gifapp.model.Datum;
import com.qulix.gifapp.model.DatumList;
import com.qulix.gifapp.utils.InternetConnection;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import rx.functions.Action1;

public class MainActivity extends AppCompatActivity {
    private static final String URL = "/v1/gifs/search?q=";
    private static final String URL_TREND = "/v1/gifs/trending?";
    private static final String API_KEY = "&api_key=N5Q5KyycCVb83uSBkFCFtrchP2PtRjVc";

    private ListView listView;
    private View parentView;
    private ArrayList<Datum> contactList;
    private DatumAdapter adapter;
    private EditText searcher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showGifList(URL_TREND + API_KEY);

        contactList = new ArrayList<>();
        parentView = findViewById(R.id.parentLayout);
        listView = (ListView) findViewById(R.id.listView);
        searcher = (EditText) findViewById(R.id.userFilter);

        Button trendButton = (Button) findViewById(R.id.trendButton);
        RxView.clicks(trendButton).subscribe(new Action1<Void>() {
            @Override
            public void call(Void aVoid) {
                showGifList(URL_TREND + API_KEY);
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        assert fab != null;
        RxView.clicks(fab).subscribe(new Action1<Void>() {
            @Override
            public void call(Void aVoid) {
                showGifList(URL + searcher.getText().toString() + API_KEY);
            }
        });
    }

    private void showGifList(String uri) {
        if (InternetConnection.checkConnection(getApplicationContext())) {
            final ProgressDialog dialog;

            dialog = new ProgressDialog(MainActivity.this);
            dialog.setTitle(getString(R.string.app_name));
            dialog.setMessage(getString(R.string.loading));
            dialog.show();

            ApiService api = RetroClient.getApiService();

            Call<DatumList> call = api.getMyJSON(uri);
            call.enqueue(new Callback<DatumList>() {

                @Override
                public void onResponse(@NonNull Call<DatumList> call, @NonNull Response<DatumList> response) {
                    dialog.dismiss();

                    if (response.isSuccessful()) {
                        contactList = response.body().getData();

                        if (!contactList.isEmpty()) {
                            adapter = new DatumAdapter(MainActivity.this, contactList);
                            listView.setAdapter(adapter);
                        } else {
                            Snackbar.make(parentView, R.string.nothing_result, Snackbar.LENGTH_LONG).show();
                        }
                    } else {
                        Snackbar.make(parentView, R.string.loading_error, Snackbar.LENGTH_LONG).show();
                    }
                }

                @Override
                public void onFailure(@NonNull Call<DatumList> call, @NonNull Throwable t) {
                    dialog.dismiss();
                }
            });
        } else {
            Snackbar.make(parentView, R.string.connection_error, Snackbar.LENGTH_LONG).show();
        }
    }

}
