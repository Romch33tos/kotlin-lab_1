class QuadraticEquationSolver {
  fun solve() {
    println("Введите коэффициенты a, b, c квадратного уравнения:")
    print("a = ")
    val coefficientA = readln().toDoubleOrNull() ?: 0.0
    print("b = ")
    val coefficientB = readln().toDoubleOrNull() ?: 0.0
    print("c = ")
    val coefficientC = readln().toDoubleOrNull() ?: 0.0

    findQuadraticRoots(coefficientA, coefficientB, coefficientC)
  }

  private fun square(number: Double): Double = number * number

  private fun calculateDiscriminant(coefficientA: Double, coefficientB: Double, coefficientC: Double): Double {
    return square(coefficientB) - 4 * coefficientA * coefficientC
  }

  private fun countRoots(coefficientA: Double, coefficientB: Double, coefficientC: Double): Int {
    val discriminant = calculateDiscriminant(coefficientA, coefficientB, coefficientC)
    return when {
      discriminant > 0 -> 2
      discriminant == 0.0 -> 1
      else -> 0
    }
  }

  private fun findQuadraticRoots(coefficientA: Double, coefficientB: Double, coefficientC: Double) {
    val discriminant = calculateDiscriminant(coefficientA, coefficientB, coefficientC)
    val rootsCount = countRoots(coefficientA, coefficientB, coefficientC)

    when (rootsCount) {
      2 -> {
        val root1 = (-coefficientB + Math.sqrt(discriminant)) / (2 * coefficientA)
        val root2 = (-coefficientB - Math.sqrt(discriminant)) / (2 * coefficientA)
        println("Два корня: x1 = ${"%.2f".format(root1)}, x2 = ${"%.2f".format(root2)}")
      }
      1 -> {
        val root = -coefficientB / (2 * coefficientA)
        println("Один корень: x = ${"%.2f".format(root)}")
      }
      else -> println("Действительных корней нет")
    }
  }
}