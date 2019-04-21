import org.scalatest.{FreeSpec, MustMatchers}

class ViewGeneratorSpec extends FreeSpec with MustMatchers {

  "ViewGenerator" - {

    "must create a string using the correct Pet's name" in {
      val pet = Pet("Name")
      val visuals = new ViewGenerator()

      visuals.create(pet) mustEqual {
        s"   Pet's name: ${pet.name} \n" +
        "           ฅ ̳͒•ˑ̫• ̳͒ฅ           \n" +
        s"     Hunger: ${pet.hunger} \n"
      }

    }
  }
}
