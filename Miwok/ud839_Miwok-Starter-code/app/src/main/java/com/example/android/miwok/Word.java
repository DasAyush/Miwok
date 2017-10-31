package com.example.android.miwok;

import android.content.Context;
import android.location.Address;
import android.widget.TextView;

/**
 * Created by dell pc on 24-06-2017.
 */
public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mAudioResourceId;

    public Word(String defaultTranslation,String miwokTranslation,int audioResourceId)
    {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    public Word(String defaultTranslation,String miwokTranslation,int imageResourceId,int audioResourceId)
    {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }
    public String getDefaultTranslation()
    {
        return mDefaultTranslation;
    }
    public String getMiwokTranslation()
    {
        return mMiwokTranslation;
    }
    public int getImageResourceId(){ return mImageResourceId; }
    public int getAudioResourceId(){ return mAudioResourceId; }

    public boolean hasImage()
    {
        boolean result = mImageResourceId!=NO_IMAGE_PROVIDED;
        return result;
    }

}

