import sys.process._

object Application {

  def main(args: Array[String]): Unit = {
    "clear" !

    val input = new UserInput
    val petName = input.givePromptGetInput("\n~ Please enter your pet's name ~\n")
    val pet = Pet(petName)
    val font = new FontColours
    val view = new ViewGenerator(pet)

    "clear" !

    print(view.sun(font.yellow))
    print(view.petAndStats(pet, font.purple))
    print(view.landscape(font.green))


    val nine = pet.getHungry
    Thread.sleep(3000)
    "clear" !;
    print(view.sun(font.yellow))
    print(view.petAndStats(nine, font.purple))
    print(view.landscape(font.green))
    println(s"\n*$petName got hungrier!*\n")

    val newPet = {
      val feed: String = input.givePromptGetInput(s"Feed $petName? \nEnter yes or no. \nNo funny business, I haven't done the Data Validation yet..")
      if (feed == "yes") {nine.feed}
      else {nine.getHungry}
    }

    "clear" !;
    print(view.sun(font.yellow))
    print(view.petAndStats(newPet, font.purple))
    print(view.landscape(font.green))

  }
}