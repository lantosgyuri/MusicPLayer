package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Podcasts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_song_list);

        final ArrayList<songs> favoritPodcasts = new ArrayList<songs>();
        favoritPodcasts.add(new songs("AndroidDev", "ViewModell"));
        favoritPodcasts.add(new songs("AndroidDev", "about retrofit"));
        favoritPodcasts.add(new songs("AndroidDev", "ContentProvider?"));
        favoritPodcasts.add(new songs("AndroidDev", "Oreo"));
        favoritPodcasts.add(new songs("AndroidDev", "Flutter??"));
        favoritPodcasts.add(new songs("AndroidDev", "SQL"));


        songsAdapter adapter = new songsAdapter(this, favoritPodcasts);

        ListView listView = findViewById(R.id.listView);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                String band = favoritPodcasts.get(position).getAuthor();
                String title = favoritPodcasts.get(position).getTitel();

                Intent intent = new Intent(getApplicationContext(), PlayerActivity.class);
                intent.putExtra("Band", band);
                intent.putExtra("Title", title);
                startActivity(intent);
            }
        });

    }
}
