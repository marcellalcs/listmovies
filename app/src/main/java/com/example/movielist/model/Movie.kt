package com.example.movielist.model

data class Movie (val title: String,
                  val year: Int,
                  val reted: String,
                  val released: String,
                  val runTime: String,
                  val genre: String,
                  val director: String,
                  val writer: String,
                  val actors: String,
                  val plot: String,
                  val language: String,
                  val country: String,
                  val awards: String,
                  val poster: String,
                  val ratings: List<MovieRate>,
                  val metaScore: Int,
                  val imdbRating: String,
                  val imbdVotes: String,
                  val imdbID: Int,
                  val type: String,
                  val dvd: String,
                  val boxOffice: String,
                  val production: String,
                  val website: String,
                  val response: Boolean){

}