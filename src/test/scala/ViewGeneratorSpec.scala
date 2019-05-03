import org.scalatest.{FreeSpec, MustMatchers}

class ViewGeneratorSpec extends FreeSpec with MustMatchers {

  "ViewGenerator" - {
    
    "must create a default string using the correct Pet state" in {
      val pet = Pet("Name")
      val viewGenerator = new ViewGenerator(pet)

      viewGenerator.petAndStats(pet) mustEqual {
        s"   Pet's name: ${pet.name} \n" +
        "           ฅ^•ﻌ•^ฅ           \n" +
        s"     Hunger: ${pet.hunger} \n" +
        s"     Mood: ${pet.calculateHappiness} \n "
      }
    }

    "must create a new string when Pet hunger is lower than 5" in {
      val pet = Pet("Name", hunger = 4)
      val viewGenerator = new ViewGenerator(pet)

      viewGenerator.petAndStats(pet) mustEqual {
        s"   Pet's name: ${pet.name} \n" +
        "           ฅ^>×<^ฅ           \n" +
        s"     Hunger: ${pet.hunger} Hungry!\n" +
        s"     Mood: ${pet.calculateHappiness} \n "
      }
    }

    "must create a new string when Pet happiness is false" in {
      val pet = Pet("Name", 1)
      val viewGenerator = new ViewGenerator(pet)

      viewGenerator.petAndStats(pet) mustEqual {
        s"   Pet's name: ${pet.name} \n"    +
        "           ฅ^•̯ •^ฅ           \n" +
        s"     Hunger: ${pet.hunger} \n"  +
        s"     Mood: ${pet.calculateHappiness} Sad! \n "
      }
    }
  }
}
