fun main() {
  val menu = """
    Выберите задание:
    1. Задание №1
    2. Задание №2 
    3. Задание №3 
    4. Задание №4 
    5. Задание №5 
    6. Задание №6 
    7. Задание №7 
    8. Задание №8 
    9. Задание №9
    0. Выход
  """.trimIndent()

  val digitSumCalculator = DigitSumCalculator()
  val statisticsCalculator = NumberStatisticsCalculator()
  val numberGame = GuessNumberGame()
  val primeNumbersCalculator = PrimeNumbersCalculator()
  val arrayOperations = ArrayOperations()
  val equationSolver = QuadraticEquationSolver()

  while (true) {
    println(menu)
    print("Введите номер команды: ")
    val userChoice = readln()
    println()

    when (userChoice) {
      "1" -> digitSumCalculator.calculate()
      "2" -> statisticsCalculator.calculate()
      "3" -> numberGame.play()
      "4" -> primeNumbersCalculator.calculate()
      "5" -> arrayOperations.execute()
      "6" -> equationSolver.solve()
      "7" -> {
        val sampleArray = intArrayOf(2, -3, 4, 1, -5, 6)
        val arrayCalculator = ArrayCalculator(sampleArray)
        arrayCalculator.displayResults()
      }
      "8" -> {
        val firstVector = Vector(1.0, 2.0, 3.0)
        val secondVector = Vector(3.0, 2.0, 1.0)

        println("Вектор 1: (${firstVector.x}, ${firstVector.y}, ${firstVector.z})")
        println("Вектор 2: (${secondVector.x}, ${secondVector.y}, ${secondVector.z})")
        println("Длина вектора 1: ${"%.2f".format(firstVector.calculateLength())}")
        println("Скалярное произведение (метод): ${firstVector.calculateDotProduct(secondVector)}")
        println("Скалярное произведение (infix): ${firstVector dot secondVector}")
        println("Скалярное произведение (оператор): ${firstVector * secondVector}")
        println("Скалярное произведение (функция): ${calculateDotProduct(firstVector, secondVector)}")
      }
      "9" -> {
        val boat = Boat()
        val airplane = Airplane()
        val tank = Tank()

        println("Демонстрация транспортных средств:")
        boat.start()
        boat.stop()
        println()
        airplane.start()
        airplane.stop()
        println()
        tank.start()
        tank.stop()
      }
      "0" -> {
        println("Выполнение программы завершено.")
        break
      }
      else -> println("Некорректный ввод. Попробуйте снова.")
    }
    println()
  }
}
