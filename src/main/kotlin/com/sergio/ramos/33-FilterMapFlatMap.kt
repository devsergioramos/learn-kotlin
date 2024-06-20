package com.sergio.ramos

data class Albums(val title: String, val year: Int, val chartUK: Int, val chartUS: Int, val tracks: List<Tracks> = listOf())

data class Tracks(val title: String, val durationInSeconds: Int)

val albums = listOf(
    Albums("The Dark Side of the Moon", 1973, 2, 1, listOf(
        Tracks("Speak to Me", 90),
        Tracks("Breathe", 163),
        Tracks("On the Run", 216),
        Tracks("Time", 421),
        Tracks("The Great Gig in the Sky", 276),
        Tracks("Money", 382),
        Tracks("Us and Them", 462),
        Tracks("Any Colour You Like", 205),
        Tracks("Brain Damage", 228),
        Tracks("Eclipse", 123)
    )),
    Albums("The Wall", 1979, 3, 1, listOf(
        Tracks("In the Flesh?", 156),
        Tracks("The Thin Ice", 134),
        Tracks("Another Brick in the Wall (Part 1)", 228),
        Tracks("The Happiest Days of Our Lives", 111),
        Tracks("Another Brick in the Wall (Part 2)", 248),
        Tracks("Mother", 334),
        Tracks("Goodbye Blue Sky", 123),
        Tracks("Empty Spaces", 155),
        Tracks("Young Lust", 203),
        Tracks("One of My Turns", 223),
        Tracks("Don't Leave Me Now", 283),
        Tracks("Another Brick in the Wall (Part 3)", 91),
        Tracks("Goodbye Cruel World", 38)
    )),
    Albums("Wish You Were Here", 1975, 1, 1, listOf(
        Tracks("Shine On You Crazy Diamond (Parts I–V)", 810),
        Tracks("Welcome to the Machine", 448),
        Tracks("Have a Cigar", 308),
        Tracks("Wish You Were Here", 334),
        Tracks("Shine On You Crazy Diamond (Parts VI–IX)", 755)
    )),
    Albums("Animals", 1977, 2, 3, listOf(
        Tracks("Pigs on the Wing 1", 53),
        Tracks("Dogs", 1042),
        Tracks("Pigs (Three Different Ones)", 1135),
        Tracks("Sheep", 766),
        Tracks("Pigs on the Wing 2", 91)
    ))
)

fun albumAndTrackLowerThanXSeconds(durationInSeconds: Int, albums: List<Albums>): List<Pair<String, String>> {
    return albums.flatMap {
        val album = it.title

        it.tracks.filter { track -> track.durationInSeconds < durationInSeconds }
            .map { filteredTrack -> Pair(album, filteredTrack.title) }
    }
}

fun main(args: Array<String>) {
    for (album in albums) {
        if (album.chartUK == 1) {
            println("For filtered title: ${album.title}")
        }
    }

    albums.forEach {
        album -> if (album.chartUK == 1) println("ForEach filtered title: ${album.title}")
    }

    val filteredAlbums = albums.filter { it.chartUK == 1 }

    filteredAlbums.forEach {
        println("Filtered title: ${it.title}")
    }

    println(filteredAlbums)

    //    albums.filter { it.chartUS == 1 }.forEach { println("Filtered title: ${it.title}") }

    val titles = albums.filter { it.chartUS == 1 }.map { Pair(it.title, it.year) }
    println(titles)

    albumAndTrackLowerThanXSeconds(200, albums).forEach { println(it.first) }
}