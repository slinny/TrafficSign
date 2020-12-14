package com.example.android.trafficsign.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Location implements Parcelable {

@SerializedName("linearReference")
@Expose
private Double linearReference;
@SerializedName("longitude")
@Expose
private Double longitude;
@SerializedName("latitude")
@Expose
private Double latitude;
@SerializedName("fips")
@Expose
private Integer fips;
@SerializedName("perpendicularRadiansForDirectionOfTravel")
@Expose
private Double perpendicularRadiansForDirectionOfTravel;
@SerializedName("routeId")
@Expose
private String routeId;
@SerializedName("cityReference")
@Expose
private String cityReference;
@SerializedName("locationDescription")
@Expose
private String locationDescription;
@SerializedName("signFacingDirection")
@Expose
private String signFacingDirection;

    protected Location(Parcel in) {
        if (in.readByte() == 0) {
            linearReference = null;
        } else {
            linearReference = in.readDouble();
        }
        if (in.readByte() == 0) {
            longitude = null;
        } else {
            longitude = in.readDouble();
        }
        if (in.readByte() == 0) {
            latitude = null;
        } else {
            latitude = in.readDouble();
        }
        if (in.readByte() == 0) {
            fips = null;
        } else {
            fips = in.readInt();
        }
        if (in.readByte() == 0) {
            perpendicularRadiansForDirectionOfTravel = null;
        } else {
            perpendicularRadiansForDirectionOfTravel = in.readDouble();
        }
        routeId = in.readString();
        cityReference = in.readString();
        locationDescription = in.readString();
        signFacingDirection = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        if (linearReference == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeDouble(linearReference);
        }
        if (longitude == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeDouble(longitude);
        }
        if (latitude == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeDouble(latitude);
        }
        if (fips == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(fips);
        }
        if (perpendicularRadiansForDirectionOfTravel == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeDouble(perpendicularRadiansForDirectionOfTravel);
        }
        dest.writeString(routeId);
        dest.writeString(cityReference);
        dest.writeString(locationDescription);
        dest.writeString(signFacingDirection);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Location> CREATOR = new Creator<Location>() {
        @Override
        public Location createFromParcel(Parcel in) {
            return new Location(in);
        }

        @Override
        public Location[] newArray(int size) {
            return new Location[size];
        }
    };

    public Double getLinearReference() {
return linearReference;
}

public void setLinearReference(Double linearReference) {
this.linearReference = linearReference;
}

public Double getLongitude() {
return longitude;
}

public void setLongitude(Double longitude) {
this.longitude = longitude;
}

public Double getLatitude() {
return latitude;
}

public void setLatitude(Double latitude) {
this.latitude = latitude;
}

public Integer getFips() {
return fips;
}

public void setFips(Integer fips) {
this.fips = fips;
}

public Double getPerpendicularRadiansForDirectionOfTravel() {
return perpendicularRadiansForDirectionOfTravel;
}

public void setPerpendicularRadiansForDirectionOfTravel(Double perpendicularRadiansForDirectionOfTravel) {
this.perpendicularRadiansForDirectionOfTravel = perpendicularRadiansForDirectionOfTravel;
}

public String getRouteId() {
return routeId;
}

public void setRouteId(String routeId) {
this.routeId = routeId;
}

public String getCityReference() {
return cityReference;
}

public void setCityReference(String cityReference) {
this.cityReference = cityReference;
}

public String getLocationDescription() {
return locationDescription;
}

public void setLocationDescription(String locationDescription) {
this.locationDescription = locationDescription;
}

public String getSignFacingDirection() {
return signFacingDirection;
}

public void setSignFacingDirection(String signFacingDirection) {
this.signFacingDirection = signFacingDirection;
}

}