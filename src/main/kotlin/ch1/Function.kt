package ch1

/**
 * - 함수의 선언은 fun 키워드로 시작
 * - 매개변수는 변수이름 : 데이터 타입으로 구성
 */
fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

/**
 * - 코틀린의 if는 문장이 아니고 결과를 만드는 식
 * - 코틀린의 if는 'expression' 이지 'statement' 가 아니다.
 * - 'expression' 은 값을 만들어 내며, 다른 식의 하위 요소에 참여 가능
 */
fun maxExpression(x: Int, y: Int): Int = if (x > y) x else y

/**
 * **식이 본문인 함수**
 *
 * 본문이 중괄호로 둘러싸인 함수를 블록이 본문인 함수라고 한다.
 * 장점 : 컴파일러가 함수 본문 식을 분석해 식의 결과 타입을 함수 반환 타입으로 정해준다. (타입 추론)
 *
 */
fun maxExpressionWithoutReturnType(x: Int, y: Int)/**/ = if (x > y) x else y

