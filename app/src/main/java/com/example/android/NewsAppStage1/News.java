package com.example.android.NewsAppStage1;

public class News {

    private String mHeadline;

    private String mSection;

    private String mDate;

    private String mUrl;

    private String mWriter;

    public News(String headline, String section, String date, String writer, String url) {

        mHeadline = headline;
        mSection = section;
        mDate = date;
        mWriter = writer;
        mUrl = url;
    }

    public String getmHeadline() {
        return mHeadline;
    }

    public String getmSection() {
        return mSection;
    }

    public String getmDate() {
        return mDate;
    }

    public String getmWriter() {
        return mWriter;
    }

    public String getmUrl() {
        return mUrl;
    }
}
