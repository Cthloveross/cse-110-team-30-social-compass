package com.example.team30;

import java.io.Serializable;

public class Coordinates implements Serializable {
    private float longitude;
    private float latitude;

    public Coordinates (float latitude, float longitude){
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }
}