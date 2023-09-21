package ch1

class Person(val name: String, var age: Int)

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() {
            return height == width
        }
}


/**
 * 프로퍼티 : 필드와 접근자를 통칭한다.
 *
 * 자바에서는 데이터를 필드에 저장한다. 필드에 저장된 데이터를 호출 할 때 getter, setter와 같은 접근자로 호출한다.
 * 코틀린은 val, var를 통해 setter 제공 여부를 정할 수 있다.
 *
 */
fun main(args: Array<String>) {
    val person = Person("heemaaree", 5)
    person.age // person.getAge();
    person.age = 8 // person.setAge(8);
    person.name // person.getName();

    val rectangle = Rectangle(5, 5)
    println(rectangle.isSquare)
}


class Test{
    var name : String = ""
        set(value) {
            field = if (value.isNotEmpty()) value else ""
        }
}
