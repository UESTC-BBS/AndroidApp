package net.stuhome.hp.mvvmtest.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class TopicList {

    private int rs;
    private String errcode;
    private Head head;
    private List<Object> classificationTopList = new ArrayList<>();
    private List<ClassificationTypeList> classificationTypeList = new ArrayList<>();
    private int isOnlyTopicType;
    private List<Object> annoList = new ArrayList<>();
    private ForumInfo forumInfo;
    private List<Object> topTopicList = new ArrayList<>();
    @SerializedName("list")
    private List<TopicListList> topicListLists = new ArrayList<>();
    private int page;
    private int hasNext;
    private int totalNum;

    public TopicList() {
    }

    public TopicList(int rs, String errcode, Head head, List<Object> classificationTopList, List<ClassificationTypeList> classificationTypeList, int isOnlyTopicType, List<Object> annoList, ForumInfo forumInfo, List<Object> topTopicList, List<TopicListList> topicListLists, int page, int hasNext, int totalNum) {
        this.rs = rs;
        this.errcode = errcode;
        this.head = head;
        this.classificationTopList = classificationTopList;
        this.classificationTypeList = classificationTypeList;
        this.isOnlyTopicType = isOnlyTopicType;
        this.annoList = annoList;
        this.forumInfo = forumInfo;
        this.topTopicList = topTopicList;
        this.topicListLists = topicListLists;
        this.page = page;
        this.hasNext = hasNext;
        this.totalNum = totalNum;
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

    public List<Object> getClassificationTopList() {
        return classificationTopList;
    }

    public void setClassificationTopList(List<Object> classificationTopList) {
        this.classificationTopList = classificationTopList;
    }

    public List<ClassificationTypeList> getClassificationTypeList() {
        return classificationTypeList;
    }

    public void setClassificationTypeList(List<ClassificationTypeList> classificationTypeList) {
        this.classificationTypeList = classificationTypeList;
    }

    public int getIsOnlyTopicType() {
        return isOnlyTopicType;
    }

    public void setIsOnlyTopicType(int isOnlyTopicType) {
        this.isOnlyTopicType = isOnlyTopicType;
    }

    public List<Object> getAnnoList() {
        return annoList;
    }

    public void setAnnoList(List<Object> annoList) {
        this.annoList = annoList;
    }

    public ForumInfo getForumInfo() {
        return forumInfo;
    }

    public void setForumInfo(ForumInfo forumInfo) {
        this.forumInfo = forumInfo;
    }

    public List<Object> getTopTopicList() {
        return topTopicList;
    }

    public void setTopTopicList(List<Object> topTopicList) {
        this.topTopicList = topTopicList;
    }

    public List<TopicListList> getTopicListList() {
        return topicListLists;
    }

    public void setTopicListList(List<TopicListList> topicListLists) {
        this.topicListLists = topicListLists;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getHasNext() {
        return hasNext;
    }

    public void setHasNext(int hasNext) {
        this.hasNext = hasNext;
    }

    public int getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(int totalNum) {
        this.totalNum = totalNum;
    }
}
