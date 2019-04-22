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

    "must decrease hunger level by one when getHungry is called" in {
      val pet = Pet("Name")

      val hungryPet = pet.getHungry

      hungryPet.hunger mustEqual 9
    }

    "must change happiness to false when getSad is called" in {
      val pet = Pet("Name")

      val sadPet = pet.getSad

      sadPet.happiness mustEqual false
    }

  }
}
