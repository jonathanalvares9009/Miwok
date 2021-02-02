package com.example.miwok;

import android.view.View;

public class Word {

    private String mDefaultTranslation, mMiwokTranslation;
    private int mImageResourceId = View.GONE;
    private int mAudioResourceId;

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    public String getDefaultTrans() {
        return mDefaultTranslation;
    }

    public String getMiwokTrans(){
        return mMiwokTranslation;
    }

    public int getImageResourceId() { return mImageResourceId; }

    public boolean isImageThere() {
        return mImageResourceId != View.GONE;
    }

    public int getAudioResourceId() { return  mAudioResourceId; }
}
