package duypvph46.fpoly.lab7_ph35546
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import duypvph46.fpoly.lab7_ph35546.model.Movie
import duypvph46.fpoly.lab7_ph35546.service.RetrofitService
import kotlinx.coroutines.launch
class MovieViewModel : ViewModel() {
    private val _movies = MutableLiveData<List<Movie>>()
    val movies: LiveData<List<Movie>> = _movies

    init {
        getMovies()
    }

    fun getMovies() {
        viewModelScope.launch {
            try {
                val response = RetrofitService().movieService.getListFilms()
                if (response.isSuccessful){
                    _movies.postValue(response.body()?.map { it.toMovie() })
                }else{
                    _movies.postValue(emptyList())
                }
            }catch (e: Exception){
                Log.e("TAG", "getMovies: ${e.message}")
                _movies.postValue(emptyList())
            }
        }
    }


}