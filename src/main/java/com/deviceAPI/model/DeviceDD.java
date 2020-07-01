package com.deviceAPI.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Device_Information")
public class DeviceDD {
    private String value;
    private String label;
    private Double lat;
    private Double lon;

    @Id
    @Column(name = "Id")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Column(name = "Name")
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Column(name = "Latitude")
    public Double getLat() {
		return this.lat;
	}

    public void setLat(Double lat) {
        this.lat = lat;
    }

    @Column(name = "Longitude")
    public Double getLon() {
		return this.lon;
	}

    public void setLon(Double lon) {
		this.lon = lon;
	}

    public DeviceDD() {
    }
}
