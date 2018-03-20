package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FavoritSongs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_list);

        final ArrayList<songs> favoritSongs = new ArrayList<songs>();
        favoritSongs.add(new songs("Eminem", "Stay"));
        favoritSongs.add(new songs("Eminem", "Away"));
        favoritSongs.add(new songs("Eminem", "From"));
        favoritSongs.add(new songs("Eminem", "Me"));
        favoritSongs.add(new songs("Eminem", "You are"));
        favoritSongs.add(new songs("Eminem", "So beautiful"));
        favoritSongs.add(new songs("Eminem", "Sometimes"));
        favoritSongs.add(new songs("Eminem", "beautiful"));

        songsAdapter adapter = new songsAdapter(this, favoritSongs);

        ListView listView = findViewById(R.id.listView);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                String band = favoritSongs.get(position).getAuthor();
                String title = favoritSongs.get(position).getTitel();

                Intent intent = new Intent(getApplicationContext(), PlayerActivity.class);
                intent.putExtra("Band", band);
                intent.putExtra("Title", title);
                startActivity(intent);
            }
        });

}
}
