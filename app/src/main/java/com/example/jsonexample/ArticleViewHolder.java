package com.example.jsonexample;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ArticleViewHolder extends RecyclerView.ViewHolder {

    ImageView image;
    TextView title;
    TextView body;


    public ArticleViewHolder(@NonNull View itemView) {
        super( itemView );

        image = itemView.findViewById( R.id.image );
        title = itemView.findViewById( R.id.title );
        body  = itemView.findViewById( R.id.body );
    }
}
