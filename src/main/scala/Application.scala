object Application {

  def main(args: Array[String]): Unit = {

    val input = new UserInput

    val petName = input.givePromptGetInput("\n~*Please enter your pet's name*~\n")
    val pet = Pet(petName)

    val fontColour = new FontColours
    val viewGenerator = new ViewGenerator(pet)

//    print(viewGenerator.petAndStats(pet))
//
//    print(viewGenerator.landscape(fontColour.green))
//    print(viewGenerator.screen(fontColour.purple))

//    print(viewGenerator.x(fontColour.green))

    print(viewGenerator.sun(fontColour.yellow))
    print(viewGenerator.landscape(fontColour.green))

 }
}