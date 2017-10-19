package com.jd.o2o.ccq.domain.web;
/**
 * Created with IntelliJ IDEA.
 * User: sunchenglu
 * Date: 15-5-15
 * Time: 下午5:43
 * To change this template use File | Settings | File Templates.
 */
public class ExtendMobieClientContext{
    private String deviceId;  //设备id
    private String jd_pin;    //京东pin
    private String appVersion;
    private String platCode;
    private String platVersion;
    private String pin;

    /**
     * add by suncl 20160818 v3.3
     */
    private String functionId;
    private String channel;
    private String appName;
    private String city_id;
    private Float lat;
    private Float lng;
    private Float lat_pos;
    private Float lng_pos;
    private String deviceModel;


    public ExtendMobieClientContext() {
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public ExtendMobieClientContext(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public String getJd_pin() {
        return jd_pin;
    }

    public void setJd_pin(String jd_pin) {
        this.jd_pin = jd_pin;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getPlatCode() {
        return platCode;
    }

    public void setPlatCode(String platCode) {
        this.platCode = platCode;
    }

    public String getPlatVersion() {
        return platVersion;
    }

    public void setPlatVersion(String platVersion) {
        this.platVersion = platVersion;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    public String getFunctionId() {
        return functionId;
    }

    public void setFunctionId(String functionId) {
        this.functionId = functionId;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getCity_id() {
        return city_id;
    }

    public void setCity_id(String city_id) {
        this.city_id = city_id;
    }

    public Float getLat() {
        return lat;
    }

    public void setLat(Float lat) {
        this.lat = lat;
    }

    public Float getLng() {
        return lng;
    }

    public void setLng(Float lng) {
        this.lng = lng;
    }

    public Float getLat_pos() {
        return lat_pos;
    }

    public void setLat_pos(Float lat_pos) {
        this.lat_pos = lat_pos;
    }

    public Float getLng_pos() {
        return lng_pos;
    }

    public void setLng_pos(Float lng_pos) {
        this.lng_pos = lng_pos;
    }
}
