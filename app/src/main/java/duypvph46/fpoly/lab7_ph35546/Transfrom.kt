package duypvph46.fpoly.lab7_ph35546

import duypvph46.fpoly.lab7_ph35546.model.Movie
import duypvph46.fpoly.lab7_ph35546.response.MovieResponse

fun MovieResponse.toMovie(): Movie {
    return Movie(
        id = this.filmId,
        title = this.filmName,
        duration = this.duration,
        releaseDate = this.releaseDate,
        genre = this.genre,
        national = national,
        shotDescription = this.description,
        posterUrl = this.image
    )
}