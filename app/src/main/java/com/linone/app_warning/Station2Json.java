package com.linone.app_warning;

import com.google.gson.annotations.SerializedName;

public class Station2Json {
    @SerializedName("created_at")
    private String created_at;

    @SerializedName("entry_id")
    private String entry_id;

    @SerializedName("field1")
    private double WaterLevel;

    @SerializedName("field2")
    private double BdTemp;

    @SerializedName("field3")
    private double Volt;

    @SerializedName("field4")
    private String Warning;

    public Station2Json(String created_at, String entry_id, double waterLevel, double bdTemp, double volt, String warning) {
        this.created_at = created_at;
        this.entry_id = entry_id;
        WaterLevel = waterLevel;
        BdTemp = bdTemp;
        Volt = volt;
        Warning = warning;
    }

    public double getBdTemp() {
        return BdTemp;
    }

    public void setBdTemp(double bdTemp) {
        BdTemp = bdTemp;
    }

    public double getVolt() {
        return Volt;
    }

    public void setVolt(double volt) {
        Volt = volt;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getEntry_id() {
        return entry_id;
    }

    public void setEntry_id(String entry_id) {
        this.entry_id = entry_id;
    }

    public double getWaterLevel() {
        return WaterLevel;
    }

    public void setWaterLevel(double waterLevel) {
        WaterLevel = waterLevel;
    }

    public String getWarning() {
        return Warning;
    }

    public void setWarning(String warning) {
        Warning = warning;
    }
}
