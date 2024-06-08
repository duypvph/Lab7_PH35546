package duypvph46.fpoly.lab7_ph35546.model

data class Movie(
    val id: String,
    val title: String,
    val duration: String,
    val releaseDate: String,
    val posterUrl: String,
    val genre: String,
    val national: String,
    val shotDescription: String
) {
    companion object {
        fun getSampleMovies(): List<Movie> {
            return listOf(
                Movie(
                    id = "1",
                    title = "Movie 1",
                    duration = "120 mins",
                    releaseDate = "2023-01-01",
                    posterUrl = "https://example.com/movie1.jpg",
                    genre = "Action",
                    national = "USA",
                    shotDescription = "An action-packed adventure."
                ),
                Movie(
                    id = "2",
                    title = "Movie 2",
                    duration = "90 mins",
                    releaseDate = "2023-02-01",
                    posterUrl = "https://example.com/movie2.jpg",
                    genre = "Comedy",
                    national = "USA",
                    shotDescription = "A hilarious comedy."
                ),
                Movie(
                    id = "3",
                    title = "Movie 3",
                    duration = "110 mins",
                    releaseDate = "2023-03-01",
                    posterUrl = "https://example.com/movie3.jpg",
                    genre = "Drama",
                    national = "USA",
                    shotDescription = "A gripping drama."
                )
            )
        }
    }
}
