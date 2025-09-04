fun main() {
  val menu = """
        Выберите задание:
        1. Задание №1
        0. Выход
    """.trimIndent()

  val calculator = DigitSumCalculator()

  while (true) {
    println(menu)
    print("Введите номер команды: ")
    val choice = readLine()
    when (choice) {
      "1" -> calculator.calculate()
      "0" -> {
        println("Выполнение программы завершено.")
        break
      }
      else -> println("Некорректный ввод. Попробуйте снова.")
    }
    println()
  }
}
