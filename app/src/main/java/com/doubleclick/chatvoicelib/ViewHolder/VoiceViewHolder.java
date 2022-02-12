package com.doubleclick.chatvoicelib.ViewHolder;

import static android.content.Context.DOWNLOAD_SERVICE;

import android.app.DownloadManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import com.doubleclick.chatvoicelib.R;
import com.doubleclick.chatvoicelib.Voice.VoicePlayerView;

/**
 * Created By Eslam Ghazy on 2/7/2022
 */
public class VoiceViewHolder extends RecyclerView.ViewHolder {

    public VoicePlayerView voicePlayerView;
    public TextView name;
    private VideoView video;
    public VoiceViewHolder(@NonNull View itemView) {
        super(itemView);
        voicePlayerView = itemView.findViewById(R.id.voicePlayerView);
        name = itemView.findViewById(R.id.name);
        video = itemView.findViewById(R.id.video);
        MediaController ctlr = new MediaController(itemView.getContext());
        ctlr.setMediaPlayer(video);
        video.setMediaController(ctlr);
        video.requestFocus();
        video.stopPlayback();
        video.pause();
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void download(String url,String Name){
        name.setText(Name);
        itemView.setOnClickListener(v -> {
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(url));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, "fileName" +getAdapterPosition());
            request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED); // to notify when download is complete
            request.allowScanningByMediaScanner();// if you want to be available from media players
            DownloadManager manager = (DownloadManager) itemView.getContext().getSystemService(DOWNLOAD_SERVICE);
            Uri u =  manager.getUriForDownloadedFile(manager.enqueue(request));
            Log.e("URI = ",u.toString()); //  content://downloads/all_downloads/119
            video.setVideoURI(u);
        });
    }


}
