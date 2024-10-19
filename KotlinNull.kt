fun main() {
    val instagramBio: String? = "growth"
    if(instagramBio != null) {
        println(instagramBio.toUpperCase())
    }
    println(instagramBio?.toUpperCase())
}