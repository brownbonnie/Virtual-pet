import org.scalatest.{FreeSpec, MustMatchers}

class ViewGeneratorSpec extends FreeSpec with MustMatchers {

  "ViewGenerator" - {

    val colour = new FontColours
    
    "must create a default string using the correct Pet state" in {
      val pet = Pet("Name")
      val viewGenerator = new ViewGenerator(pet)

      viewGenerator.petAndStats(pet, colour.purple) mustEqual {
        s"Name: ${pet.name} \n\n" +
        s"Hunger: ${pet.hunger} \n" +
        s"Mood: ${pet.calculateHappiness} \n\n" +
        "ฅ^•ﻌ•^ฅ"
      }
    }

    "must create a new string when Pet hunger is lower than 5" in {
      val pet = Pet("Name", hunger = 4)
      val viewGenerator = new ViewGenerator(pet)

      viewGenerator.petAndStats(pet, colour.purple) mustEqual {
        s"Name: ${pet.name} \n\n" +
        s"Hunger: ${pet.hunger} Hungry!\n" +
        s"Mood: ${pet.calculateHappiness} \n\n" +
        "ฅ^>×<^ฅ"
      }
    }

    "must create a new string when Pet happiness is false" in {
      val pet = Pet("Name", 1)
      val viewGenerator = new ViewGenerator(pet)

      viewGenerator.petAndStats(pet, colour.purple) mustEqual {
        s"Name: ${pet.name} \n\n" +
        s"Hunger: ${pet.hunger} \n" +
        s"Mood: ${pet.calculateHappiness} Sad! \n\n" +
        "ฅ^•̯ •^ฅ"
      }
    }
  }
}
