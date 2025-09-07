class ArrayCalculator(private val numbersArray: IntArray) {
  fun sumPositive(): Int {
    return numbersArray.filter { it > 0 }.sum()
  }

  fun calculateProduct(): Int {
    return numbersArray.reduce { accumulator, value -> accumulator * value }
  }

  fun calculateAverage(): Double {
    return numbersArray.average()
  }

  fun displayResults() {
    println("Массив: ${numbersArray.joinToString()}")
    println("Сумма положительных элементов: ${sumPositive()}")
    println("Произведение элементов: ${calculateProduct()}")
    println("Среднее арифметическое: ${"%.2f".format(calculateAverage())}")
  }
}