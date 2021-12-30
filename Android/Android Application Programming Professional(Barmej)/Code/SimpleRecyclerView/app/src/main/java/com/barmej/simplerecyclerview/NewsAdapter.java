package com.barmej.simplerecyclerview;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder> {

    List<NewsItem> newsList;
    OnListItemClickListener onItemClickListener;

    public NewsAdapter(List<NewsItem> itemsList, OnListItemClickListener onListItemClickListener){
        this.newsList = itemsList;
        this.onItemClickListener = onListItemClickListener;
    }
    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_news, parent, false);
        NewsViewHolder newsViewHolder = new NewsViewHolder(view, onItemClickListener);

        return newsViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewHolder holder, @SuppressLint("RecyclerView") int position) {
        NewsItem newsItem = newsList.get(position);
        holder.titleTextView.setText(newsItem.getTitle());
        holder.subtitleTextView.setText(newsItem.getSubtitle());

        holder.position = position;
    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }

    static class NewsViewHolder extends RecyclerView.ViewHolder {
        int position;
        TextView titleTextView;
        TextView subtitleTextView;

        public NewsViewHolder(View itemView, OnListItemClickListener onListItemClickListener){
            super(itemView);
            titleTextView = itemView.findViewById(R.id.text_view_title);
            subtitleTextView = itemView.findViewById(R.id.text_view_subtitle);

            itemView.setOnClickListener(listener -> onListItemClickListener.onItemClick(position));
        }
    }
}
