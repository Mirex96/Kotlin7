// 7. Написать функцию, которая возвращает сумму функции 5 и 6. (Подсказка: вызов функции в функции)
fun main() {
    val number1 = 5
    val number2 = 6
    println(sum(number1, number2))
}

fun sum(number1: Int, number2: Int): Int {
    return number1 + number2

}