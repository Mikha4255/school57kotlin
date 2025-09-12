package ru.tbank.education.school.lesson1

/**
 * Метод для вычисления простых арифметических операций.
 */
fun calculate(
    a: Double, b: Double, operation: OperationType = OperationType.ADD): Double? {
    val result = when (operation) {
        OperationType.ADD -> a + b
        OperationType.SUBTRACT -> a - b
        OperationType.MULTIPLY -> a * b
        OperationType.DIVIDE -> if (b != 0.0) a / b else null
    }

    result?.let { println("$it") }
        ?: println("Ошибка: деление на ноль невозможно")
    return result
}


fun main() {
    calculate(10.0, 5.0)
    calculate(10.0, 5.0, OperationType.MULTIPLY)
    calculate(10.0, 0.0, OperationType.DIVIDE)
}
/**
 * Функция вычисления выражения, представленного строкой
 * @return результат вычисления строки или null, если вычисление невозможно
 * @sample "5 * 2".calculate()
 */
@Suppress("ReturnCount")
fun String.calculate(): Double? {
    TODO()
}
