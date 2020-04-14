package com.auro.scholr.home.data.model;

import android.os.Parcel;
import android.os.Parcelable;

public class AuroScholarDataModel implements Parcelable {

    String mobileNumber;
    String screenType;
    String studentClass;
    String scholarID;
    String registrationSource;

    public AuroScholarDataModel() {

    }

    protected AuroScholarDataModel(Parcel in) {
        mobileNumber = in.readString();
        screenType = in.readString();
        studentClass = in.readString();
        scholarID = in.readString();
        registrationSource = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mobileNumber);
        dest.writeString(screenType);
        dest.writeString(studentClass);
        dest.writeString(scholarID);
        dest.writeString(registrationSource);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<AuroScholarDataModel> CREATOR = new Creator<AuroScholarDataModel>() {
        @Override
        public AuroScholarDataModel createFromParcel(Parcel in) {
            return new AuroScholarDataModel(in);
        }

        @Override
        public AuroScholarDataModel[] newArray(int size) {
            return new AuroScholarDataModel[size];
        }
    };

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getScreenType() {
        return screenType;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public String getScholarID() {
        return scholarID;
    }

    public void setScholarID(String scholarID) {
        this.scholarID = scholarID;
    }

    public String getRegistrationSource() {
        return registrationSource;
    }

    public void setRegistrationSource(String registrationSource) {
        this.registrationSource = registrationSource;
    }
}
