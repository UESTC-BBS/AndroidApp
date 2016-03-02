package net.stuhome.hp.mvvmtest.model;

import java.util.ArrayList;
import java.util.List;

public class ForumListList {
    private int boardCategoryId;
    private String boardCategoryName;
    private int boardCategoryType;
    private List<BoardList> boardList = new ArrayList<BoardList>();

    public ForumListList(int boardCategoryId, String boardCategoryName, int boardCategoryType, List<BoardList> boardList) {
        this.boardCategoryId = boardCategoryId;
        this.boardCategoryName = boardCategoryName;
        this.boardCategoryType = boardCategoryType;
        this.boardList = boardList;
    }

    public int getBoardCategoryId() {
        return boardCategoryId;
    }

    public void setBoardCategoryId(int boardCategoryId) {
        this.boardCategoryId = boardCategoryId;
    }

    public String getBoardCategoryName() {
        return boardCategoryName;
    }

    public void setBoardCategoryName(String boardCategoryName) {
        this.boardCategoryName = boardCategoryName;
    }

    public int getBoardCategoryType() {
        return boardCategoryType;
    }

    public void setBoardCategoryType(int boardCategoryType) {
        this.boardCategoryType = boardCategoryType;
    }

    public List<BoardList> getBoardList() {
        return boardList;
    }

    public void setBoardList(List<BoardList> boardList) {
        this.boardList = boardList;
    }
}
