class Vector(val x: Double, val y: Double, val z: Double) {
  fun calculateLength(): Double {
    return Math.sqrt(x * x + y * y + z * z)
  }

  fun calculateDotProduct(otherVector: Vector): Double {
    return x * otherVector.x + y * otherVector.y + z * otherVector.z
  }

  infix fun dot(otherVector: Vector): Double {
    return calculateDotProduct(otherVector)
  }

  operator fun times(otherVector: Vector): Double {
    return calculateDotProduct(otherVector)
  }
}

fun calculateDotProduct(vector1: Vector, vector2: Vector): Double {
  return vector1.x * vector2.x + vector1.y * vector2.y + vector1.z * vector2.z
}