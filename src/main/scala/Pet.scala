case class Pet(name: String, hunger: Int = 10) {

  def getHungry: Pet = {
    Pet(name, hunger - 1)
  }

  def feed: Pet = {
    Pet(name, hunger + 1)
  }

  def calculateHappiness: String = {
    if (hunger == 1) {"sad"}
    else {"happy"}
    }

}
