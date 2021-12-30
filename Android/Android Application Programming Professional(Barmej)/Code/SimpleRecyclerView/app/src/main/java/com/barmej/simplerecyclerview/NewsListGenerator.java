package com.barmej.simplerecyclerview;

import java.util.ArrayList;
import java.util.List;

public class NewsListGenerator {
    public static List<NewsItem> generate(int size){
        ArrayList<NewsItem> list = new ArrayList<>(size);
        for(int i =0, num=0; i < size; i++, num = i + 1)
            list.add(new NewsItem("News title " + num, "News subtitle " + num));
        return list;
    }
}
