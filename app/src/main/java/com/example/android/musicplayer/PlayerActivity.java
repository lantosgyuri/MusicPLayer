package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PlayerActivity extends AppCompatActivity {

    @BindView(R.id.goTo_favorit_text)
    TextView goToFavorit;

    @BindView(R.id.goTo_podcast_text)
    TextView goToPodcast;

    @BindView(R.id.goTo_Radio_text)
    TextView goToRadio;

    @BindView(R.id.playing_band_text)
    TextView bandText;

    @BindView(R.id.playing_titel_text)
    TextView titleText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        ButterKnife.bind(this);

        Intent intent = getIntent();
        String band = intent.getStringExtra("Band");
        String title = intent.getStringExtra("Title");

        bandText.setText(band);
        titleText.setText(title);



        goToFavorit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity.goToFavoritSongs(getApplicationContext());
            }
        });

        goToPodcast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity.goToPodcast(getApplicationContext());
            }
        });

        goToRadio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity.goToInternetRadio(getApplicationContext());
            }
        });

    }
}
