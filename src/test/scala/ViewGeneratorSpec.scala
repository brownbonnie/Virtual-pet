import org.scalatest.{FreeSpec, MustMatchers}

class ViewGeneratorSpec extends FreeSpec with MustMatchers {

  "ViewGenerator" - {

    val colour = new FontColours
    
    "must create a default string using the correct Pet state" in {
      val pet = Pet("Name")
      val viewGenerator = new ViewGenerator(pet)

      viewGenerator.petAndStats(pet, colour.purple) mustEqual {
        s"   Pet's name: ${pet.name} \n" +
        "           ฅ^•ﻌ•^ฅ           \n" +
        s"     Hunger: 10 \n" +
        s"     Mood: happy \n "
      }
    }

    "must create a new string when Pet hunger is lower than 5" in {
      val pet = Pet("Name", hunger = 4)
      val viewGenerator = new ViewGenerator(pet)

      viewGenerator.petAndStats(pet, colour.purple) mustEqual {
        s"   Pet's name: ${pet.name} \n" +
        "           ฅ^>×<^ฅ           \n" +
        s"     Hunger: 4 Hungry!\n" +
        s"     Mood: sad \n "
      }
    }

    "must create a new string when Pet happiness is false" in {
      val pet = Pet("Name", 1)
      val viewGenerator = new ViewGenerator(pet)

      viewGenerator.petAndStats(pet, colour.purple) mustEqual {
        s"   Pet's name: ${pet.name} \n"    +
        "           ฅ^•̯ •^ฅ           \n" +
        s"     Hunger: happy \n"  +
        s"     Mood: sad \n "
      }
    }
  }
}
