package ch1

enum class Color {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}

enum class RGB(
    val r: Int, val g: Int, val b: Int
) {
    RED(255, 0, 0),
    ORANGE(255, 165, 0),
    YELLOW(0, 255, 0); // 마지막은 세미콜론 필수

    fun rgb() = (r * 256 + g) * 256 + b // enum 메서드 정의
}
