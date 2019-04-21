object Application {

  def main(args: Array[String]): Unit = {

    val input = new UserInput
    val petName = input.getInput

    val pet = Pet(petName)
    val visuals = new VisualBuilder(pet)

    print(visuals.create)
  }
}