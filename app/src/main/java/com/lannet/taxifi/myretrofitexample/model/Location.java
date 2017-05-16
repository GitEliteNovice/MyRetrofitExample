package com.lannet.taxifi.myretrofitexample.model;

/**
 * Created by dell on 5/13/2017.
 */

public class Location {
    private final String elevation;
    private final String id;
    private final String latitude;
    private final String longitude;
    private final String name;
    private final String region;
    private final String unitaryAuthArea;

    public Location(String elevation, String id, String latitude, String longitude, String name, String region, String unitaryAuthArea){
        this.elevation=elevation;
        this.id=id;
        this.latitude=latitude;
        this.longitude=longitude;
        this.name=name;
        this.region=region;
        this.unitaryAuthArea=unitaryAuthArea;
    }

    public String getElevation() {
        return elevation;
    }

    public String getId() {
        return id;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getName() {
        return name;
    }

    public String getRegion() {
        return region;
    }

    public String getUnitaryAuthArea() {
        return unitaryAuthArea;
    }

}
