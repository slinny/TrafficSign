package com.example.android.trafficsign.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Properties implements Parcelable {

@SerializedName("maxSignPhases")
@Expose
private Integer maxSignPhases;
@SerializedName("phaseDwellTime")
@Expose
private Integer phaseDwellTime;
@SerializedName("phaseBlankTime")
@Expose
private Integer phaseBlankTime;
@SerializedName("maxLinesPerPage")
@Expose
private Integer maxLinesPerPage;
@SerializedName("maxCharactersPerLine")
@Expose
private Integer maxCharactersPerLine;
@SerializedName("sizeKnown")
@Expose
private Boolean sizeKnown;

    protected Properties(Parcel in) {
        if (in.readByte() == 0) {
            maxSignPhases = null;
        } else {
            maxSignPhases = in.readInt();
        }
        if (in.readByte() == 0) {
            phaseDwellTime = null;
        } else {
            phaseDwellTime = in.readInt();
        }
        if (in.readByte() == 0) {
            phaseBlankTime = null;
        } else {
            phaseBlankTime = in.readInt();
        }
        if (in.readByte() == 0) {
            maxLinesPerPage = null;
        } else {
            maxLinesPerPage = in.readInt();
        }
        if (in.readByte() == 0) {
            maxCharactersPerLine = null;
        } else {
            maxCharactersPerLine = in.readInt();
        }
        byte tmpSizeKnown = in.readByte();
        sizeKnown = tmpSizeKnown == 0 ? null : tmpSizeKnown == 1;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        if (maxSignPhases == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(maxSignPhases);
        }
        if (phaseDwellTime == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(phaseDwellTime);
        }
        if (phaseBlankTime == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(phaseBlankTime);
        }
        if (maxLinesPerPage == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(maxLinesPerPage);
        }
        if (maxCharactersPerLine == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(maxCharactersPerLine);
        }
        dest.writeByte((byte) (sizeKnown == null ? 0 : sizeKnown ? 1 : 2));
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Properties> CREATOR = new Creator<Properties>() {
        @Override
        public Properties createFromParcel(Parcel in) {
            return new Properties(in);
        }

        @Override
        public Properties[] newArray(int size) {
            return new Properties[size];
        }
    };

    public Integer getMaxSignPhases() {
return maxSignPhases;
}

public void setMaxSignPhases(Integer maxSignPhases) {
this.maxSignPhases = maxSignPhases;
}

public Integer getPhaseDwellTime() {
return phaseDwellTime;
}

public void setPhaseDwellTime(Integer phaseDwellTime) {
this.phaseDwellTime = phaseDwellTime;
}

public Integer getPhaseBlankTime() {
return phaseBlankTime;
}

public void setPhaseBlankTime(Integer phaseBlankTime) {
this.phaseBlankTime = phaseBlankTime;
}

public Integer getMaxLinesPerPage() {
return maxLinesPerPage;
}

public void setMaxLinesPerPage(Integer maxLinesPerPage) {
this.maxLinesPerPage = maxLinesPerPage;
}

public Integer getMaxCharactersPerLine() {
return maxCharactersPerLine;
}

public void setMaxCharactersPerLine(Integer maxCharactersPerLine) {
this.maxCharactersPerLine = maxCharactersPerLine;
}

public Boolean getSizeKnown() {
return sizeKnown;
}

public void setSizeKnown(Boolean sizeKnown) {
this.sizeKnown = sizeKnown;
}

}