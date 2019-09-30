package com.mbobiosio.android_sqlite_crud.model;

/**
 * Created by Mbuodile Obiosio on Sep 30,2019
 * https://twitter.com/cazewonder
 * Nigeria.
 */
public class Energy {

    private int id;
    private String deviceName;
    private String deviceCount;
    private String deviceWatt;

    public Energy(int id, String deviceName, String deviceCount, String deviceWatt) {
        this.id = id;
        this.deviceName = deviceName;
        this.deviceCount = deviceCount;
        this.deviceWatt = deviceWatt;
    }

    public Energy() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceCount() {
        return deviceCount;
    }

    public void setDeviceCount(String deviceCount) {
        this.deviceCount = deviceCount;
    }

    public String getDeviceWatt() {
        return deviceWatt;
    }

    public void setDeviceWatt(String deviceWatt) {
        this.deviceWatt = deviceWatt;
    }
}
