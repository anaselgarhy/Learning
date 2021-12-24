package com.barmej.simplerecyclerview;

import java.util.ArrayList;
import java.util.List;

public class NewsListGenerator {
    public static List<NewsItem> generateList(int size){
        ArrayList<NewsItem>list  = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            String title = "عنوان الخبر رقم :  "+ i;
            String subtitle = "عنوان فرعي للخبر رقم : "+i;
            list.add(new NewsItem(title,subtitle));
        }
        return list;
    }
}
