package com.example.jsonexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ArticlesAdabtor extends Adapter<ArticleViewHolder> {

    ArrayList<Article> articles;

    public ArticlesAdabtor() {
        articles = new ArrayList<>();
    }

    public void setData(ArrayList<Article> articles){
        this.articles = articles;
    }

    @NonNull
    @Override
    public ArticleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View articleView = inflater.inflate(R.layout.recycler_row, parent, false);
        return new ArticleViewHolder(articleView);
    }

    @Override
    public void onBindViewHolder(@NonNull ArticleViewHolder holder, int position) {
        Article article = articles.get(position);
        Picasso.get()
                .load(article.image)
                .into(holder.image);
        holder.title.setText(article.title);
        holder.body.setText(article.body);
    }

    @Override
    public int getItemCount() {
        return articles.size();
    }
}