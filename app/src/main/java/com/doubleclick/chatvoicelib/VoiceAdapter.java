package com.doubleclick.chatvoicelib;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.doubleclick.chatvoicelib.Voice.VoicePlayerView;

import java.util.ArrayList;

public class VoiceAdapter extends RecyclerView.Adapter<VoiceAdapter.AdapterViewHolder> {

    ArrayList<String> list = new ArrayList<>();


    public VoiceAdapter(ArrayList<String> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public VoiceAdapter.AdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AdapterViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_voice,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull VoiceAdapter.AdapterViewHolder holder, int position) {
        holder.playerView.setAudio(list.get(holder.getAdapterPosition()));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class AdapterViewHolder extends RecyclerView.ViewHolder {

        private VoicePlayerView playerView;

        public AdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            playerView = itemView.findViewById(R.id.voicePlayerView); }

    }
}
