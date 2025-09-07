class NumberStatisticsCalculator {
  fun calculate() {
    println("Введите числа. Чтобы завершить, введите 0:")
    var numbersCount = 0
    var numbersSum = 0

    while (true) {
      val userInput = readln().toIntOrNull()
      if (userInput == null) {
        println("Ошибка: введите целое число!")
        continue
      }
      if (userInput == 0) {
        break
      }
      ++numbersCount
      numbersSum += userInput
    }

    if (numbersCount > 0) {
      val averageValue = numbersSum.toDouble() / numbersCount
      println("Количество чисел: $numbersCount")
      println("Сумма чисел: $numbersSum")
      println("Среднее арифметическое: ${"%.2f".format(averageValue)}")
    } else {
      println("Вы не ввели числа!")
    }
  }
}