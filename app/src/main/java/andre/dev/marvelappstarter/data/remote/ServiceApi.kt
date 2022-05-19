package andre.dev.marvelappstarter.data.remote

import andre.dev.marvelappstarter.data.model.character.CharacterModelResponse
import andre.dev.marvelappstarter.data.model.comic.ComicModelResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ServiceApi {

    @GET("characters")
    suspend fun list(
        @Query("nameStartsWiths") nameStartWith: String? = null
    ): Response<CharacterModelResponse>

    @GET("characters/{characterId}")
    suspend fun getComics(
        @Path(
            "characterId",
            encoded = true
        ) characterId: Int
    ): Response<ComicModelResponse>
}
