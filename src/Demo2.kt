/**
 * Created by mio4kon on 16/8/8.
 */

fun main(args: Array<String>) {
    var ages = arrayOf(17, 19)
    println(max(ages[0], ages[1]))
    println(min(ages[0], ages[1]))

    println(getStringLength("222")) //3
    println(getStringLength(222))   //null
}

//写法一
fun max(a: Int, b: Int) = if (a > b) a else b

//写法二
fun min(a: Int, b: Int): Int {
    return if (a > b) b else a
}


fun getStringLength(obj: Any): Int? {
    if(obj is String){
        return obj.length
    }
    return null
}
