case class Pet(name: String, hunger: Int = 10, happiness: Boolean = true) {

  def getHungry: Pet = {
    Pet(name, hunger - 1)
  }

  def getSad: Pet = {
    Pet(name, hunger, happiness = false)
  }

}
