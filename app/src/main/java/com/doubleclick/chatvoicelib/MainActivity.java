package com.doubleclick.chatvoicelib;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.app.DownloadManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {


    //https://firebasestorage.googleapis.com/v0/b/x-course-6e1ff.appspot.com/o/Media%2FRecording%2FzMuWreEcAuOAvKcmn12YcKBGeFu2%3AXSAYfi4ljvNEFJ9AY4cxmlwqDFs21637861455320?alt=media&token=b3a3db64-0525-4152-b39c-2e1d4d5eb4be
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.list);
        ArrayList<Chat> list = new ArrayList<>();
        list.add(new Chat("eslam", "500", "GoodMorning", R.drawable.ic_launcher_foreground, "text"));
        list.add(new Chat("eslam", "500", "GoodMorning", R.drawable.ic_launcher_foreground, "text"));
        list.add(new Chat("eslam", "500", "https://firebasestorage.googleapis.com/v0/b/x-course-6e1ff.appspot.com/o/Media%2FRecording%2FzMuWreEcAuOAvKcmn12YcKBGeFu2%3AXSAYfi4ljvNEFJ9AY4cxmlwqDFs21637861455320?alt=media&token=b3a3db64-0525-4152-b39c-2e1d4d5eb4be", R.drawable.ic_launcher_foreground, "voice"));
        list.add(new Chat("eslam", "500", "+0224656444", R.drawable.ic_launcher_foreground, "contact"));
        list.add(new Chat("eslam", "500", "GoodMorning", R.drawable.ic_launcher_foreground, "text"));
        list.add(new Chat("eslam", "500", "GoodMorning", R.drawable.ic_launcher_foreground, "text"));
        list.add(new Chat("eslam", "500", "https://firebasestorage.googleapis.com/v0/b/x-course-6e1ff.appspot.com/o/Media%2FRecording%2FzMuWreEcAuOAvKcmn12YcKBGeFu2%3AXSAYfi4ljvNEFJ9AY4cxmlwqDFs21637861455320?alt=media&token=b3a3db64-0525-4152-b39c-2e1d4d5eb4be", R.drawable.ic_launcher_foreground, "voice"));
        list.add(new Chat("eslam", "500", "+0224656444", R.drawable.ic_launcher_foreground, "contact"));
        list.add(new Chat("eslam", "500", "GoodMorning", R.drawable.ic_launcher_foreground, "text"));
        list.add(new Chat("eslam", "500", "GoodMorning", R.drawable.ic_launcher_foreground, "text"));
        list.add(new Chat("eslam", "500", "https://firebasestorage.googleapis.com/v0/b/x-course-6e1ff.appspot.com/o/Media%2FRecording%2FzMuWreEcAuOAvKcmn12YcKBGeFu2%3AXSAYfi4ljvNEFJ9AY4cxmlwqDFs21637861455320?alt=media&token=b3a3db64-0525-4152-b39c-2e1d4d5eb4be", R.drawable.ic_launcher_foreground, "voice"));
        list.add(new Chat("eslam", "500", "+0224656444", R.drawable.ic_launcher_foreground, "contact"));
        list.add(new Chat("eslam", "500", "GoodMorning", R.drawable.ic_launcher_foreground, "text"));
        list.add(new Chat("eslam", "500", "GoodMorning", R.drawable.ic_launcher_foreground, "text"));
        list.add(new Chat("eslam", "500", "https://firebasestorage.googleapis.com/v0/b/x-course-6e1ff.appspot.com/o/Media%2FRecording%2FzMuWreEcAuOAvKcmn12YcKBGeFu2%3AXSAYfi4ljvNEFJ9AY4cxmlwqDFs21637861455320?alt=media&token=b3a3db64-0525-4152-b39c-2e1d4d5eb4be", R.drawable.ic_launcher_foreground, "voice"));
        list.add(new Chat("eslam", "500", "+0224656444", R.drawable.ic_launcher_foreground, "contact"));
        list.add(new Chat("eslam", "500", "GoodMorning", R.drawable.ic_launcher_foreground, "text"));
        list.add(new Chat("eslam", "500", "GoodMorning", R.drawable.ic_launcher_foreground, "text"));
        list.add(new Chat("eslam", "500", "https://firebasestorage.googleapis.com/v0/b/x-course-6e1ff.appspot.com/o/Media%2FRecording%2FzMuWreEcAuOAvKcmn12YcKBGeFu2%3AXSAYfi4ljvNEFJ9AY4cxmlwqDFs21637861455320?alt=media&token=b3a3db64-0525-4152-b39c-2e1d4d5eb4be", R.drawable.ic_launcher_foreground, "voice"));
        list.add(new Chat("eslam", "500", "+0224656444", R.drawable.ic_launcher_foreground, "contact"));
        list.add(new Chat("eslam", "500", "GoodMorning", R.drawable.ic_launcher_foreground, "text"));
        list.add(new Chat("eslam", "500", "GoodMorning", R.drawable.ic_launcher_foreground, "text"));
        list.add(new Chat("eslam", "500", "https://firebasestorage.googleapis.com/v0/b/x-course-6e1ff.appspot.com/o/Media%2FRecording%2FzMuWreEcAuOAvKcmn12YcKBGeFu2%3AXSAYfi4ljvNEFJ9AY4cxmlwqDFs21637861455320?alt=media&token=b3a3db64-0525-4152-b39c-2e1d4d5eb4be", R.drawable.ic_launcher_foreground, "voice"));
        list.add(new Chat("eslam", "500", "+0224656444", R.drawable.ic_launcher_foreground, "contact"));
        list.add(new Chat("eslam", "500", "GoodMorning", R.drawable.ic_launcher_foreground, "text"));
        list.add(new Chat("eslam", "500", "GoodMorning", R.drawable.ic_launcher_foreground, "text"));
        list.add(new Chat("eslam", "500", "https://firebasestorage.googleapis.com/v0/b/x-course-6e1ff.appspot.com/o/Media%2FRecording%2FzMuWreEcAuOAvKcmn12YcKBGeFu2%3AXSAYfi4ljvNEFJ9AY4cxmlwqDFs21637861455320?alt=media&token=b3a3db64-0525-4152-b39c-2e1d4d5eb4be", R.drawable.ic_launcher_foreground, "voice"));
        list.add(new Chat("eslam", "500", "+0224656444", R.drawable.ic_launcher_foreground, "contact"));
        list.add(new Chat("eslam", "500", "GoodMorning", R.drawable.ic_launcher_foreground, "text"));
        list.add(new Chat("eslam", "500", "GoodMorning", R.drawable.ic_launcher_foreground, "text"));
        list.add(new Chat("eslam", "500", "https://firebasestorage.googleapis.com/v0/b/x-course-6e1ff.appspot.com/o/Media%2FRecording%2FzMuWreEcAuOAvKcmn12YcKBGeFu2%3AXSAYfi4ljvNEFJ9AY4cxmlwqDFs21637861455320?alt=media&token=b3a3db64-0525-4152-b39c-2e1d4d5eb4be", R.drawable.ic_launcher_foreground, "voice"));
        list.add(new Chat("eslam", "500", "+0224656444", R.drawable.ic_launcher_foreground, "contact"));
        list.add(new Chat("eslam", "500", "GoodMorning", R.drawable.ic_launcher_foreground, "text"));
        list.add(new Chat("eslam", "500", "GoodMorning", R.drawable.ic_launcher_foreground, "text"));
        list.add(new Chat("eslam", "500", "https://firebasestorage.googleapis.com/v0/b/x-course-6e1ff.appspot.com/o/Media%2FRecording%2FzMuWreEcAuOAvKcmn12YcKBGeFu2%3AXSAYfi4ljvNEFJ9AY4cxmlwqDFs21637861455320?alt=media&token=b3a3db64-0525-4152-b39c-2e1d4d5eb4be", R.drawable.ic_launcher_foreground, "voice"));
        list.add(new Chat("eslam", "500", "+0224656444", R.drawable.ic_launcher_foreground, "contact"));
        list.add(new Chat("eslam", "500", "GoodMorning", R.drawable.ic_launcher_foreground, "text"));
        list.add(new Chat("eslam", "500", "GoodMorning", R.drawable.ic_launcher_foreground, "text"));
        list.add(new Chat("eslam", "500", "https://firebasestorage.googleapis.com/v0/b/x-course-6e1ff.appspot.com/o/Media%2FRecording%2FzMuWreEcAuOAvKcmn12YcKBGeFu2%3AXSAYfi4ljvNEFJ9AY4cxmlwqDFs21637861455320?alt=media&token=b3a3db64-0525-4152-b39c-2e1d4d5eb4be", R.drawable.ic_launcher_foreground, "voice"));
        list.add(new Chat("eslam", "500", "+0224656444", R.drawable.ic_launcher_foreground, "contact"));
        list.add(new Chat("eslam", "500", "GoodMorning", R.drawable.ic_launcher_foreground, "text"));
        list.add(new Chat("eslam", "500", "GoodMorning", R.drawable.ic_launcher_foreground, "text"));
        list.add(new Chat("eslam", "500", "https://firebasestorage.googleapis.com/v0/b/x-course-6e1ff.appspot.com/o/Media%2FRecording%2FzMuWreEcAuOAvKcmn12YcKBGeFu2%3AXSAYfi4ljvNEFJ9AY4cxmlwqDFs21637861455320?alt=media&token=b3a3db64-0525-4152-b39c-2e1d4d5eb4be", R.drawable.ic_launcher_foreground, "voice"));
        list.add(new Chat("eslam", "500", "+0224656444", R.drawable.ic_launcher_foreground, "contact"));
        list.add(new Chat("eslam", "500", "GoodMorning", R.drawable.ic_launcher_foreground, "text"));
        list.add(new Chat("eslam", "500", "GoodMorning", R.drawable.ic_launcher_foreground, "text"));
        list.add(new Chat("eslam", "500", "https://firebasestorage.googleapis.com/v0/b/x-course-6e1ff.appspot.com/o/Media%2FRecording%2FzMuWreEcAuOAvKcmn12YcKBGeFu2%3AXSAYfi4ljvNEFJ9AY4cxmlwqDFs21637861455320?alt=media&token=b3a3db64-0525-4152-b39c-2e1d4d5eb4be", R.drawable.ic_launcher_foreground, "voice"));
        list.add(new Chat("eslam", "500", "+0224656444", R.drawable.ic_launcher_foreground, "contact"));
        list.add(new Chat("eslam", "500", "GoodMorning", R.drawable.ic_launcher_foreground, "text"));
        list.add(new Chat("eslam", "500", "GoodMorning", R.drawable.ic_launcher_foreground, "text"));
        list.add(new Chat("eslam", "500", "https://firebasestorage.googleapis.com/v0/b/x-course-6e1ff.appspot.com/o/Media%2FRecording%2FzMuWreEcAuOAvKcmn12YcKBGeFu2%3AXSAYfi4ljvNEFJ9AY4cxmlwqDFs21637861455320?alt=media&token=b3a3db64-0525-4152-b39c-2e1d4d5eb4be", R.drawable.ic_launcher_foreground, "voice"));
        list.add(new Chat("eslam", "500", "+0224656444", R.drawable.ic_launcher_foreground, "contact"));
        list.add(new Chat("eslam", "500", "GoodMorning", R.drawable.ic_launcher_foreground, "text"));
        list.add(new Chat("eslam", "500", "GoodMorning", R.drawable.ic_launcher_foreground, "text"));
        list.add(new Chat("eslam", "500", "https://firebasestorage.googleapis.com/v0/b/x-course-6e1ff.appspot.com/o/Media%2FRecording%2FzMuWreEcAuOAvKcmn12YcKBGeFu2%3AXSAYfi4ljvNEFJ9AY4cxmlwqDFs21637861455320?alt=media&token=b3a3db64-0525-4152-b39c-2e1d4d5eb4be", R.drawable.ic_launcher_foreground, "voice"));
        list.add(new Chat("eslam", "500", "+0224656444", R.drawable.ic_launcher_foreground, "contact"));
        list.add(new Chat("eslam", "500", "GoodMorning", R.drawable.ic_launcher_foreground, "text"));
        list.add(new Chat("eslam", "500", "GoodMorning", R.drawable.ic_launcher_foreground, "text"));
        list.add(new Chat("eslam", "500", "https://firebasestorage.googleapis.com/v0/b/x-course-6e1ff.appspot.com/o/Media%2FRecording%2FzMuWreEcAuOAvKcmn12YcKBGeFu2%3AXSAYfi4ljvNEFJ9AY4cxmlwqDFs21637861455320?alt=media&token=b3a3db64-0525-4152-b39c-2e1d4d5eb4be", R.drawable.ic_launcher_foreground, "voice"));
        list.add(new Chat("eslam", "500", "+0224656444", R.drawable.ic_launcher_foreground, "contact"));
        list.add(new Chat("eslam", "500", "GoodMorning", R.drawable.ic_launcher_foreground, "text"));
        list.add(new Chat("eslam", "500", "GoodMorning", R.drawable.ic_launcher_foreground, "text"));
        list.add(new Chat("eslam", "500", "https://firebasestorage.googleapis.com/v0/b/x-course-6e1ff.appspot.com/o/Media%2FRecording%2FzMuWreEcAuOAvKcmn12YcKBGeFu2%3AXSAYfi4ljvNEFJ9AY4cxmlwqDFs21637861455320?alt=media&token=b3a3db64-0525-4152-b39c-2e1d4d5eb4be", R.drawable.ic_launcher_foreground, "voice"));
        list.add(new Chat("eslam", "500", "+0224656444", R.drawable.ic_launcher_foreground, "contact"));
        list.add(new Chat("eslam", "500", "GoodMorning", R.drawable.ic_launcher_foreground, "text"));
        list.add(new Chat("eslam", "500", "GoodMorning", R.drawable.ic_launcher_foreground, "text"));
        list.add(new Chat("eslam", "500", "https://firebasestorage.googleapis.com/v0/b/x-course-6e1ff.appspot.com/o/Media%2FRecording%2FzMuWreEcAuOAvKcmn12YcKBGeFu2%3AXSAYfi4ljvNEFJ9AY4cxmlwqDFs21637861455320?alt=media&token=b3a3db64-0525-4152-b39c-2e1d4d5eb4be", R.drawable.ic_launcher_foreground, "voice"));
        list.add(new Chat("eslam", "500", "+0224656444", R.drawable.ic_launcher_foreground, "contact"));
        list.add(new Chat("eslam", "500", "GoodMorning", R.drawable.ic_launcher_foreground, "text"));
        list.add(new Chat("eslam", "500", "GoodMorning", R.drawable.ic_launcher_foreground, "text"));
        list.add(new Chat("eslam", "500", "https://firebasestorage.googleapis.com/v0/b/x-course-6e1ff.appspot.com/o/Media%2FRecording%2FzMuWreEcAuOAvKcmn12YcKBGeFu2%3AXSAYfi4ljvNEFJ9AY4cxmlwqDFs21637861455320?alt=media&token=b3a3db64-0525-4152-b39c-2e1d4d5eb4be", R.drawable.ic_launcher_foreground, "voice"));
        list.add(new Chat("eslam", "500", "+0224656444", R.drawable.ic_launcher_foreground, "contact"));
        list.add(new Chat("eslam", "500", "GoodMorning", R.drawable.ic_launcher_foreground, "text"));
        list.add(new Chat("eslam", "500", "GoodMorning", R.drawable.ic_launcher_foreground, "text"));
        list.add(new Chat("eslam", "500", "https://firebasestorage.googleapis.com/v0/b/x-course-6e1ff.appspot.com/o/Media%2FRecording%2FzMuWreEcAuOAvKcmn12YcKBGeFu2%3AXSAYfi4ljvNEFJ9AY4cxmlwqDFs21637861455320?alt=media&token=b3a3db64-0525-4152-b39c-2e1d4d5eb4be", R.drawable.ic_launcher_foreground, "voice"));
        list.add(new Chat("eslam", "500", "+0224656444", R.drawable.ic_launcher_foreground, "contact"));
        list.add(new Chat("eslam", "500", "GoodMorning", R.drawable.ic_launcher_foreground, "text"));
        list.add(new Chat("eslam", "500", "GoodMorning", R.drawable.ic_launcher_foreground, "text"));
        list.add(new Chat("eslam", "500", "https://firebasestorage.googleapis.com/v0/b/x-course-6e1ff.appspot.com/o/Media%2FRecording%2FzMuWreEcAuOAvKcmn12YcKBGeFu2%3AXSAYfi4ljvNEFJ9AY4cxmlwqDFs21637861455320?alt=media&token=b3a3db64-0525-4152-b39c-2e1d4d5eb4be", R.drawable.ic_launcher_foreground, "voice"));
        list.add(new Chat("eslam", "500", "+0224656444", R.drawable.ic_launcher_foreground, "contact"));
        list.add(new Chat("eslam", "500", "GoodMorning", R.drawable.ic_launcher_foreground, "text"));
        list.add(new Chat("eslam", "500", "GoodMorning", R.drawable.ic_launcher_foreground, "text"));
        list.add(new Chat("eslam", "500", "https://firebasestorage.googleapis.com/v0/b/x-course-6e1ff.appspot.com/o/Media%2FRecording%2FzMuWreEcAuOAvKcmn12YcKBGeFu2%3AXSAYfi4ljvNEFJ9AY4cxmlwqDFs21637861455320?alt=media&token=b3a3db64-0525-4152-b39c-2e1d4d5eb4be", R.drawable.ic_launcher_foreground, "voice"));
        list.add(new Chat("eslam", "500", "+0224656444", R.drawable.ic_launcher_foreground, "contact"));
        list.add(new Chat("eslam", "500", "GoodMorning", R.drawable.ic_launcher_foreground, "text"));
        list.add(new Chat("eslam", "500", "GoodMorning", R.drawable.ic_launcher_foreground, "text"));
        list.add(new Chat("eslam", "500", "https://firebasestorage.googleapis.com/v0/b/x-course-6e1ff.appspot.com/o/Media%2FRecording%2FzMuWreEcAuOAvKcmn12YcKBGeFu2%3AXSAYfi4ljvNEFJ9AY4cxmlwqDFs21637861455320?alt=media&token=b3a3db64-0525-4152-b39c-2e1d4d5eb4be", R.drawable.ic_launcher_foreground, "voice"));
        list.add(new Chat("eslam", "500", "+0224656444", R.drawable.ic_launcher_foreground, "contact"));
        list.add(new Chat("eslam", "500", "GoodMorning", R.drawable.ic_launcher_foreground, "text"));
        list.add(new Chat("eslam", "500", "GoodMorning", R.drawable.ic_launcher_foreground, "text"));
        list.add(new Chat("eslam", "500", "https://firebasestorage.googleapis.com/v0/b/x-course-6e1ff.appspot.com/o/Media%2FRecording%2FzMuWreEcAuOAvKcmn12YcKBGeFu2%3AXSAYfi4ljvNEFJ9AY4cxmlwqDFs21637861455320?alt=media&token=b3a3db64-0525-4152-b39c-2e1d4d5eb4be", R.drawable.ic_launcher_foreground, "voice"));
        list.add(new Chat("eslam", "500", "+0224656444", R.drawable.ic_launcher_foreground, "contact"));
        list.add(new Chat("eslam", "500", "GoodMorning", R.drawable.ic_launcher_foreground, "text"));
        list.add(new Chat("eslam", "500", "GoodMorning", R.drawable.ic_launcher_foreground, "text"));
        list.add(new Chat("eslam", "500", "https://firebasestorage.googleapis.com/v0/b/x-course-6e1ff.appspot.com/o/Media%2FRecording%2FzMuWreEcAuOAvKcmn12YcKBGeFu2%3AXSAYfi4ljvNEFJ9AY4cxmlwqDFs21637861455320?alt=media&token=b3a3db64-0525-4152-b39c-2e1d4d5eb4be", R.drawable.ic_launcher_foreground, "voice"));
        list.add(new Chat("eslam", "500", "+0224656444", R.drawable.ic_launcher_foreground, "contact"));
        list.add(new Chat("eslam", "500", "GoodMorning", R.drawable.ic_launcher_foreground, "text"));
        list.add(new Chat("eslam", "500", "GoodMorning", R.drawable.ic_launcher_foreground, "text"));
        list.add(new Chat("eslam", "500", "https://firebasestorage.googleapis.com/v0/b/x-course-6e1ff.appspot.com/o/Media%2FRecording%2FzMuWreEcAuOAvKcmn12YcKBGeFu2%3AXSAYfi4ljvNEFJ9AY4cxmlwqDFs21637861455320?alt=media&token=b3a3db64-0525-4152-b39c-2e1d4d5eb4be", R.drawable.ic_launcher_foreground, "voice"));
        list.add(new Chat("eslam", "500", "+0224656444", R.drawable.ic_launcher_foreground, "contact"));
        list.add(new Chat("eslam", "500", "GoodMorning", R.drawable.ic_launcher_foreground, "text"));
        list.add(new Chat("eslam", "500", "GoodMorning", R.drawable.ic_launcher_foreground, "text"));
        list.add(new Chat("eslam", "500", "https://firebasestorage.googleapis.com/v0/b/x-course-6e1ff.appspot.com/o/Media%2FRecording%2FzMuWreEcAuOAvKcmn12YcKBGeFu2%3AXSAYfi4ljvNEFJ9AY4cxmlwqDFs21637861455320?alt=media&token=b3a3db64-0525-4152-b39c-2e1d4d5eb4be", R.drawable.ic_launcher_foreground, "voice"));
        list.add(new Chat("eslam", "500", "+0224656444", R.drawable.ic_launcher_foreground, "contact"));
        list.add(new Chat("eslam", "500", "GoodMorning", R.drawable.ic_launcher_foreground, "text"));
        list.add(new Chat("eslam", "500", "GoodMorning", R.drawable.ic_launcher_foreground, "text"));
        list.add(new Chat("eslam", "500", "https://firebasestorage.googleapis.com/v0/b/x-course-6e1ff.appspot.com/o/Media%2FRecording%2FzMuWreEcAuOAvKcmn12YcKBGeFu2%3AXSAYfi4ljvNEFJ9AY4cxmlwqDFs21637861455320?alt=media&token=b3a3db64-0525-4152-b39c-2e1d4d5eb4be", R.drawable.ic_launcher_foreground, "voice"));
        list.add(new Chat("eslam", "500", "+0224656444", R.drawable.ic_launcher_foreground, "contact"));
        list.add(new Chat("eslam", "500", "GoodMorning", R.drawable.ic_launcher_foreground, "text"));
        list.add(new Chat("eslam", "500", "GoodMorning", R.drawable.ic_launcher_foreground, "text"));
        list.add(new Chat("eslam", "500", "https://firebasestorage.googleapis.com/v0/b/x-course-6e1ff.appspot.com/o/Media%2FRecording%2FzMuWreEcAuOAvKcmn12YcKBGeFu2%3AXSAYfi4ljvNEFJ9AY4cxmlwqDFs21637861455320?alt=media&token=b3a3db64-0525-4152-b39c-2e1d4d5eb4be", R.drawable.ic_launcher_foreground, "voice"));
        list.add(new Chat("eslam", "500", "+0224656444", R.drawable.ic_launcher_foreground, "contact"));

        /*for (int i = 0; i <= 20; i++) {
            list.add(new Chat("eslam", "500", "GoodMorning", R.drawable.ic_launcher_foreground, "text"));
        }

        for (int i = 0; i <= 20; i++) {
            list.add(new Chat("eslam", "500", "GoodMorning", R.drawable.ic_launcher_foreground, "text"));
        }
        for (int j = 0; j <= 20; j++) {
            list.add(new Chat("eslam", "500", "https://firebasestorage.googleapis.com/v0/b/x-course-6e1ff.appspot.com/o/Media%2FRecording%2FzMuWreEcAuOAvKcmn12YcKBGeFu2%3AXSAYfi4ljvNEFJ9AY4cxmlwqDFs21637861455320?alt=media&token=b3a3db64-0525-4152-b39c-2e1d4d5eb4be", R.drawable.ic_launcher_foreground, "voice"));
        }
        for (int k = 0; k <= 20; k++) {
            list.add(new Chat("eslam", "500", "GoodMorning", R.drawable.ic_launcher_foreground, "image"));
        }

        for (int e = 0; e <= 20; e++) {
            list.add(new Chat("eslam", "500", "+0224656444", R.drawable.ic_launcher_foreground, "contact"));
        }*/
//        VoiceAdapter adapter = new VoiceAdapter(list);
        BaseAdapter baseAdapter = new BaseAdapter(list);
        recyclerView.setAdapter(baseAdapter);


        findViewById(R.id.download).setOnClickListener(v -> {
//            File file= Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
//            if (file.exists()){
//
//            }else {
//                file.mkdir();
//            }
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse("https://firebasestorage.googleapis.com/v0/b/x-course-6e1ff.appspot.com/o/Media%2FRecording%2FzMuWreEcAuOAvKcmn12YcKBGeFu2%3AXSAYfi4ljvNEFJ9AY4cxmlwqDFs21637861455320?alt=media&token=b3a3db64-0525-4152-b39c-2e1d4d5eb4be"));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, "fileName" );
            request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED); // to notify when download is complete
            request.allowScanningByMediaScanner();// if you want to be available from media players
            DownloadManager manager = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
            Uri uri =  manager.getUriForDownloadedFile(manager.enqueue(request));
            Log.e("URI = ",uri.toString()); //  content://downloads/all_downloads/119
        });

    }
}