/**
 * Created by mio4kon on 16/8/11.
 *
 * ::也可以来访问Kotlin中的顶级类的属性
 */


var x = 1
var strs = listOf("a", "bc", "def")



fun main(args: Array<String>) {
    println(::x)            //var x: kotlin.Int
    println(::x.get())      //1
    println(strs.map(String::length))
}