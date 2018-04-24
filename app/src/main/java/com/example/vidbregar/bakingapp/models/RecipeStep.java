package com.example.vidbregar.bakingapp.models;

import android.os.Parcel;
import android.os.Parcelable;

class RecipeStep implements Parcelable {
    private int stepId;
    private String description;
    private String shortDescription;
    private String videoUrl;
    private String thumbnailUrl;

    public RecipeStep(int stepId, String description, String shortDescription, String videoUrl, String thumbnailUrl) {
        this.stepId = stepId;
        this.description = description;
        this.shortDescription = shortDescription;
        this.videoUrl = videoUrl;
        this.thumbnailUrl = thumbnailUrl;
    }

    public RecipeStep(Parcel in) {
        stepId = in.readInt();
        description = in.readString();
        shortDescription = in.readString();
        videoUrl = in.readString();
        thumbnailUrl = in.readString();
    }

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public RecipeStep createFromParcel(Parcel in) {
            return new RecipeStep(in);
        }

        public RecipeStep[] newArray(int size) {
            return new RecipeStep[size];
        }
    };

    public int getStepId() {
        return stepId;
    }

    public String getDescription() {
        return description;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(stepId);
        dest.writeString(description);
        dest.writeString(shortDescription);
        dest.writeString(videoUrl);
        dest.writeString(thumbnailUrl);
    }
}
