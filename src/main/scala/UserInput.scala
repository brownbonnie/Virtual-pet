import scala.io.StdIn

class UserInput {

  def givePromptGetInput(promptMessage:String): String = StdIn.readLine(promptMessage)

}
