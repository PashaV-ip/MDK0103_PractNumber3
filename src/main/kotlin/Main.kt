import java.util.*
import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {
    //������ 1
    val myAge:Int = 18
    val isTeenager: Boolean = myAge in 13..19
    println(isTeenager)

    //������ 2
    val theirAge:Int = 30
    val bothTeenagers:Boolean = isTeenager == theirAge in 13..19
    println(bothTeenagers)

    //������ 3
    val reader:String = "Vanshev Pavel"
    val author:String = "Richard Lucas"
    val authorIsReader:Boolean = reader==author

    //������ 4
    val readerBeforeAuthor:Boolean = reader>author

    //������ 5
    val myAge2:Int = 18
    if(myAge2 in 13..19)
        println("���������")
    else println("�� ���������")

    //������ 6
    val answer:String = if(myAge2 in 13..19) "���������" else "�� ���������"
    println(answer)

    //������ 7
    var counter:Int = 0
    while(counter<10){
        var x:Int = counter
        counter+=1
        println(x)
    }

    //������ 8
    var counterTask8:Int = 0
    var roll: Int = 0
    do {
        roll = Random().nextInt(6)
        counterTask8 += 1
        println("����� $counterTask8 �������, roll �����: $roll")
    }while (roll != 0)

    //������ 9
    val range = 1..10
    for(i in range){
        println(i.toDouble().pow(2))
    }

    //������ 10
    for(i in range){
        println(sqrt(i.toDouble()))
    }

    //������ 11
    println("\n\n\n������ 11")
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