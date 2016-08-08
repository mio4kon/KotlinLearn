/**
 * Created by mio4kon on 16/8/8.
 */


fun main(args: Array<String>) {
    var citys = arrayOf("SH", "BJ", "GD")

    var i = 0

    while (i < citys.size) {
        println(citys[i++])
    }

    for (i in citys.indices) {
        println(citys[i] + "-1")
    }

    for (city in citys) {
        println(city + "-2")
    }

    //判断在区间内[a,b]
    var x = 2
    val y = 10
    if (x in 1..y - 1)
        println("OK")

    //遍历区间
    for (a in 2..5) {
        println("a is : $a")
    }

    var array = arrayListOf<String>()
    array.add("aaa")
    array.add("bbb")
    array.add("ccc")
    if ("aaa" in array){
        println("array contains aaa")
    }

}