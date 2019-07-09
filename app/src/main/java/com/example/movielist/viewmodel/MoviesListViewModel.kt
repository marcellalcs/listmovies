package com.example.movielist.viewmodel

import android.arch.lifecycle.MutableLiveData
import com.example.movielist.model.Movie

class MoviesListViewModel {

    private lateinit var movieList: MutableLiveData<List<Movie>>

}