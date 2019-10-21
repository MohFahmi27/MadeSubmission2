package com.example.moviecatalogue2;

import android.os.Parcel;
import android.os.Parcelable;

public class Tvshow implements Parcelable {
    public String tvTittle;
    public String tvEpisode;
    public String tvGenre;
    public String tvSynopsis;
    public String tvRating;
    public String tvPoster;
    public String tvDirector;

    public String getTvTittle() {
        return tvTittle;
    }

    public void setTvTittle(String tvTittle) {
        this.tvTittle = tvTittle;
    }

    public String getTvEpisode() {
        return tvEpisode;
    }

    public void setTvEpisode(String tvEpisode) {
        this.tvEpisode = tvEpisode;
    }

    public String getTvGenre() {
        return tvGenre;
    }

    public void setTvGenre(String tvGenre) {
        this.tvGenre = tvGenre;
    }

    public String getTvSynopsis() {
        return tvSynopsis;
    }

    public void setTvSynopsis(String tvSynopsis) {
        this.tvSynopsis = tvSynopsis;
    }

    public String getTvRating() {
        return tvRating;
    }

    public void setTvRating(String tvRating) {
        this.tvRating = tvRating;
    }

    public String getTvPoster() {
        return tvPoster;
    }

    public void setTvPoster(String tvPoster) {
        this.tvPoster = tvPoster;
    }

    public String getTvDirector() {
        return tvDirector;
    }

    public void setTvDirector(String tvDirector) {
        this.tvDirector = tvDirector;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.tvTittle);
        dest.writeString(this.tvEpisode);
        dest.writeString(this.tvGenre);
        dest.writeString(this.tvSynopsis);
        dest.writeString(this.tvRating);
        dest.writeString(this.tvPoster);
        dest.writeString(this.tvDirector);
    }

    public Tvshow() {
    }

    protected Tvshow(Parcel in) {
        this.tvTittle = in.readString();
        this.tvEpisode = in.readString();
        this.tvGenre = in.readString();
        this.tvSynopsis = in.readString();
        this.tvRating = in.readString();
        this.tvPoster = in.readString();
        this.tvDirector = in.readString();
    }

    public static final Parcelable.Creator<Tvshow> CREATOR = new Parcelable.Creator<Tvshow>() {
        @Override
        public Tvshow createFromParcel(Parcel source) {
            return new Tvshow(source);
        }

        @Override
        public Tvshow[] newArray(int size) {
            return new Tvshow[size];
        }
    };
}
