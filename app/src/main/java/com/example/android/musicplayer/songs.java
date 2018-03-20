package com.example.android.musicplayer;

/**
 * Created by android on 2018.03.19..
 */

public class songs {

    private String mAuthor;
    private String mTitel;

    public songs (String author, String titel)
    {
        mAuthor = author;
        mTitel = titel;
    }

    public String getAuthor (){
        return mAuthor;
    }

    public String getTitel(){
        return mTitel;
    }
}
