import org.scalatest.{FreeSpec, MustMatchers}

class PetSpec extends FreeSpec with MustMatchers {

  "a Pet" - {

    "must have a name matching the user's input" in {
      val name = "Name"
      val hunger = 10
      val pet = Pet(name, hunger)

      pet.name mustEqual name

    }

    "must have a hunger level defaulted at 10" in {
      val name = "Name"
      val pet = Pet(name)

      pet.hunger mustEqual 10

    }

    "must decrease hunger level by 1 when reduceHunger is called" in {
      val pet = Pet("Name")
      val hungryPet = pet.reduceHunger

      hungryPet.hunger mustEqual 9
    }

    "must increase hunger by 1 when incrementHunger is called" in {
      val pet = Pet("Name", 9)
      val fedPet = pet.incrementHunger

      fedPet.hunger mustEqual 10
    }

    "must change happiness to false when hunger is 1" in {
      val pet = Pet("Name", hunger = 1)

      pet.calculateHappiness mustEqual false
    }

    "must change happiness to true when hunger is increased from 1" in {
      val pet = Pet("Name", hunger = 1)
      val fedPet = pet.incrementHunger

      fedPet.calculateHappiness mustEqual true
    }

  }
}
