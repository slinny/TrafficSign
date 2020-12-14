package com.example.android.trafficsign.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Display implements Parcelable {

@SerializedName("pages")
@Expose
private List<Page> pages = null;

    protected Display(Parcel in) {
        pages = in.createTypedArrayList(Page.CREATOR);
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeTypedList(pages);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Display> CREATOR = new Creator<Display>() {
        @Override
        public Display createFromParcel(Parcel in) {
            return new Display(in);
        }

        @Override
        public Display[] newArray(int size) {
            return new Display[size];
        }
    };

    public List<Page> getPages() {
return pages;
}

public void setPages(List<Page> pages) {
this.pages = pages;
}

}