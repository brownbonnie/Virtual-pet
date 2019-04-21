object Application {

  def main(args: Array[String]): Unit = {

    val input = new UserInput

    val petName = input.givePromptGetInput("Please enter your pet's name.")
    val pet = Pet(petName)

    val viewGenerator = new ViewGenerator()

    print(viewGenerator.create(pet))

    val newPet = pet.getHungry

    print(viewGenerator.create(newPet))



  }
}