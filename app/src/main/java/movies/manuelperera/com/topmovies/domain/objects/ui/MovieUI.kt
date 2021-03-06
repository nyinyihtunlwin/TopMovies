package movies.manuelperera.com.topmovies.domain.objects.ui

import manuelperera.com.base.screen.presenter.recyclerview.RecyclerViewAdapterItem
import movies.manuelperera.com.topmovies.domain.objects.domain.MovieAppDomain

data class MovieUI(
        val voteCount: Int = 0,
        val id: Int = 0,
        val voteAverage: Double = 0.0,
        val title: String = "",
        var posterPath: String = "",
        val genres: MutableList<Int> = mutableListOf(),
        val backdropPath: String = "",
        val overview: String? = "",
        val releaseDate: String = "",
        var rType: RecyclerViewAdapterItem.Type = RecyclerViewAdapterItem.Type.ITEM) : RecyclerViewAdapterItem {

    override fun setType(type: RecyclerViewAdapterItem.Type) {
        rType = type
    }

    override fun getType(): RecyclerViewAdapterItem.Type = rType

    fun toAppDomain(): MovieAppDomain =
            MovieAppDomain(voteCount, id, voteAverage, title, posterPath, genres, backdropPath, overview, releaseDate)

}