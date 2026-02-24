package com.example.project4_flixster_part_2

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Movie(
    @SerializedName("id") val id: Int,
    @SerializedName("title") val title: String,
    @SerializedName("overview") val overview: String,
    @SerializedName("poster_path") val posterPath: String?,
    @SerializedName("backdrop_path") val backdropPath: String?,
    @SerializedName("vote_average") val voteAverage: Double,
    @SerializedName("release_date") val releaseDate: String,
    @SerializedName("popularity") val popularity: Double,
    @SerializedName("vote_count") val voteCount: Int
) : Parcelable {
    val posterImageUrl: String
        get() = "https://image.tmdb.org/t/p/w500$posterPath"

    val backdropImageUrl: String
        get() = "https://image.tmdb.org/t/p/w500$backdropPath"
}

data class MovieResponse(
    @SerializedName("results") val results: List<Movie>
)
