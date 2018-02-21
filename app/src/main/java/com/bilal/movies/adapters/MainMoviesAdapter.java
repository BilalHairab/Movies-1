package com.bilal.movies.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bilal.movies.R;
import com.bilal.movies.models.Movie;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bilal on 21/02/2018.
 */

public class MainMoviesAdapter extends RecyclerView.Adapter<MainMoviesAdapter.MovieHolder> {
    private Context context;
    private List<Movie> movies = new ArrayList<>();

    public MainMoviesAdapter(List<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public MovieHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_movie, parent, false);
        return new MovieHolder(view);
    }

    @Override
    public void onBindViewHolder(MovieHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    class MovieHolder extends RecyclerView.ViewHolder {

        MovieHolder(View itemView) {
            super(itemView);
        }
    }
}
