package com.example.moviecatalogue2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class TvshowDetailActivity extends AppCompatActivity {
    public static final String EXTRA_TVSHOW = "";
    private TextView tvDetailTittle, tvDetailGenre, tvDetailDuration, tvDetailDirector, tvDetailRating, tvDetailSynopsis;
    private ImageView DetailPosterMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tvshow_detail);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowTitleEnabled(false);
        }

        getViews();
        getParcelTvshow();
    }

    private void getViews() {
        tvDetailTittle = findViewById(R.id.tv_detail_tvshowjudul);
        tvDetailDirector = findViewById(R.id.tv_detail_tvshowdirector);
        tvDetailDuration = findViewById(R.id.tv_detail_duration);
        tvDetailGenre = findViewById(R.id.tv_detail_tvshowgenre);
        tvDetailRating = findViewById(R.id.tv_detail_rating);
        tvDetailSynopsis = findViewById(R.id.tv_detail_tvshowsynopsis);
        DetailPosterMovie = findViewById(R.id.img_detail_tvshowposter);
    }

    private void getParcelTvshow() {
        Tvshow tvshow = getIntent().getParcelableExtra(EXTRA_TVSHOW);
        tvDetailTittle.setText(tvshow.getTvTittle());
        tvDetailGenre.setText(tvshow.getTvGenre());
        tvDetailDuration.setText(tvshow.getTvEpisode());
        tvDetailDirector.setText(tvshow.getTvDirector());
        tvDetailSynopsis.setText(tvshow.getTvSynopsis());
        tvDetailRating.setText(tvshow.getTvRating());

        Glide.with(this).load(tvshow.getTvPoster()).apply(new RequestOptions().override(700, 800)).into(DetailPosterMovie);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
