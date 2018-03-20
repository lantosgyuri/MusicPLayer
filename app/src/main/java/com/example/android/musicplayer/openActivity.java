package com.example.android.musicplayer;

import android.content.Context;
import android.content.Intent;
import android.view.View;


/**
 * Created by android on 2018.03.18..
 */

public class openActivity {

    public static void goToPodcast (Context context){
        Intent intent = new Intent(context, Podcasts.class);
        context.startActivity(intent);
    }

    public static void goToInternetRadio(Context context){
        Intent intent = new Intent(context, InternetRadio.class);
        context.startActivity(intent);
    }

    public static void goToFavoritSongs (Context context){
        Intent intent = new Intent(context, FavoritSongs.class);
        context.startActivity(intent);
    }
}
