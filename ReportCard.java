package com.udacity.shahd.miwok;

/**
 * Created by shahd on 3/17/17.
 */

public class ReportCard {
    private String mStudentName;
    private String mClassName;
    private String mClassLevel;
    private String mGrade;

    public ReportCard(String mStudentName, String mClassName, String mClassLevel, String mGrade) {
        this.mStudentName = mStudentName;
        this.mClassName = mClassName;
        this.mClassLevel = mClassLevel;
        this.mGrade = mGrade;
    }

    public String getmStudentName() {
        return mStudentName;
    }

    public String getmClassName() {
        return mClassName;
    }

    public String getmClassLevel() {
        return mClassLevel;
    }

    public String getmGrade() {
        return mGrade;
    }

    public ReportCard setmClassName(String mClassName) {
        this.mClassName = mClassName;
        return this;
    }

    public ReportCard setmClassLevel(String mClassLevel) {
        this.mClassLevel = mClassLevel;
        return this;
    }

    public ReportCard setmGrade(String mGrade) {
        this.mGrade = mGrade;
        return this;
    }

    @Override
    public String toString() {
        return "Student{" +
                "mStudentName='" + mStudentName + '\'' +
                ", mClassName='" + mClassName + '\'' +
                ", mClassLevel=" + mClassLevel +
                ", mGrade=" + mGrade +
                '}';
    }
}
