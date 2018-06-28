package com.example.android.miwok;

public class Word {

    private static final int NO_IMAGE_PROVIDED = -1;

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    public Word(String defaultword, String  miwokWord) {
        mDefaultTranslation = defaultword;
        mMiwokTranslation = miwokWord;
    }

    public Word(String defaultword, String  miwokWord, int resourceId) {
        mDefaultTranslation = defaultword;
        mMiwokTranslation = miwokWord;
        mImageResourceId = resourceId;
    }
    public String getMiwok() {
        return mMiwokTranslation;
    }

    public String getDefault() {
        return mDefaultTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
