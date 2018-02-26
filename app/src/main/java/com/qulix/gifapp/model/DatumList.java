package com.qulix.gifapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class DatumList {
    @SerializedName("data")
    @Expose
    private ArrayList<Datum> mData = new ArrayList<>();

    public ArrayList<Datum> getData() {
        return mData;
    }

    public void setData(ArrayList<Datum> data) {
        this.mData = data;
    }
}
