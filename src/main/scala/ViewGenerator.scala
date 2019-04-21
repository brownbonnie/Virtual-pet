class ViewGenerator {

  def create(pet: Pet): String = {
    s"   Pet's name: ${pet.name} \n" +
    "           ฅ ̳͒•ˑ̫• ̳͒ฅ           \n" +
    s"     Hunger: ${pet.hunger} \n"

}
