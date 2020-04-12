package com.deviceAPI.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Device_Information")
public class Device {
    private String id;
    private String name;
    private String description;
    private String gatewayId;
    private String installDateTime;
    private String serialNumber;
    private String timezoneId;
    private String hwVersion;
    private Long latitude;
    private Long longitude;
    private String neuronId;
    private String transformerId;
    private String utilityId;
    private String sysSWprivs;
    private String CosAppPrivs;
    private String CosAppDeltaLPSets;

    @Id
    @Column(name="Id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Column(name="Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name="Description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name="GatewayId")
    public String getGatewayId() {
        return gatewayId;
    }

    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }

    @Column(name="InstallationDateTime")
    public String getInstallDateTime() {
        return installDateTime;
    }

    public void setInstallDateTime(String installDateTime) {
        this.installDateTime = installDateTime;
    }

    @Column(name="SerialNumber")
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Column(name="TimeZoneId")
    public String getTimezoneId() {
        return timezoneId;
    }

    public void setTimezoneId(String timezoneId) {
        this.timezoneId = timezoneId;
    }

    @Column(name="HardWareVersion")
    public String getHwVersion() {
        return hwVersion;
    }

    public void setHwVersion(String hwVersion) {
        this.hwVersion = hwVersion;
    }

    @Column(name="Latitude")
    public Long getLatitude() {
        return latitude;
    }

    public void setLatitude(Long latitude) {
        this.latitude = latitude;
    }

    @Column(name="Longitude")
    public Long getLongitude() {
        return longitude;
    }

    public void setLongitude(Long longitude) {
        this.longitude = longitude;
    }

    @Column(name="NeuronId")
    public String getNeuronId() {
        return neuronId;
    }

    public void setNeuronId(String neuronId) {
        this.neuronId = neuronId;
    }

    @Column(name="TransformerId")
    public String getTransformerId() {
        return transformerId;
    }

    public void setTransformerId(String transformerId) {
        this.transformerId = transformerId;
    }

    @Column(name="UtilityId")
    public String getUtilityId() {
        return utilityId;
    }

    public void setUtilityId(String utilityId) {
        this.utilityId = utilityId;
    }

    @Column(name="SysSWPrivs")
    public String getSysSWprivs() {
        return sysSWprivs;
    }

    public void setSysSWprivs(String sysSWprivs) {
        this.sysSWprivs = sysSWprivs;
    }

    @Column(name="COSAppPrivs")
    public String getCosAppPrivs() {
        return CosAppPrivs;
    }

    public void setCosAppPrivs(String cosAppPrivs) {
        CosAppPrivs = cosAppPrivs;
    }

    @Column(name="COSAppDeltaLPSets")
    public String getCosAppDeltaLPSets() {
        return CosAppDeltaLPSets;
    }

    public void setCosAppDeltaLPSets(String cosAppDeltaLPSets) {
        CosAppDeltaLPSets = cosAppDeltaLPSets;
    }

    public Device() {
    }
}
