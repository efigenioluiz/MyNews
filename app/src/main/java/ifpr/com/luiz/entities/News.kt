package ifpr.com.luiz.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity("news")
data class News(
    var status: Boolean,
    var title: String,
    var description: String
    ) {
    @PrimaryKey
    var id:Long=0

    override fun equals(other: Any?): Boolean {
        other != null && (this === other || (this.id != 0L && this.id == (other as News).id))
    }
}