package com.qulix.gifapp.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.qulix.gifapp.R;
import com.qulix.gifapp.model.Datum;
import com.bumptech.glide.Glide;

import java.util.List;

public class DatumAdapter extends ArrayAdapter<Datum> {
    private List<Datum> mDatumList;
    private Context context;
    private LayoutInflater mInflater;

    public DatumAdapter(Context context, List<Datum> objects) {
        super(context, 0, objects);
        this.context = context;
        this.mInflater = LayoutInflater.from(context);
        mDatumList = objects;

    }

    @Override
    public Datum getItem(int position) {
        return mDatumList.get(position);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        final ViewHolder vh;

        if (convertView == null) {
            View view = mInflater.inflate(R.layout.layout_row_view, parent, false);
            vh = ViewHolder.create((RelativeLayout) view);
            view.setTag(vh);
        } else {
            vh = (ViewHolder) convertView.getTag();
        }

        Datum item = getItem(position);

        assert item != null;
        vh.textViewName.setText(item.getTitle());

        Glide
                .with(context)
                .load(item.getImages().getOriginal().getUrl())
                .asGif()
                .error(R.drawable.ic_launcher_background)
                .into(vh.imageView);

        vh.imageView.setMaxWidth(Integer.parseInt(item.getImages().getOriginal().getWidth()));
        vh.imageView.setMaxHeight(Integer.parseInt(item.getImages().getOriginal().getHeight()));
        return vh.rootView;
    }

    private static class ViewHolder {
        private final RelativeLayout rootView;
        private final ImageView imageView;
        private final TextView textViewName;

        private ViewHolder(RelativeLayout rootView, ImageView imageView, TextView textViewName) {
            this.rootView = rootView;
            this.imageView = imageView;
            this.textViewName = textViewName;
        }

        private static ViewHolder create(RelativeLayout rootView) {
            ImageView imageView = (ImageView) rootView.findViewById(R.id.gifImageView);
            TextView textViewName = (TextView) rootView.findViewById(R.id.textViewName);
            return new ViewHolder(rootView, imageView, textViewName);

        }

    }
}
