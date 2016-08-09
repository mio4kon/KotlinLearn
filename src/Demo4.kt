/**
 * Created by mio4kon on 16/8/9.
 */


fun main(args: Array<String>) {

    val pair = Pair(1, "one")
    val pair1 = Pair(1, 2)

    val (first, second) = pair
    println("first=$first , second=$second")

    println("---------------------------------")

    val user = getUser()
    val (name,id) = getUser()
//    getUser().component1()
//    getUser().component2()

}

class Pair<K, V>(val first: K, val second: V) {
    operator fun component1(): K {
        return first
    }

    operator fun component2(): V {
        return second
    }

}

data class User(val name: String, val id: Int)

fun getUser(): User {
    return User("mio", 1)
}

