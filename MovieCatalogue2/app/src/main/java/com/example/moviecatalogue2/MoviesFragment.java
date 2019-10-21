package com.example.moviecatalogue2;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class MoviesFragment extends Fragment {
    private RecyclerView rvMovies;
    private ArrayList<Movies> listMovies = new ArrayList<>();

    public MoviesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_movies, container, false);
        rvMovies = view.findViewById(R.id.rv_movie);
        rvMovies.setHasFixedSize(true);

        listMovies.addAll(MoviesData.getListDataMovies());
        showRecyclerView();
        return view;
    }

    private void showRecyclerView() {
        rvMovies.setLayoutManager(new LinearLayoutManager(this.getContext()));
        ListMovieAdapter listMovieAdapter = new ListMovieAdapter(this.getContext());
        listMovieAdapter.setListMovie(listMovies);
        rvMovies.setAdapter(listMovieAdapter);
    }
}
