import org.scalatest.{FreeSpec, MustMatchers}

class ViewGeneratorSpec extends FreeSpec with MustMatchers {

  "ViewGenerator" - {

//    "must create a string with the correct state for" - {
//
//      val pet = Pet("Name", happiness = true)
//      val viewGenerator = new ViewGenerator()
//
//      "name" in {
//
//      }
//
//      "hunger" in {
//
//      }
//
//    }

    "must create a default string using the correct Pet state" in {
      val pet = Pet("Name")
      val viewGenerator = new ViewGenerator()

      viewGenerator.create(pet) mustEqual {
        s"   Pet's name: ${pet.name} \n" +
        "           ฅ ̳͒•ˑ̫• ̳͒ฅ           \n" +
        s"     Hunger: ${pet.hunger} \n" +
        s"     Mood: ${pet.calculateHappiness} \n "
      }
    }

    "must create a new string when Pet hunger is lower than 5" in {
      val pet = Pet("Name", hunger = 4)
      val viewGenerator = new ViewGenerator

      viewGenerator.create(pet) mustEqual {
        s"   Pet's name: ${pet.name} \n" +
        "           ฅ ̳͒°×° ̳͒ฅ           \n" +
        s"     Hunger: ${pet.hunger} Hungry!\n" +
        s"     Mood: ${pet.calculateHappiness} \n "
      }
    }

    "must create a new string when Pet happiness is false" in {
      val pet = Pet("Name", 1)
      val viewGenerator = new ViewGenerator

      viewGenerator.create(pet) mustEqual {
        s"   Pet's name: ${pet.name} \n"    +
        "           ฅ^•̯ •^ฅ           \n" +
        s"     Hunger: ${pet.hunger} \n"  +
        s"     Mood: ${pet.calculateHappiness} Sad! \n "
      }
    }

  }
}
