class ArrayOperations {
  fun execute() {
    val numbersArray = intArrayOf(1, 3, 2, 5, 4, 6, 3, 7)
    println("Исходный массив: ${numbersArray.joinToString()}")

    println("\nЭлементы больше соседних:")
    findPeaksWithFor(numbersArray)
    findPeaksWithWhile(numbersArray)
    findPeaksWithForEach(numbersArray)

    println("\n\nОперации с массивом:")
    calculateWithFor(numbersArray)
    calculateWithWhile(numbersArray)
    calculateWithForEach(numbersArray)
    calculateWithReduce(numbersArray)
    calculateWithMinMax(numbersArray)
  }

  private fun findPeaksWithFor(array: IntArray) {
    print("Через цикл for: ")
    for (index in 1 until array.size - 1) {
      if (array[index] > array[index-1] && array[index] > array[index+1]) {
        print("${array[index]} ")
      }
    }
    println()
  }

  private fun findPeaksWithWhile(array: IntArray) {
    print("Через цикл while: ")
    var index = 1
    while (index < array.size - 1) {
      if (array[index] > array[index-1] && array[index] > array[index+1]) {
        print("${array[index]} ")
      }
      ++index
    }
    println()
  }

  private fun findPeaksWithForEach(array: IntArray) {
    print("Через цикл ForEach: ")
    array.forEachIndexed { currentIndex, currentValue ->
      if (currentIndex > 0 && currentIndex < array.size - 1 &&
        currentValue > array[currentIndex-1] && currentValue > array[currentIndex+1]) {
        print("$currentValue ")
      }
    }
  }

  private fun calculateWithFor(array: IntArray) {
    var productResult = 1
    var minValue = array[0]
    var maxValue = array[0]

    for (element in array) {
      productResult *= element
      if (element < minValue) minValue = element
      if (element > maxValue) maxValue = element
    }

    println("Цикл for\nПроизведение: $productResult, Min: $minValue, Max: $maxValue")
  }

  private fun calculateWithWhile(array: IntArray) {
    var productResult = 1
    var minValue = array[0]
    var maxValue = array[0]
    var currentIndex = 0

    while (currentIndex < array.size) {
      productResult *= array[currentIndex]
      if (array[currentIndex] < minValue) minValue = array[currentIndex]
      if (array[currentIndex] > maxValue) maxValue = array[currentIndex]
      currentIndex++
    }

    println("Цикл while\nПроизведение: $productResult, Min: $minValue, Max: $maxValue")
  }

  private fun calculateWithForEach(array: IntArray) {
    var productResult = 1
    var minValue = array[0]
    var maxValue = array[0]

    array.forEach {
      productResult *= it
      if (it < minValue) minValue = it
      if (it > maxValue) maxValue = it
    }

    println("Цикл forEach\nПроизведение: $productResult, Min: $minValue, Max: $maxValue")
  }

  private fun calculateWithReduce(array: IntArray) {
    val productResult = array.reduce { accumulator, value -> accumulator * value }
    println("Функция Reduce\nПроизведение: $productResult")
  }

  private fun calculateWithMinMax(array: IntArray) {
    val minValue = array.minOrNull() ?: 0
    val maxValue = array.maxOrNull() ?: 0
    println("Функция MinMax\nMin: $minValue, Max: $maxValue")
  }
}