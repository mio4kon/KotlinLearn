import kotlin.properties.Delegates

/**
 * Created by mio4kon on 16/8/9.
 *
 * Delegation
 * 可观察属性 Observable
 */


class Subject {
    //被赋值的属性，旧的值,新的值
    var name: String by Delegates.observable("") {
        prop, old, new ->
        println("${prop.name}的值变化了,原来为:$old ,现在为 $new")
    }
}

fun main(args: Array<String>) {
    val subject = Subject()
    subject.name = "first"
    subject.name = "second"

    var foo = Foo()
//    println(foo.x) IllegalStateException
    foo.init(100)
    println(foo.x)

    println("---------------------------------")

    //把属性储存在一个map
    val user = User1(mapOf(
            "name" to "John Doe",
            "age" to 25
    ))

    println("name = ${user.name}, age = ${user.age}")
}

class Foo {
    var x by Delegates.notNull<Int>()

    fun init(x: Int) {
        this.x = x
    }
}

class User1(val map: Map<String, Any?>) {
    val name: String by map
    val age: Int     by map
}