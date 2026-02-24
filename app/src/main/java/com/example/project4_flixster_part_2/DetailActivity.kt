package com.example.project4_flixster_part_2

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val movie = intent.getParcelableExtra<Movie>("MOVIE_EXTRA")

        val backdrop: ImageView = findViewById(R.id.detail_backdrop)
        val title: TextView = findViewById(R.id.detail_title)
        val releaseDate: TextView = findViewById(R.id.detail_release_date)
        val voteAverage: TextView = findViewById(R.id.detail_vote_average)
        val popularity: TextView = findViewById(R.id.detail_popularity)
        val overview: TextView = findViewById(R.id.detail_overview)

        movie?.let {
            title.text = it.title
            releaseDate.text = "Release Date: ${it.releaseDate}"
            voteAverage.text = "Rating: ${it.voteAverage}/10"
            popularity.text = "Popularity: ${it.popularity}"
            overview.text = it.overview

            Glide.with(this)
                .load(it.backdropImageUrl)
                .into(backdrop)
        }
    }
}
