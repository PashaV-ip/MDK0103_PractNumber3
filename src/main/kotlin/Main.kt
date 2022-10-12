import java.util.*
import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {
    //Задача 1
    val myAge:Int = 18
    val isTeenager: Boolean = myAge in 13..19
    println(isTeenager)

    //Задача 2
    val theirAge:Int = 30
    val bothTeenagers:Boolean = isTeenager == theirAge in 13..19
    println(bothTeenagers)

    //Задача 3
    val reader:String = "Vanshev Pavel"
    val author:String = "Richard Lucas"
    val authorIsReader:Boolean = reader==author

    //Задача 4
    val readerBeforeAuthor:Boolean = reader>author

    //Задача 5
    val myAge2:Int = 18
    if(myAge2 in 13..19)
        println("Подросток")
    else println("Не подросток")

    //Задача 6
    val answer:String = if(myAge2 in 13..19) "Подросток" else "Не подросток"
    println(answer)

    //Задача 7
    var counter:Int = 0
    while(counter<10){
        var x:Int = counter
        counter+=1
        println(x)
    }

    //Задача 8
    var counterTask8:Int = 0
    var roll: Int = 0
    do {
        roll = Random().nextInt(6)
        counterTask8 += 1
        println("После $counterTask8 бросков, roll равен: $roll")
    }while (roll != 0)

    //Задача 9
    val range = 1..10
    for(i in range){
        println(i.toDouble().pow(2))
    }

    //Задача 10
    for(i in range){
        println(sqrt(i.toDouble()))
    }

    //Задача 11
    println("\n\n\nЗадача 11")
    var sum = 0
    for(row in 1..8 step 2) {
        if(row % 2 == 0) {

        }

        for(column in 0 until 8) {
            sum += row * column
            println(sum)
        }
    }
}