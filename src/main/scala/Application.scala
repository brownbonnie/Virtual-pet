import sys.process._

object Application {

  def main(args: Array[String]): Unit = {

    val input = new UserInput
    val petName = input.givePromptGetInput("Please enter your pet's name.")
    val pet = Pet(petName)
    val viewGenerator = new ViewGenerator(pet)

    println(viewGenerator.create(pet))

    val hungryNinePet = pet.reduceHunger
    println(viewGenerator.create(hungryNinePet))

    def clear = "clear".!

    Thread.sleep(10000)
    clear

    val hungryEightPet = hungryNinePet.reduceHunger
    println(viewGenerator.create(hungryEightPet))

    Thread.sleep(10000)
    clear

    val hungrySevenPet = hungryEightPet.reduceHunger
    println(viewGenerator.create(hungrySevenPet))

    Thread.sleep(10000)
    clear

    val hungrySixPet = hungrySevenPet.reduceHunger
    println(viewGenerator.create(hungrySixPet))

    Thread.sleep(10000)
    clear

    val hungryFivePet = hungrySixPet.reduceHunger
    println(viewGenerator.create(hungryFivePet))

    Thread.sleep(10000)
    clear

    val hungryFourPet = hungryFivePet.reduceHunger
    println(viewGenerator.create(hungryFourPet))

    Thread.sleep(10000)
    clear

    val hungryThreePet = hungryFourPet.reduceHunger
    println(viewGenerator.create(hungryThreePet))

    Thread.sleep(10000)
    clear

    val hungryTwoPet = hungryThreePet.reduceHunger
    println(viewGenerator.create(hungryTwoPet))

    Thread.sleep(10000)
    clear

    val hungryOnePet = hungryTwoPet.reduceHunger
    println(viewGenerator.create(hungryOnePet))

    Thread.sleep(10000)
    clear

    val fedPet1 = hungryOnePet.incrementHunger
    println(viewGenerator.create(fedPet1))

    Thread.sleep(10000)
    clear

    val fedPet2 = fedPet1.incrementHunger
    println(viewGenerator.create(fedPet2))

    Thread.sleep(10000)
    clear

    val fedPet3 = fedPet2.incrementHunger
    println(viewGenerator.create(fedPet3))

    Thread.sleep(10000)
    clear

    val fedPet4 = fedPet3.incrementHunger
    println(viewGenerator.create(fedPet4))

    Thread.sleep(10000)
    clear

    val fedPet5 = fedPet4.incrementHunger
    println(viewGenerator.create(fedPet5))

    Thread.sleep(10000)
    clear

    val fedPet6 = fedPet5.incrementHunger
    println(viewGenerator.create(fedPet6))

    Thread.sleep(10000)
    clear

    val fedPet7 = fedPet6.incrementHunger
    println(viewGenerator.create(fedPet7))

    Thread.sleep(10000)
    clear

    val fedPet8 = fedPet7.incrementHunger
    println(viewGenerator.create(fedPet8))

    Thread.sleep(10000)
    clear

    val fedPet9 = fedPet8.incrementHunger
    println(viewGenerator.create(fedPet9))

  }
}