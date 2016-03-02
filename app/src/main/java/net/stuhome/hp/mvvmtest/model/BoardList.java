package net.stuhome.hp.mvvmtest.model;

public class BoardList {
    private int boardId;
    private String boardName;
    private String description;
    private int boardChild;
    private String boardImg;
    private String lastPostsDate;
    private int boardContent;
    private String forumRedirect;
    private int favNum;
    private int tdPostsNum;
    private int topicTotalNum;
    private int postsTotalNum;
    private int isFocus;

    public BoardList(int boardId, String boardName, String description, int boardChild, String boardImg, String lastPostsDate, int boardContent, String forumRedirect, int favNum, int tdPostsNum, int topicTotalNum, int postsTotalNum, int isFocus) {
        this.boardId = boardId;
        this.boardName = boardName;
        this.description = description;
        this.boardChild = boardChild;
        this.boardImg = boardImg;
        this.lastPostsDate = lastPostsDate;
        this.boardContent = boardContent;
        this.forumRedirect = forumRedirect;
        this.favNum = favNum;
        this.tdPostsNum = tdPostsNum;
        this.topicTotalNum = topicTotalNum;
        this.postsTotalNum = postsTotalNum;
        this.isFocus = isFocus;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getBoardChild() {
        return boardChild;
    }

    public void setBoardChild(int boardChild) {
        this.boardChild = boardChild;
    }

    public String getBoardImg() {
        return boardImg;
    }

    public void setBoardImg(String boardImg) {
        this.boardImg = boardImg;
    }

    public String getLastPostsDate() {
        return lastPostsDate;
    }

    public void setLastPostsDate(String lastPostsDate) {
        this.lastPostsDate = lastPostsDate;
    }

    public int getBoardContent() {
        return boardContent;
    }

    public void setBoardContent(int boardContent) {
        this.boardContent = boardContent;
    }

    public String getForumRedirect() {
        return forumRedirect;
    }

    public void setForumRedirect(String forumRedirect) {
        this.forumRedirect = forumRedirect;
    }

    public int getFavNum() {
        return favNum;
    }

    public void setFavNum(int favNum) {
        this.favNum = favNum;
    }

    public int getTdPostsNum() {
        return tdPostsNum;
    }

    public void setTdPostsNum(int tdPostsNum) {
        this.tdPostsNum = tdPostsNum;
    }

    public int getTopicTotalNum() {
        return topicTotalNum;
    }

    public void setTopicTotalNum(int topicTotalNum) {
        this.topicTotalNum = topicTotalNum;
    }

    public int getPostsTotalNum() {
        return postsTotalNum;
    }

    public void setPostsTotalNum(int postsTotalNum) {
        this.postsTotalNum = postsTotalNum;
    }

    public int getIsFocus() {
        return isFocus;
    }

    public void setIsFocus(int isFocus) {
        this.isFocus = isFocus;
    }
}
