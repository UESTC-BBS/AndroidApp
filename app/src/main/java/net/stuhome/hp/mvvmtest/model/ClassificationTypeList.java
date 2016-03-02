package net.stuhome.hp.mvvmtest.model;

public class ClassificationTypeList {

    private int classificationTypeId;
    private String classificationTypeName;

    public ClassificationTypeList() {
    }

    public ClassificationTypeList(int classificationTypeId, String classificationTypeName) {
        this.classificationTypeId = classificationTypeId;
        this.classificationTypeName = classificationTypeName;
    }

    public int getClassificationTypeId() {
        return classificationTypeId;
    }

    public void setClassificationTypeId(int classificationTypeId) {
        this.classificationTypeId = classificationTypeId;
    }

    public String getClassificationTypeName() {
        return classificationTypeName;
    }

    public void setClassificationTypeName(String classificationTypeName) {
        this.classificationTypeName = classificationTypeName;
    }

}
