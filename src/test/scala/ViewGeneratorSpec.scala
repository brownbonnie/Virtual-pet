import org.scalatest.{FreeSpec, MustMatchers}

class ViewGeneratorSpec extends FreeSpec with MustMatchers {

  "ViewGenerator" - {

    "must create a string using the correct Pet state and the right visual format" in {
      val pet = Pet("Name")
      val visual = new ViewGenerator()

      visual.create(pet) mustEqual {
        s"   Pet's name: ${pet.name} \n" +
        "           ฅ ̳͒•ˑ̫• ̳͒ฅ           \n" +
        s"     Hunger: ${pet.hunger} \n"
      }

    }
  }
}
