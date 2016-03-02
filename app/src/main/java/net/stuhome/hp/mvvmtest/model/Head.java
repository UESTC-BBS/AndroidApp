package net.stuhome.hp.mvvmtest.model;

public class Head {

    private String errCode;
    private String errInfo;
    private String version;
    private int alert;

    public Head() {
    }

    public Head(String errCode, String errInfo, String version, int alert) {
        this.errCode = errCode;
        this.errInfo = errInfo;
        this.version = version;
        this.alert = alert;
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public String getErrInfo() {
        return errInfo;
    }

    public void setErrInfo(String errInfo) {
        this.errInfo = errInfo;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getAlert() {
        return alert;
    }

    public void setAlert(int alert) {
        this.alert = alert;
    }
}
