class ViewGenerator(pet:Pet) {

  def sun(colour:Int): String = {
      "          ,,^,,               \n" +
      "       `,˄;###;˄,´´           \n" +
      "   `,;*#@@@@@@@@@#*;,'´       \n" +
      "  `,;*#@@@@@@@@@@@#*;,'´      \n" +
      " `,;*#@@@@@@@@@@@@#*;,'´      \n" +
      " `<;*#@@@@@@@@@@@@@#*;>´      \n" +
      " `<;*#@@@@@@@@@@@@@#*;>´      \n" +
      " `,;*#@@@@@@@@@@@@#*;,'´      \n" +
      " `',;*#@@@@@@@@@@@#*;,'´      \n" +
      "  `',;*#@@@@@@@@@#*;,'´       \n" +
      "      ´`˅**###**˅'`           \n" +
      "          ´˅˅˅`               \n\n"
  }

  def petAndStats(pet: Pet, colour: Int): String = {
    pet match {
      case sad if pet.hunger == 1 =>
        s"Name: ${pet.name} \n\n" +
        s"Hunger: ${pet.hunger} \n" +
        s"Mood: ${pet.calculateHappiness} Sad! \n\n" +
        "ฅ^•̯ •^ฅ"

      case hungry if pet.hunger < 5 =>
        s"Name: ${pet.name} \n\n" +
        s"Hunger: ${pet.hunger} Hungry!\n" +
        s"Mood: ${pet.calculateHappiness} \n\n" +
        "ฅ^>×<^ฅ"

      case _ =>
        s"Name: ${pet.name} \n\n" +
        s"Hunger: ${pet.hunger} \n" +
        s"Mood: ${pet.calculateHappiness} \n\n" +
        "ฅ^•ﻌ•^ฅ"
    }
  }

  def landscape(colour: Int): String = {
      ",,,|,║,|,║,|,,|║|,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,║,║║,,|,║,|,,║|,\n" +
      "▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
      "▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
      "▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
      "▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
      "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
      "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n"
    }

}
