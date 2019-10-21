package com.example.moviecatalogue2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListMovieAdapter extends RecyclerView.Adapter<ListMovieAdapter.ListViewHolder> {
    private Context context;
    private ArrayList<Movies> listMovie;

    public void setListMovie(ArrayList<Movies> listMovie) {
        this.listMovie = listMovie;
    }

    public ListMovieAdapter(Context context) {
        this.context = context;
    }

    public ListMovieAdapter(ArrayList<Movies> listMovie) {
        this.listMovie = listMovie;
    }

    public ArrayList<Movies> getListMovie() {
        return listMovie;
    }


    @NonNull
    @Override

    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_movies_layout, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, final int position) {
        Movies movies = listMovie.get(position);

        Glide.with(holder.itemView.getContext())
                .load(movies.getPoster())
                .apply(new RequestOptions().override(600,650))
                .into(holder.posterMovie);

        holder.tvJudul.setText(movies.getTittle());
        holder.tvGenre.setText(movies.getGenre());
        holder.tvRating.setText(movies.getRating());
        holder.tvDuration.setText(movies.getDuration());
    }

    @Override
    public int getItemCount() {
        return listMovie.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView posterMovie;
        TextView tvJudul,tvDuration,tvRating,tvGenre;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            posterMovie = itemView.findViewById(R.id.img_poster_movies);
            tvJudul = itemView.findViewById(R.id.tv_judul_movies);
            tvDuration = itemView.findViewById(R.id.tv_duration_movie);
            tvRating = itemView.findViewById(R.id.tv_rating_movie);
            tvGenre = itemView.findViewById(R.id.tv_genre_movie);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int position = getAdapterPosition();
            Movies movies = getListMovie().get(position);
            Intent moveIntent = new Intent(itemView.getContext(), MoviesDetailActivity.class);
            moveIntent.putExtra(MoviesDetailActivity.EXTRA_MOVIE, movies);
            context.startActivity(moveIntent);
        }
    }
}
