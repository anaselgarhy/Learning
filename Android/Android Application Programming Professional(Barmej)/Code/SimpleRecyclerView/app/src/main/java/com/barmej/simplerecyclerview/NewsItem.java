package com.barmej.simplerecyclerview;

public class NewsItem {
    private String title;
    private String subtitle;

    public NewsItem(String title, String subtitle){
        this.title = title;
        this.subtitle = subtitle;
    }

    // Getters
    public String getTitle(){
        return title;
    }
    public String getSubtitle(){
        return subtitle;
    }
}
