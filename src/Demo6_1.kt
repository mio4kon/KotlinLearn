/**
 * Created by mio4kon on 16/8/9.
 *
 * Delegation
 */

interface Base {
    fun println()
}

class BaseImpl(var x: Int) : Base {
    override fun println() {
        println(x)
    }
}

class BaseImpl2(var x: Int) : Base {
    override fun println() {
        println(x + 1)
    }
}

//b will be stored internally in objects of Derived and
// the compiler will generate all the methods of Base that forward to b.
class Derived(b: Base) : Base by b

fun main(args: Array<String>) {
    val b = BaseImpl(100)
    val b2 = BaseImpl2(100)
    Derived(b).println()
    Derived(b2).println()
}


