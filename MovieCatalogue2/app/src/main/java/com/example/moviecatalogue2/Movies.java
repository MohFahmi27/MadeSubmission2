package com.example.moviecatalogue2;

import android.os.Parcel;
import android.os.Parcelable;

public class Movies implements Parcelable {
    private String tittle;
    private String synosis;
    private String rating;
    private String director;
    private String duration;
    private String poster;
    private String genre;

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getSynosis() {
        return synosis;
    }

    public void setSynosis(String synosis) {
        this.synosis = synosis;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.tittle);
        dest.writeString(this.synosis);
        dest.writeString(this.rating);
        dest.writeString(this.director);
        dest.writeString(this.duration);
        dest.writeString(this.poster);
        dest.writeString(this.genre);
    }

    public Movies() {
    }

    protected Movies(Parcel in) {
        this.tittle = in.readString();
        this.synosis = in.readString();
        this.rating = in.readString();
        this.director = in.readString();
        this.duration = in.readString();
        this.poster = in.readString();
        this.genre = in.readString();
    }

    public static final Parcelable.Creator<Movies> CREATOR = new Parcelable.Creator<Movies>() {
        @Override
        public Movies createFromParcel(Parcel source) {
            return new Movies(source);
        }

        @Override
        public Movies[] newArray(int size) {
            return new Movies[size];
        }
    };
}
