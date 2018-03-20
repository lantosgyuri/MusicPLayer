package com.example.android.musicplayer;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by android on 2018.03.19..
 */

public class songsAdapter extends ArrayAdapter<songs> {


    public songsAdapter(Context context, ArrayList<songs> Songs) {
        super(context, 0, Songs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;

        if(listItemView == null ){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        songs currentSong = getItem(position);

        TextView titel_view = listItemView.findViewById(R.id.titel_text_view);
        titel_view.setText(currentSong.getTitel());

        TextView band_view = listItemView.findViewById(R.id.band_text_view);
        band_view.setText(currentSong.getAuthor());





        return listItemView;
    }
}
