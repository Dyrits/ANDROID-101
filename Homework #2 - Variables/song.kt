/*
Android 101 - Kotlin Variables | Homework Assignment #2: Variables
 */

fun main() {
    // SONG
    val title : String = "Life" // Title
    val artist : String = "Kwoon" // Artist
    val album : String? = null // Album
    val compilation : Boolean = false // Album is a compilation of songs by various artists
    val genre: String = "Rock" // Main genre
    val year : Int = 2020 // Year of release
    val duration : Float = 3.52F // Duration in minutes

	// Print metadata:
    println("Title: " + title)
    println("Artist: " + artist)
    println("Album: " + album)
    println("Compilation: " + compilation)
    println("Year of release: " + year)
    println("Duration: " + duration)
}