package com.andcris.practicingretrofit.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GorestCatalog {

    @SerializedName("data")
    @Expose
    private List<Gorest> data = null;

    public List<Gorest> getData() {
        return data;
    }

    public void setData(List<Gorest> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "GorestCatalog{" +
                "\ndata=" + data +
                "\n}";
    }
}
