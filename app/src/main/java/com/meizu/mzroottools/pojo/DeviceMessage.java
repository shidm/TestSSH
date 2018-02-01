package com.meizu.mzroottools.pojo;

/**
 * Created by shidongming on 18-1-31.
 */

public class DeviceMessage {
    private String deviceModel;
    private String deviceSn;
    private String devicePsnAndChipId;

    public DeviceMessage() {
    }

    /**
     * @param deviceModel 设备型号
     * @param deviceSn 设备序列号
     * @param devicePsnAndChipId 设备CHIPID码
     */
    public DeviceMessage(String deviceModel, String deviceSn, String devicePsnAndChipId) {
        this.deviceModel = deviceModel;
        this.deviceSn = deviceSn;
        this.devicePsnAndChipId = devicePsnAndChipId;
    }

    public String getdeviceModel() {
        return deviceModel;
    }

    public void setdeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    public String getDeviceSn() {
        return deviceSn;
    }

    public void setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
    }

    public String getdevicePsnAndChipId() {
        return devicePsnAndChipId;
    }

    public void setdevicePsnAndChipId(String devicePsnAndChipId) {
        this.devicePsnAndChipId = devicePsnAndChipId;
    }

    public boolean haveAllMsg() {
        if (deviceModel == null || deviceSn == null
                || devicePsnAndChipId == null) {
            return false;
        }
        return true;
    }
}
