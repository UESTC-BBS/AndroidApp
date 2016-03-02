package net.stuhome.hp.mvvmtest.model;

public class UserLogin {

    private int rs;
    private String errcode;
    private Head head;
    private int isValidation;
    private String token;
    private String secret;
    private int uid;
    private String avatar;
    private String userName;

    public UserLogin() {
    }

    public UserLogin(int rs, String errcode, Head head, int isValidation, String token, String secret, int uid, String avatar, String userName) {
        this.rs = rs;
        this.errcode = errcode;
        this.head = head;
        this.isValidation = isValidation;
        this.token = token;
        this.secret = secret;
        this.uid = uid;
        this.avatar = avatar;
        this.userName = userName;
    }

    public int getRs() {
        return rs;
    }

    public void setRs(int rs) {
        this.rs = rs;
    }

    public String getErrcode() {
        return errcode;
    }

    public void setErrcode(String errcode) {
        this.errcode = errcode;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public int getIsValidation() {
        return isValidation;
    }

    public void setIsValidation(int isValidation) {
        this.isValidation = isValidation;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
