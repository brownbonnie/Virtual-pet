object Application {

  def main(args: Array[String]): Unit = {

    val input = new UserInput
    val petName = input.givePromptGetInput("Please enter your pet's name.")
    val pet = Pet(petName)
    val viewGenerator = new ViewGenerator()

    println(viewGenerator.create(pet))

    val hungryNinePet = pet.getHungry
    println(viewGenerator.create(hungryNinePet))

        val hungryEightPet = hungryNinePet.getHungry
    println(viewGenerator.create(hungryEightPet))

        val hungrySevenPet = hungryEightPet.getHungry
    println(viewGenerator.create(hungrySevenPet))

        val hungrySixPet = hungrySevenPet.getHungry
    println(viewGenerator.create(hungrySixPet))

        val hungryFivePet = hungrySixPet.getHungry
    println(viewGenerator.create(hungryFivePet))

        val hungryFourPet = hungryFivePet.getHungry
    println(viewGenerator.create(hungryFourPet))

        val hungryThreePet = hungryFourPet.getHungry
    println(viewGenerator.create(hungryThreePet))

        val hungryTwoPet = hungryThreePet.getHungry
    println(viewGenerator.create(hungryTwoPet))

        val hungryOnePet = hungryTwoPet.getHungry
    println(viewGenerator.create(hungryOnePet))

    val sadPet = hungryOnePet.getSad
    println(viewGenerator.create(sadPet))



  }
}