package com.example.android.miwok;

public class Word {

    private static final int NO_IMAGE_PROVIDED = -1;
    private static final int NO_AUDIO_PROVIDED = -1;

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mAudioResourceId = NO_AUDIO_PROVIDED;

    public Word(String defaultword, String  miwokWord, int pronunciation) {
        mDefaultTranslation = defaultword;
        mMiwokTranslation = miwokWord;
        mAudioResourceId = pronunciation;
    }

    public Word(String defaultword, String  miwokWord, int imageId, int pronunciation) {
        mDefaultTranslation = defaultword;
        mMiwokTranslation = miwokWord;
        mImageResourceId = imageId;
        mAudioResourceId = pronunciation;
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

    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    public boolean hasAudio() {
        return mAudioResourceId != NO_AUDIO_PROVIDED;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}
