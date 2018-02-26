package com.qulix.gifapp.api;

import com.qulix.gifapp.model.DatumList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface ApiService {
    @GET
    Call<DatumList> getMyJSON(@Url String url);
}
