package org.example

import org.jsoup.Jsoup

fun main() {

    val doc =
        Jsoup.connect("https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/")
            .get()

    val searchClass = ".sc-2aegk7-2"
    val quoteElements = doc.select(searchClass)
    for (element in quoteElements) {
        println(element.text())
    }
}