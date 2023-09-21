package ch1

val value = 1 // immutable, 자바의 final
var variable = 1 // mutable

/**
 * val 키워드를 우선적으로 사용해 불변 변수를 선언하고, 추후 변경이 필요한 경우 var로 변경
 * 자바의 final 키워드를 붙히는 번거로움이 없어짐.
 */
fun main() {
//    var variableWithNothing // ERROR
    var variableWithNothing: Int // 초기화를 나중에 할 경우, 반드시 타입 명시해야함.

    var answer = 42
//    answer = "42" // ERROR, 변수의 값은 변경이 가능하지만, 변수의 타입은 고정됨.
}
