import kotlin.reflect.KProperty

/**
 * Created by mio4kon on 16/8/9.
 *
 * Delegation
 *
 * 有一些种类的属性，虽然我们可以在每次需要的时候手动实现它们，但是如果能够把他们只实现一次
 * 并放入一个库同时又能够一直使用它们那会更好。
 * 例如：
 * - 延迟属性（lazy properties）: 数值只在第一次被访问的时候计算。
 * - 可观察属性（observable properties）: 监听器得到关于这个特性变化的通知，
 * - 把所有属性储存在一个map中，而不是每个在单独的字段里。
 */

class Example {
    var p: String by Delegate()
}

class Delegate {

    //第一变量就是我们从 p 读取的实例,第二个变量代表 p 自身的描述
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef, thank you for delegating '${property.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$value has been assigned to '${property.name} in $thisRef.'")
    }
}

//延迟属性:数值只在第一次被访问的时候计算
class SquareOnce(x: Int) {
    val squareValue: Int by lazy() {
        var date = caculate(x)
        date
    }
}


fun caculate(x: Int): Int {
    println("Square....")
    return x * x
}

fun main(args: Array<String>) {
    val e = Example()
    println(e.p)
    e.p = "NEW"

    println("--------------------------")

    var square = SquareOnce(2)
    println(square.squareValue)
    println(square.squareValue)

}