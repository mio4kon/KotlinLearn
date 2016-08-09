/**
 * Created by mio4kon on 16/8/8.
 */

fun main(args: Array<String>) {

    //拼接string
    var array = arrayOf("C++", "kotlin", "java")
    println("hello ,${array[0]}!")
    println("hello ,${array[1]}!")
    println("hello ,${array[2]}!")

    println("------------------------------")

    //三目运算
    var language = if (true) "C" else "Android"

    //switch
    println(when (language) {
        "C" -> "hello c"
        "java" -> "hello java"
        else -> "hello android"
    })


    println("------------------------------")

    Fucker("kotlin").fuck()

}

//类定义- 多构造呢?
class Fucker(val name:String){
    fun fuck(){
        println("fuck $name")
    }
}