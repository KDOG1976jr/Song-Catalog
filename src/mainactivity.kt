fun main() {
    val mellySong = Song("Save Me", "YNW Melly", 2024, 1_000_000)
    mellySong.printDescription()
    println(mellySong.isPopular)
}
class Song(
    val title: String,
    val artist: String,
    val yearPublished: Int,
    val playCount: Int
){
    val isPopular: Boolean
        get() = playCount >= 1000

    fun printDescription() {
        println("$title, performed by $artist, was released in $yearPublished.")
    }
}