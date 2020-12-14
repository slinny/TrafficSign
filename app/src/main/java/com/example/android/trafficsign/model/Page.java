package com.example.android.trafficsign.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Page implements Parcelable {

@SerializedName("lines")
@Expose
private List<String> lines = null;
@SerializedName("justification")
@Expose
private String justification;

    protected Page(Parcel in) {
        lines = in.createStringArrayList();
        justification = in.readString();
    }

    public static final Creator<Page> CREATOR = new Creator<Page>() {
        @Override
        public Page createFromParcel(Parcel in) {
            return new Page(in);
        }

        @Override
        public Page[] newArray(int size) {
            return new Page[size];
        }
    };

    public List<String> getLines() {
return lines;
}

public void setLines(List<String> lines) {
this.lines = lines;
}

public String getJustification() {
return justification;
}

public void setJustification(String justification) {
this.justification = justification;
}

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(lines);
        parcel.writeString(justification);
    }
}