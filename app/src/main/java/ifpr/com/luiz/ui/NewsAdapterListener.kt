package ifpr.com.luiz.ui

import ifpr.com.luiz.entities.News

interface NewsAdapterListener {

    fun newsSaved(news: News)
    fun newsRemoved(news: News)
}