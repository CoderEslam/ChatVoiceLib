package com.doubleclick.chatvoicelib.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.doubleclick.chatvoicelib.R;

/**
 * Created By Eslam Ghazy on 2/7/2022
 */
public class TextViewHolder extends RecyclerView.ViewHolder {
    public TextView text;
    public TextViewHolder(@NonNull View itemView) {
        super(itemView);
        text = itemView.findViewById(R.id.text);
    }
}
