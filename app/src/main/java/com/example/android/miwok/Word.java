package com.example.android.miwok;

public class Word {
    /**
     * Declaring String objects
     * private to the word class
     */
    private int mAudioResourceId;
    private static final int NO_IMAGE_PROVIDED = -1;
    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;



    /**
     * Word constructor: Setting the values of the declared objects
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId){
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Word Constructor for taking one extra input of Images Resource Id
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId){
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mAudioResourceId=" + mAudioResourceId +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }

    /**
     * getMiwokTranslation method
     */
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    /**
     * getDefaultTranslation method
     */
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public int getImageResourceId() { return mImageResourceId;}

        /**
         *  Boolean method to know if the image is provided
         */
    public boolean hasImage(){
        return mImageResourceId!=NO_IMAGE_PROVIDED;
        }

    /**
     * Returns integer Resource id of the audio file
     */
    public int getAudioResourceId(){ return mAudioResourceId; }

}

