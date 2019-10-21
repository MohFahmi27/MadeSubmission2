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
public class TvshowFragment extends Fragment {
    private RecyclerView rvTvshow;
    private ArrayList<Tvshow> listTvshow = new ArrayList<>();

    public TvshowFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewview =  inflater.inflate(R.layout.fragment_tvshow, container, false);
        rvTvshow = viewview.findViewById(R.id.rv_tvshow);
        rvTvshow.setHasFixedSize(true);

        listTvshow.addAll(TvshowData.getListDataTvshow());
        showRecyclerView();
        return viewview;
    }

    private void showRecyclerView() {
        rvTvshow.setLayoutManager(new LinearLayoutManager(this.getContext()));
        ListTvshowAdapter listTvshowAdapter = new ListTvshowAdapter(this.getContext());
        listTvshowAdapter.setListTvshow(listTvshow);
        rvTvshow.setAdapter(listTvshowAdapter);
    }

}
