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

public class ListTvshowAdapter extends RecyclerView.Adapter<ListTvshowAdapter.listViewHolder> {
    private ArrayList<Tvshow> listTvshow;
    private Context context;

    public void setListTvshow(ArrayList<Tvshow> listTvshow) {
        this.listTvshow = listTvshow;
    }

    public ListTvshowAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<Tvshow> getListTvshow() {
        return listTvshow;
    }

    public ListTvshowAdapter(ArrayList<Tvshow> listTvshow) {
        this.listTvshow = listTvshow;
    }

    @NonNull
    @Override
    public listViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_tvshow_layout, parent, false);
        return new listViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull listViewHolder holder, int position) {
        Tvshow tvshow = listTvshow.get(position);
        Glide.with(holder.itemView.getContext())
                .load(tvshow.getTvPoster())
                .apply(new RequestOptions().override(620,650))
                .into(holder.imgtvPoster);
        holder.tvshowTittle.setText(tvshow.getTvTittle());
        holder.tvshowRating.setText(tvshow.getTvRating());
        holder.tvshowEpisode.setText(tvshow.getTvEpisode());
        holder.tvshowGenre.setText(tvshow.getTvGenre());
    }

    @Override
    public int getItemCount() {
        return listTvshow.size();
    }

    public class listViewHolder extends RecyclerView.ViewHolder {
        ImageView imgtvPoster;
        TextView tvshowTittle, tvshowEpisode, tvshowRating, tvshowGenre;

        public listViewHolder(@NonNull final View itemView) {
            super(itemView);
            imgtvPoster = itemView.findViewById(R.id.img_poster_tvshow);
            tvshowEpisode = itemView.findViewById(R.id.tv_episode_tvshow);
            tvshowGenre = itemView.findViewById(R.id.tv_genre_tvshow);
            tvshowRating = itemView.findViewById(R.id.tv_rating_tvshow);
            tvshowTittle = itemView.findViewById(R.id.tv_judul_tvshow);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getAdapterPosition();
                    Tvshow tvshow = getListTvshow().get(position);
                    Intent intentWithDataTvshow = new Intent(itemView.getContext(), TvshowDetailActivity.class);
                    intentWithDataTvshow.putExtra(TvshowDetailActivity.EXTRA_TVSHOW, tvshow);
                    context.startActivity(intentWithDataTvshow);
                }
            });
        }
    }
}
