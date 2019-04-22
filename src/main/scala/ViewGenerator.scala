class ViewGenerator {

  def create(pet: Pet): String = {

    pet match {
      case sad if pet.happiness == false =>
        s"   Pet's name: ${pet.name} \n" +
          "           ฅ^•̯ •^ฅ           \n" +
          s"     Hunger: ${pet.hunger} \n"  +
          s"     Mood: ${pet.happiness} Sad! \n "

      case hungry if pet.hunger < 5 =>
        s"   Pet's name: ${pet.name} \n" +
          "           ฅ ̳͒°×° ̳͒ฅ           \n" +
          s"     Hunger: ${pet.hunger} Hungry!\n" +
          s"     Mood: ${pet.happiness} \n "

      case _ =>
        s"   Pet's name: ${pet.name} \n" +
          "           ฅ ̳͒•ˑ̫• ̳͒ฅ           \n" +
          s"     Hunger: ${pet.hunger} \n" +
          s"     Mood: ${pet.happiness} \n "
    }



    //    if (pet.hunger < 5) {
    //      s"   Pet's name: ${pet.name} \n" +
    //      "           ฅ ̳͒°×° ̳͒ฅ           \n" +
    //      s"     Hunger: ${pet.hunger} Hungry!\n" +
    //      s"     Mood: ${pet.happiness} \n "
    //    } else {
    //      s"   Pet's name: ${pet.name} \n" +
    //      "           ฅ ̳͒•ˑ̫• ̳͒ฅ           \n" +
    //      s"     Hunger: ${pet.hunger} \n" +
    //      s"     Mood: ${pet.happiness} \n "
    //    }
    //  }

  }
}
