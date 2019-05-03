object Application {

  def main(args: Array[String]): Unit = {

    val input = new UserInput

    val petName = input.givePromptGetInput("\n~*Please enter your pet's name*~\n")
    val pet = Pet(petName)

    val viewGenerator = new ViewGenerator(pet)
    val fontColour = new FontColours

    print(viewGenerator.petAndStats(pet))
    print(viewGenerator.landscape(fontColour.green))

 }
}