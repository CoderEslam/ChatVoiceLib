package com.doubleclick.chatvoicelib.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.doubleclick.chatvoicelib.R;

/**
 * Created By Eslam Ghazy on 2/7/2022
 */
public class ContactViewHolder extends RecyclerView.ViewHolder {
    public TextView name,number;
    public ContactViewHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.name);
        number = itemView.findViewById(R.id.number);
    }
}
