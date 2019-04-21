import org.scalatest.{FreeSpec, MustMatchers}

class VisualBuilderSpec extends FreeSpec with MustMatchers {

  "visualBuilder" - {

    "must create a string using the correct Pet's name" in {
      val pet = Pet("Name")
      val visuals = new VisualBuilder(pet)

      visuals.create mustEqual "Pet's name: Name"
    }
  }

}
