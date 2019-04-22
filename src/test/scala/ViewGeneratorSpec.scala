import org.scalatest.{FreeSpec, MustMatchers}

class ViewGeneratorSpec extends FreeSpec with MustMatchers {

  "ViewGenerator" - {

//    //Not implemented yet
//    "must create a string with the correct state of" - {
//
//      val pet = Pet("Name")
//      val viewGenerator = new ViewGenerator()
//
//      "name" in {
//        ???
//      }
//
//      "hunger" in {
//        ???
//      }
//
//      "happiness" in {
//        ???
//      }
//
//    }

    "must create a default string using the correct Pet state and the right visual format" in {
      val pet = Pet("Name")
      val viewGenerator = new ViewGenerator()

      viewGenerator.create(pet) mustEqual {
        s"   Pet's name: ${pet.name} \n" +
        "           ฅ ̳͒•ˑ̫• ̳͒ฅ           \n" +
        s"     Hunger: ${pet.hunger} \n" +
        s"     Mood: ${pet.happiness} \n "
      }
    }

    "must create a new string when Pet hunger is lower than 5" in {
      val pet = Pet("Name", hunger = 4)
      val viewGenerator = new ViewGenerator

      viewGenerator.create(pet) mustEqual {
        s"   Pet's name: ${pet.name} \n" +
        "           ฅ ̳͒°×° ̳͒ฅ           \n" +
        s"     Hunger: ${pet.hunger} Hungry!\n" +
        s"     Mood: ${pet.happiness} \n "
      }
    }

    "must create a new string when Pet happiness is false" in {
      val pet = Pet("Name", happiness = false)
      val viewGenerator = new ViewGenerator

      viewGenerator.create(pet) mustEqual {
        s"   Pet's name: ${pet.name} \n"    +
          "           ฅ^•̯ •^ฅ           \n" +
          s"     Hunger: ${pet.hunger} \n"  +
          s"     Mood: ${pet.happiness} Sad! \n "
      }
    }



    }
}
