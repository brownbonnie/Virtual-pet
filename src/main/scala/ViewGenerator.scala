class ViewGenerator {

  def create(pet: Pet): String = {
    pet match {
      case sad if !pet.calculateHappiness =>
        s"   Pet's name: ${pet.name} \n" +
        "           ฅ^•̯ •^ฅ           \n" +
        s"     Hunger: ${pet.hunger} \n"  +
        s"     Mood: ${pet.calculateHappiness} Sad! \n "

      case hungry if pet.hunger < 5 =>
        s"   Pet's name: ${pet.name} \n" +
        "           ฅ ̳͒°×° ̳͒ฅ           \n" +
        s"     Hunger: ${pet.hunger} Hungry!\n" +
        s"     Mood: ${pet.calculateHappiness} \n "

      case _ =>
        s"   Pet's name: ${pet.name} \n" +
        "           ฅ ̳͒•ˑ̫• ̳͒ฅ           \n" +
        s"     Hunger: ${pet.hunger} \n" +
        s"     Mood: ${pet.calculateHappiness} \n "
    }
  }
}
