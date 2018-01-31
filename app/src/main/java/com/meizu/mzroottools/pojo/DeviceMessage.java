package com.meizu.mzroottools.pojo;

/**
 * Created by shidongming on 18-1-31.
 */

public class DeviceMessage {
    private String deviceModel;
    private String deviceSn;
    private String devicePsn;
    private String deviceChipid;

    public DeviceMessage() {
    }

    /**
     * @param deviceModel 设备型号
     * @param deviceSn 设备序列号
     * @param devicePsn 设备PSN码
     * @param deviceChipid 设备CHIPID码
     */
    public DeviceMessage(String deviceModel, String deviceSn, String devicePsn, String deviceChipid) {
        this.deviceModel = deviceModel;
        this.deviceSn = deviceSn;
        this.devicePsn = devicePsn;
        this.deviceChipid = deviceChipid;
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

    public String getDevicePsn() {
        return devicePsn;
    }

    public void setDevicePsn(String devicePsn) {
        this.devicePsn = devicePsn;
    }

    public String getDeviceChipid() {
        return deviceChipid;
    }

    public void setDeviceChipid(String deviceChipid) {
        this.deviceChipid = deviceChipid;
    }

    public boolean haveAllMsg() {
        if (deviceModel == null || deviceSn == null
                || devicePsn == null || deviceChipid == null) {
            return false;
        }
        return true;
    }
}
