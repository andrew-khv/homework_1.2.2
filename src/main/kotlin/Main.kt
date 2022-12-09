fun main() {
    val likes = 100
    if( likes % 10 == 0 || ( likes % 10 >= 5 && likes % 10 <= 9 )) println("У вас $likes лайков")
    else if ( likes % 10 >= 2 && likes % 10 <= 4 ) println("У вас $likes лайка")
    else println("У вас $likes лайк")
}