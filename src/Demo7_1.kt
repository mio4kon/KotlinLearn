import java.util.*

/**
 * Created by mio4kon on 16/8/10.
 * Function
 * 可变参数
 * 函数可以是参数/返回值
 *
 * eg:compose(f, g) = f(g(*)).
 */


//vararg可变参数
fun <T> asList(vararg ts: T): List<T> {
    val result = ArrayList<T>()
    for (t in ts) {
        result.add(t)
    }
    return result
}


fun isOdd(x: Int) = x % 2 != 0

fun length(s: String) = s.length

fun <A, B, C> compose(f: (B) -> C, g: (A) -> B): (A) -> C {
    return { x -> f(g(x)) }
}


fun main(args: Array<String>) {
    var list = asList(1, 2, 3, 4)
    var arr = arrayOf(6, 7, 8)
    var list2 = asList(1, 2, 3, *arr, 4)
    println(list)
    println(list2)

    //::函数可以是参数/返回值
    val numbers = listOf(1, 2, 3)
    println(numbers.filter(::isOdd))

    //f(g(x))
    val oddLength = compose(::isOdd, ::length)
    val strings = listOf("a","aa","abc")
    println(strings.filter(oddLength))
}



