package ch1

fun main(args: Array<String>) {
    val name = if (args.size > 0) args[0] else "Kotlin"
    println("hi ${name}") // 입력값이 하나일 때 중괄호 생략 가능
    println("hi $name") // Remove curly braces.
}
