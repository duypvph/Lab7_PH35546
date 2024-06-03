package duypvph46.fpoly.lab7_ph35546

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import duypvph46.fpoly.lab7_ph35546.model.Movie

class MainViewModel : ViewModel() {
    private val _movies = MutableLiveData<List<Movie>>()
    val movies: LiveData<List<Movie>> = _movies

    init {
        _movies.value = Movie.getSampleMovies()
    }
}