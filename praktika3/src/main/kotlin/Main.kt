import java.util.*

fun main(args: Array<String>) {
//Задание 1
    val myAge: Int = 18
    var isTeenager: Boolean = myAge>13&&myAge<19
    println(isTeenager)

//Задание 2
val theirAge: Int = 30
val bothTeenagers: Boolean = (myAge<19&&theirAge<19)&&myAge>13&&theirAge>13
println(bothTeenagers)
//Задание 3
    val reader: String = "Vitaliy"
    val author: String = "Richard Lucas"
    val authorIsReader: Boolean = reader == author
    println(authorIsReader)
        //Задание 4

 val readerBeforeAuthor = "$reader"<"$author"
    println(readerBeforeAuthor)
    //задание 5
    val myAge2: Int = 18
    if (myAge2<19&&myAge2>13) {
        println("Подросток")
    }else{
        println("Не подросток")

        }

//задание 6

//Задание 7
var counter : Int = 0
while (counter < 10) {
    println("$counter")
    counter += 1
    }

        //задание 8
counter = 0
var roll = 0
do {
    roll = Random().nextInt(6)
    counter += 1
    println("После $counter бросков, roll равен $roll")
} while (roll != 0)


//задание 9
val range = 1..10

    for (i in range) {
        val pow = i * i
        println("$pow")


    }
}









