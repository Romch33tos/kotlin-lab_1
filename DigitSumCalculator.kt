class DigitSumCalculator {
  fun calculate() {
    println("Введите целое положительное число:")
    val userInput = readln()

    if (userInput.isNullOrBlank()) {
      println("Ошибка: введено пустое значение!")
      return
    }

    val number = userInput.toIntOrNull()
    if (number == null || number <= 0) {
      println("Ошибка: введите положительное целое число!")
      return
    }

    val lastDigit = number % 10
    var firstDigit = number

    while (firstDigit >= 10) {
      firstDigit /= 10
    }

    val sumOfDigits = firstDigit + lastDigit
    println("Сумма первой и последней цифры равна: $sumOfDigits")
  }
}
