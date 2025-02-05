package org.example

import org.jsoup.Jsoup

fun main() {

    val doc =
        Jsoup.connect("https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/")
            .get()

    val searchTag = "article"
    val quoteElements = doc.select(searchTag)
    for (element in quoteElements) {
        println(element.text())
    }
}