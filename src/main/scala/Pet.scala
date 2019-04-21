case class Pet(name: String, hunger: Int = 10) {

  def getHungry: Pet = {
    Pet(name, hunger - 1)
  }

}
