object Application {

  def main(args: Array[String]): Unit = {

    val input = new UserInput
    val petName = input.givePromptGetInput("Please enter your pet's name.")
    val pet = Pet(petName)
    val viewGenerator = new ViewGenerator()

    println(viewGenerator.create(pet))


    val hungryNinePet = pet.reduceHunger
    println(viewGenerator.create(hungryNinePet))

    val hungryEightPet = hungryNinePet.reduceHunger
    println(viewGenerator.create(hungryEightPet))

    val hungrySevenPet = hungryEightPet.reduceHunger
    println(viewGenerator.create(hungrySevenPet))

    val hungrySixPet = hungrySevenPet.reduceHunger
    println(viewGenerator.create(hungrySixPet))

    val hungryFivePet = hungrySixPet.reduceHunger
    println(viewGenerator.create(hungryFivePet))

    val hungryFourPet = hungryFivePet.reduceHunger
    println(viewGenerator.create(hungryFourPet))

    val hungryThreePet = hungryFourPet.reduceHunger
    println(viewGenerator.create(hungryThreePet))

    val hungryTwoPet = hungryThreePet.reduceHunger
    println(viewGenerator.create(hungryTwoPet))

    val hungryOnePet = hungryTwoPet.reduceHunger
    println(viewGenerator.create(hungryOnePet))


    val fedPet1 = hungryOnePet.incrementHunger
    println(viewGenerator.create(fedPet1))

    val fedPet2 = fedPet1.incrementHunger
    println(viewGenerator.create(fedPet2))

    val fedPet3 = fedPet2.incrementHunger
    println(viewGenerator.create(fedPet3))

    val fedPet4 = fedPet3.incrementHunger
    println(viewGenerator.create(fedPet4))

    val fedPet5 = fedPet4.incrementHunger
    println(viewGenerator.create(fedPet5))

    val fedPet6 = fedPet5.incrementHunger
    println(viewGenerator.create(fedPet6))

    val fedPet7 = fedPet6.incrementHunger
    println(viewGenerator.create(fedPet7))

    val fedPet8 = fedPet7.incrementHunger
    println(viewGenerator.create(fedPet8))

    val fedPet9 = fedPet8.incrementHunger
    println(viewGenerator.create(fedPet9))

  }
}