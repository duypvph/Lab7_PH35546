package duypvph46.fpoly.lab7_ph35546.service
import duypvph46.fpoly.lab7_ph35546.response.MovieResponse
import retrofit2.Response
import retrofit2.http.GET
interface MovieService {
    @GET("Movies")
    suspend fun getListFilms(): Response<List<MovieResponse>>
}