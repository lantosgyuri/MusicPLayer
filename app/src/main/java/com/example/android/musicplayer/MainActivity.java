package com.example.android.musicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.favorit_textView)
    TextView favoritTextView;

    @BindView(R.id.podcast_text)
    TextView podcastText;

    @BindView(R.id.internet_radio_text)
    TextView internetRadioText;

    private long backPressedTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //use butterKnife to bind the views
        ButterKnife.bind(this);

        favoritTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity.goToFavoritSongs(getApplicationContext());
            }
        });

        podcastText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity.goToPodcast(getApplicationContext());
            }
        });

        internetRadioText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity.goToInternetRadio(getApplicationContext());
            }
        });

    }

    @Override
    public void onBackPressed() {

        if (backPressedTime + 2000 > System.currentTimeMillis()){
            finish();
        } else {
            Toast.makeText(this, R.string.back_pressed_warning, Toast.LENGTH_SHORT).show();
        }

        backPressedTime = System.currentTimeMillis();


    }
}
