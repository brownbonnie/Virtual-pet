class ViewGenerator(pet:Pet) {

  def create(pet: Pet): String = {
    pet match {
      case sad if !pet.calculateHappiness =>
        s"   Pet's name: ${pet.name} \n" +
        "           ฅ^•̯ •^ฅ           \n" +
        s"     Hunger: ${pet.hunger} \n"  +
        s"     Mood: ${pet.calculateHappiness} Sad! \n "

      case hungry if pet.hunger < 5 =>
        s"   Pet's name: ${pet.name} \n" +
        "           ฅ^>×<^ฅ           \n" +
        s"     Hunger: ${pet.hunger} Hungry!\n" +
        s"     Mood: ${pet.calculateHappiness} \n "

      case _ =>
        s"   Pet's name: ${pet.name} \n" +
        "           ฅ^•ﻌ•^ฅ           \n" +
        s"     Hunger: ${pet.hunger} \n" +
        s"     Mood: ${pet.calculateHappiness} \n "
    }
  }

  def screen: String =
    "############################################################################################################################################################ \n" +
    "#                                                                                                                                                          # \n" +
    "#                                                                                                                                                          # \n" +
    "#                                                                                                                                                          # \n" +
    "#                                                                                                                                                          # \n" +
    "#                                                                                                                                                          # \n" +
    "#                                                                                                                                                          # \n" +
    "#                                                                                                                                                          # \n" +
    "#                                                                                                                                                          # \n" +
    "#                                                                                                                                                          # \n" +
    "#                                                                                                                                                          # \n" +
    "#                                                                                                                                                          # \n" +
    "#                                                                                                                                                          # \n" +
    "#                                                                                                                                                          # \n" +
    "#                                                                                                                                                          # \n" +
    "#                                                                                                                                                          # \n" +
    "#                                                                                                                                                          # \n" +
   s"#                                                           Pet's name: ${pet.name}                                                                        # \n" +
    "#                                                                                                                                                          # \n" +
    "#                                                                                                                                                          # \n" +
   s"#                                                                   ${pet}                                                                                 # \n" +
    "#                                                                                                                                                          # \n" +
   s"#                                                            Hunger: ${pet.hunger}                                                                         # \n" +
   s"#                                                          Mood: ${pet.calculateHappiness}                                                                 # \n" +
    "#                                                                                                                                                          # \n" +
    "#                                                                                                                                                          # \n" +
    "#                                                                                                                                                          # \n" +
    "#                                                                                                                                                          # \n" +
    "#                                                                                                                                                          # \n" +
    "#                                                                                                                                                          # \n" +
    "#                                                                                                                                                          # \n" +
    "#                                                                                                                                                          # \n" +
    "#                                                                                                                                                          # \n" +
    "#                                                                                                                                                          # \n" +
    "#                                                                                                                                                          # \n" +
    "#                                                                                                                                                          # \n" +
    "#                                                                                                                                                          # \n" +
    "#                                                                                                                                                          # \n" +
    "#                                                                                                                                                          # \n" +
    "#                                                                                                                                                          # \n" +
    "#                                                                                                                                                          # \n" +
    "#                                                                                                                                                          # \n" +
    "#                                                                                                                                                          # \n" +
    "#                                                                                                                                                          # \n" +
    "#                                                                                                                                                          # \n" +
    "#                                                                                                                                                          # \n" +
    "#                                                                                                                                                          # \n" +
    "#                                                                                                                                                          # \n" +
    "############################################################################################################################################################ \n"
}
