package com.doubleclick.chatvoicelib;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import com.doubleclick.chatvoicelib.ViewHolder.ContactViewHolder;
import com.doubleclick.chatvoicelib.ViewHolder.ImageViewHolder;
import com.doubleclick.chatvoicelib.ViewHolder.TextViewHolder;
import com.doubleclick.chatvoicelib.ViewHolder.VoiceViewHolder;

import java.util.ArrayList;

/**
 * Created By Eslam Ghazy on 2/7/2022
 */
public class BaseAdapter extends RecyclerView.Adapter {

    ArrayList<Chat> chats = new ArrayList<>();

    public BaseAdapter(ArrayList<Chat> chats) {
        this.chats = chats;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        switch (viewType) {
            case BaseModel.voice:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_voice, parent, false);
                return new VoiceViewHolder(view);
            case BaseModel.text:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_text, parent, false);
                return new TextViewHolder(view);
            case BaseModel.image:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_image, parent, false);
                return new ImageViewHolder(view);
            case BaseModel.contact:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contact, parent, false);
                return new ContactViewHolder(view);
        }
        return null;
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        switch (chats.get(holder.getAdapterPosition()).getType()) {
            case "voice":
//                ((VoiceViewHolder) holder).voicePlayerView.setAudio(chats.get(holder.getAdapterPosition()).getMassage());
//                ((VoiceViewHolder) holder).name.setText(chats.get(holder.getAdapterPosition()).getName());
                ((VoiceViewHolder) holder).download(chats.get(holder.getAdapterPosition()).getMassage(),chats.get(holder.getAdapterPosition()).getName());
                break;
            case "text":
                ((TextViewHolder) holder).text.setText(chats.get(holder.getAdapterPosition()).getMassage());
                break;
            case "image":
                ((ImageViewHolder) holder).image.setImageResource(chats.get(holder.getAdapterPosition()).getImage());
                break;
            case "contact":
                ((ContactViewHolder) holder).number.setText(chats.get(holder.getAdapterPosition()).getMassage());
                ((ContactViewHolder) holder).name.setText(chats.get(holder.getAdapterPosition()).getName());
                break;
            default:
                return;
        }

    }

    @Override
    public int getItemCount() {
        return chats.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (chats.get(position).getType().equals("voice")) {
            return BaseModel.voice;
        }
        if (chats.get(position).getType().equals("image")) {
            return BaseModel.image;
        }
        if (chats.get(position).getType().equals("text")) {
            return BaseModel.text;
        }
        if (chats.get(position).getType().equals("contact")) {
            return BaseModel.contact;
        }
        return 0;
    }
}
