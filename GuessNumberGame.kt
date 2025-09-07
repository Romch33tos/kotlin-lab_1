class GuessNumberGame {
  fun play() {
    val secretNumber = (0..10).random()
    println("Введите число от 0 до 10:")
    var attemptsCount = 0

    while (true) {
      val userInput = readln()
      val userGuess = userInput.toIntOrNull()

      if (userGuess == null) {
        println("Ошибка: введите целое число!")
        continue
      }

      ++attemptsCount

      when {
        userGuess > secretNumber -> println("Загаданное число меньше!")
        userGuess < secretNumber -> println("Загаданное число больше!")
        else -> {
          println("Вы угадали!")
          break
        }
      }
    }
  }
}