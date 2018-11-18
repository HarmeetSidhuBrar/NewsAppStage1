package com.example.android.NewsAppStage1;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Activity context, ArrayList<News> news) {

        super(context, 0, news);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Find the news at the given position in the list of news
        News currentNews = getItem(position);

        // Find the TextView with view ID news headline.
        TextView headlineView = listItemView.findViewById(R.id.news_headline);
        // Display the headline of the current news in that TextView
        headlineView.setText(currentNews.getmHeadline());

        TextView sectionView = listItemView.findViewById(R.id.section);
        sectionView.setText(currentNews.getmSection());

        TextView dateView = listItemView.findViewById(R.id.date);
        dateView.setText(currentNews.getmDate());

        TextView writerView = listItemView.findViewById(R.id.writer_text_view);
        writerView.setText(currentNews.getmWriter());

        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }

}
