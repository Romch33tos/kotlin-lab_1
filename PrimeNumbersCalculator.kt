class PrimeNumbersCalculator {
  fun calculate() {
    println("Введите количество простых чисел:")
    val primesCount = readln().toIntOrNull()

    if (primesCount == null || primesCount <= 0) {
      println("Ошибка: введите положительное целое число!")
      return
    }

    var foundPrimesCount = 0
    var currentNumber = 2

    while (foundPrimesCount < primesCount) {
      if (isPrime(currentNumber)) {
        foundPrimesCount++
        println("$foundPrimesCount-ое число: $currentNumber")
      }
      currentNumber++
    }
  }

  private fun isPrime(number: Int): Boolean {
    if (number < 2) return false
    for (divisor in 2 until number) {
      if (number % divisor == 0) return false
    }
    return true
  }
}