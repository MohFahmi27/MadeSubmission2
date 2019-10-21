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

public class MoviesDetailActivity extends AppCompatActivity {
    public static final String EXTRA_MOVIE = "";
    private TextView tvDetailTittle, tvDetailGenre, tvDetailDuration, tvDetailDirector, tvDetailRating, tvDetailSynopsis;
    private ImageView DetailPosterMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowTitleEnabled(false);
        }

        getViews();
        getParcel();
    }

    private void getViews() {
        tvDetailTittle = findViewById(R.id.tv_detail_judul);
        tvDetailDirector = findViewById(R.id.tv_detail_director);
        tvDetailDuration = findViewById(R.id.tv_detail_duration);
        tvDetailGenre = findViewById(R.id.tv_detail_genre);
        tvDetailRating = findViewById(R.id.tv_detail_rating);
        tvDetailSynopsis = findViewById(R.id.tv_detail_synopsis);
        DetailPosterMovie = findViewById(R.id.img_detail_poster);
    }

    private void getParcel() {
        Movies movies = getIntent().getParcelableExtra(EXTRA_MOVIE);

        tvDetailTittle.setText(movies.getTittle());
        tvDetailSynopsis.setText(movies.getSynosis());
        tvDetailDuration.setText(movies.getDuration());
        tvDetailRating.setText(movies.getRating());
        tvDetailDirector.setText(movies.getDirector());
        tvDetailGenre.setText(movies.getGenre());

        Glide.with(this).load(movies.getPoster()).apply(new RequestOptions().override(700,800)).into(DetailPosterMovie);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
