open class Vehicle(open val speed: Int = 0, open val name: String = "Транспорт") {
  open fun start() {
    println("$name начал движение со скоростью $speed км/ч")
  }

  open fun stop() {
    println("$name остановился")
  }
}

class Boat(override val speed: Int = 25, override val name: String = "Лодка") : Vehicle(speed, name) {
  override fun start() {
    println("$name отплывает со скоростью $speed км/ч")
  }

  override fun stop() {
    println("$name причаливает")
  }
}

class Airplane(override val speed: Int = 800, override val name: String = "Самолет") : Vehicle(speed, name) {
  override fun start() {
    println("$name взлетает со скоростью $speed км/ч")
  }

  override fun stop() {
    println("$name совершает посадку")
  }
}

class Tank(override val speed: Int = 30, override val name: String = "Танк") : Vehicle(speed, name) {
  override fun start() {
    println("$name начинает движение по местности со скоростью $speed км/ч")
  }

  override fun stop() {
    println("$name останавливается")
  }
}