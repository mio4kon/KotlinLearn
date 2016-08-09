/**
 * Created by mio4kon on 16/8/9.
 */
fun main(args: Array<String>) {
    val map = hashMapOf<String, Int>()
    map.put("one", 1)
    map.put("two", 2)

    for ((key, value) in map) {
        println("key:$key,value:$value")
    }

    println("-------------------------------------")

    val people = People("mio", 18)
    println(people)

    var people2 = People("mio", 18)
    var people3 = People("mio", 20)

    println(people == people2)
    println(people == people3)
    println(people.copy())
    println(people.copy("mio4kon"))
    println(people.copy(age = 30))
}

data class People(val name: String, val age: Int)