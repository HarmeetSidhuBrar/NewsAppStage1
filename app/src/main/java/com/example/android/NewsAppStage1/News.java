package com.example.android.NewsAppStage1;

public class News {

private String nHeadline;

private String nSection;

private String nDate;



private String nUrl;


public News(String headline , String section , String date  , String url ){

    nHeadline =headline;
    nSection =section;
    nDate =date;
    nUrl=url;

}

    public String getnHeadline() {
        return nHeadline;
    }

    public String getnSection() {
        return nSection;
    }

    public String getnDate(){
        return nDate;
    }

    public String getnUrl(){return nUrl;}
}
