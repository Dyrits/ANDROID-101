/*
Android 101 - Kotlin Variables | Homework Assignment #5: Functions
 */

fun main() {
    // SONG INFORMATIONS
    val title : String = "Life" // Title
    val artist : String = "Kwoon" // Artist
    val album : String? = null // Album
    val compilation : Boolean = false // Album is a compilation of songs by various artists
    val year : Int = 2020 // Year of release
    val duration : Float = 3.52F // Duration in minutes
    val genre: String = "Rock" // Main genre

    fun getTitle() : String { return title}
    fun getArtist() : String { return artist }
    fun getAlbum() : String? { return album }
    fun getCompilation() : Boolean { return compilation}
    fun getYear() : Int { return year}
    fun getDuration() : Float { return duration}
    fun getGenre() : String { return genre}

    fun getSongInformations(vararg informations: String) {
        for (information in informations) {
            println(when (information.toLowerCase()) {
                "title" -> "Title: ${getTitle()}"
                "artist" -> "Artist: ${getArtist()}"
                "album" -> "Album: ${getAlbum()}"
                "compilation" -> "The album is ${if (getCompilation()) "a" else "not a"} compilation of songs by various artists."
                "year" -> "Year of release: ${getYear()}"
                "duration" -> "Duration: ${getDuration()} minutes"
                "genre" -> "Genre: ${getGenre()}"
                else -> "($information) Information not available"
            })
        }
    }
    getSongInformations("Title", "Artist", "Band", "Album", "Compilation", "Duration")
}

main()
