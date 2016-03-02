package net.stuhome.hp.mvvmtest.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class ForumList {
    private int rs;
    private String errcode;
    private Head head;
    @SerializedName("list")
    private List<ForumListList> forumListLists = new ArrayList<>();
    private int onlineUserNum;
    private int tdVisitors;

    public ForumList(int rs, String errcode, Head head, List<ForumListList> forumListLists, int onlineUserNum, int tdVisitors) {
        this.rs = rs;
        this.errcode = errcode;
        this.head = head;
        this.forumListLists = forumListLists;
        this.onlineUserNum = onlineUserNum;
        this.tdVisitors = tdVisitors;
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

    public List<ForumListList> getList() {
        return forumListLists;
    }

    public void setList(List<ForumListList> forumListLists) {
        this.forumListLists = forumListLists;
    }

    public int getOnlineUserNum() {
        return onlineUserNum;
    }

    public void setOnlineUserNum(int onlineUserNum) {
        this.onlineUserNum = onlineUserNum;
    }

    public int getTdVisitors() {
        return tdVisitors;
    }

    public void setTdVisitors(int tdVisitors) {
        this.tdVisitors = tdVisitors;
    }
}
