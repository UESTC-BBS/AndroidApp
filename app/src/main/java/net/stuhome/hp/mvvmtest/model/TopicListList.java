package net.stuhome.hp.mvvmtest.model;

import java.util.ArrayList;
import java.util.List;

public class TopicListList {

    private int boardId;
    private String boardName;
    private int topicId;
    private String type;
    private String title;
    private int userId;
    private String userNickName;
    private String userAvatar;
    private String lastReplyDate;
    private int vote;
    private int hot;
    private int hits;
    private int replies;
    private int essence;
    private int top;
    private int status;
    private String subject;
    private String picPath;
    private String ratio;
    private int gender;
    private int recommendAdd;
    private int special;
    private int isHasRecommendAdd;
    private List<Object> imageList = new ArrayList<>();
    private String sourceWebUrl;

    public TopicListList() {
    }

    public TopicListList(int boardId, String boardName, int topicId, String type, String title, int userId, String userNickName, String userAvatar, String lastReplyDate, int vote, int hot, int hits, int replies, int essence, int top, int status, String subject, String picPath, String ratio, int gender, int recommendAdd, int special, int isHasRecommendAdd, List<Object> imageList, String sourceWebUrl) {
        this.boardId = boardId;
        this.boardName = boardName;
        this.topicId = topicId;
        this.type = type;
        this.title = title;
        this.userId = userId;
        this.userNickName = userNickName;
        this.userAvatar = userAvatar;
        this.lastReplyDate = lastReplyDate;
        this.vote = vote;
        this.hot = hot;
        this.hits = hits;
        this.replies = replies;
        this.essence = essence;
        this.top = top;
        this.status = status;
        this.subject = subject;
        this.picPath = picPath;
        this.ratio = ratio;
        this.gender = gender;
        this.recommendAdd = recommendAdd;
        this.special = special;
        this.isHasRecommendAdd = isHasRecommendAdd;
        this.imageList = imageList;
        this.sourceWebUrl = sourceWebUrl;
    }

    public int getBoardId() {
        return boardId;
    }

    public void setBoardId(int boardId) {
        this.boardId = boardId;
    }

    public String getBoardName() {
        return boardName;
    }

    public void setBoardName(String boardName) {
        this.boardName = boardName;
    }

    public int getTopicId() {
        return topicId;
    }

    public void setTopicId(int topicId) {
        this.topicId = topicId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }

    public String getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
    }

    public String getLastReplyDate() {
        return lastReplyDate;
    }

    public void setLastReplyDate(String lastReplyDate) {
        this.lastReplyDate = lastReplyDate;
    }

    public int getVote() {
        return vote;
    }

    public void setVote(int vote) {
        this.vote = vote;
    }

    public int getHot() {
        return hot;
    }

    public void setHot(int hot) {
        this.hot = hot;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public int getReplies() {
        return replies;
    }

    public void setReplies(int replies) {
        this.replies = replies;
    }

    public int getEssence() {
        return essence;
    }

    public void setEssence(int essence) {
        this.essence = essence;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public String getRatio() {
        return ratio;
    }

    public void setRatio(String ratio) {
        this.ratio = ratio;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getRecommendAdd() {
        return recommendAdd;
    }

    public void setRecommendAdd(int recommendAdd) {
        this.recommendAdd = recommendAdd;
    }

    public int getSpecial() {
        return special;
    }

    public void setSpecial(int special) {
        this.special = special;
    }

    public int getIsHasRecommendAdd() {
        return isHasRecommendAdd;
    }

    public void setIsHasRecommendAdd(int isHasRecommendAdd) {
        this.isHasRecommendAdd = isHasRecommendAdd;
    }

    public List<Object> getImageList() {
        return imageList;
    }

    public void setImageList(List<Object> imageList) {
        this.imageList = imageList;
    }

    public String getSourceWebUrl() {
        return sourceWebUrl;
    }

    public void setSourceWebUrl(String sourceWebUrl) {
        this.sourceWebUrl = sourceWebUrl;
    }
}
