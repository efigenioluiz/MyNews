package ifpr.com.luiz.network

import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query


interface NewService {
    @GET("top-headlines")
    fun getNews(
        @Query("q")
        search: String,

        @Query("country")
        country:String="br",

        @Query("apiKey")
        apiKey: String= "ade5f95190594716ae2a9e5b7eeb6a59"
    )
}