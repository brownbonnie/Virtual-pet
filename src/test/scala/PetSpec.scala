import org.scalatest.{FreeSpec, MustMatchers}

class PetSpec extends FreeSpec with MustMatchers {

  "a Pet" - {

    "must have a name matching the user's input" in {
      val mockInput = "Name"
      val pet = Pet(mockInput)

      pet.name mustEqual "Name"

    }


  }

}
