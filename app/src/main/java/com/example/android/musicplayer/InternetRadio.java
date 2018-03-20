package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class InternetRadio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_song_list);

        final ArrayList<songs> favoritRadios = new ArrayList<songs>();
        favoritRadios.add(new songs("LastFm", "Chillout"));
        favoritRadios.add(new songs("LastFm", "DUB"));
        favoritRadios.add(new songs("Spoitfy", "Lounge"));
        favoritRadios.add(new songs("Spotify", "Techno"));


        songsAdapter adapter = new songsAdapter(this, favoritRadios);

        ListView listView = findViewById(R.id.listView);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                String band = favoritRadios.get(position).getAuthor();
                String title = favoritRadios.get(position).getTitel();

                Intent intent = new Intent(getApplicationContext(), PlayerActivity.class);
                intent.putExtra("Band", band);
                intent.putExtra("Title", title);
                startActivity(intent);
            }
        });

    }
}
