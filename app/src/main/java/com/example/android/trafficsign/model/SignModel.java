package com.example.android.trafficsign.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SignModel implements Parcelable {

@SerializedName("agencyId")
@Expose
private String agencyId;
@SerializedName("idForDisplay")
@Expose
private String idForDisplay;
@SerializedName("agencyName")
@Expose
private String agencyName;
@SerializedName("display")
@Expose
private Display display;
@SerializedName("lastUpdated")
@Expose
private long lastUpdated;
@SerializedName("status")
@Expose
private String status;
@SerializedName("name")
@Expose
private String name;
@SerializedName("location")
@Expose
private Location location;
@SerializedName("properties")
@Expose
private Properties properties;
@SerializedName("id")
@Expose
private String id;

    protected SignModel(Parcel in) {
        agencyId = in.readString();
        idForDisplay = in.readString();
        agencyName = in.readString();
        lastUpdated = in.readLong();
        status = in.readString();
        name = in.readString();
        id = in.readString();
    }

    public static final Creator<SignModel> CREATOR = new Creator<SignModel>() {
        @Override
        public SignModel createFromParcel(Parcel in) {
            return new SignModel(in);
        }

        @Override
        public SignModel[] newArray(int size) {
            return new SignModel[size];
        }
    };

    public String getAgencyId() {
return agencyId;
}

public void setAgencyId(String agencyId) {
this.agencyId = agencyId;
}

public String getIdForDisplay() {
return idForDisplay;
}

public void setIdForDisplay(String idForDisplay) {
this.idForDisplay = idForDisplay;
}

public String getAgencyName() {
return agencyName;
}

public void setAgencyName(String agencyName) {
this.agencyName = agencyName;
}

public Display getDisplay() {
return display;
}

public void setDisplay(Display display) {
this.display = display;
}

public long getLastUpdated() {
return lastUpdated;
}

public void setLastUpdated(Integer lastUpdated) {
this.lastUpdated = lastUpdated;
}

public String getStatus() {
return status;
}

public void setStatus(String status) {
this.status = status;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public Location getLocation() {
return location;
}

public void setLocation(Location location) {
this.location = location;
}

public Properties getProperties() {
return properties;
}

public void setProperties(Properties properties) {
this.properties = properties;
}

public String getId() {
return id;
}

public void setId(String id) {
this.id = id;
}

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(agencyId);
        parcel.writeString(idForDisplay);
        parcel.writeString(agencyName);
        parcel.writeLong(lastUpdated);
        parcel.writeString(status);
        parcel.writeString(name);
        parcel.writeString(id);
    }
}