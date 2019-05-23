package ifpr.com.luiz.datasource

import ifpr.com.luiz.entities.News
import io.reactivex.Completable
import io.reactivex.Single

interface NewDataSource {
    fun getAll(): Single<List<News>>
    fun insert(new: News): Single<Long>
    fun update(new: News): Completable
    fun remove(new: News): Completable
}