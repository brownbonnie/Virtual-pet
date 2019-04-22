case class Pet(name: String, hunger: Int = 10) {

  def reduceHunger: Pet = {
    Pet(name, hunger - 1)
  }

  def incrementHunger: Pet = {
    Pet(name, hunger + 1)
  }

  def calculateHappiness: Boolean = {
    if (hunger == 1) false
    else true
    }

}
