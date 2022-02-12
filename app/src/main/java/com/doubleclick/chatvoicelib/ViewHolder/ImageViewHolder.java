package com.doubleclick.chatvoicelib.ViewHolder;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.doubleclick.chatvoicelib.R;

/**
 * Created By Eslam Ghazy on 2/7/2022
 */
public class ImageViewHolder extends RecyclerView.ViewHolder {
    public ImageView image;
    public ImageViewHolder(@NonNull View itemView) {
        super(itemView);
        image = itemView.findViewById(R.id.image);
    }
}
