import scala.io.StdIn._

object login {
  def UserLogin(): Unit = {
    print("Please enter your credentials:\nUsername:\t")
    val user = readLine()
    print("Password:\t")
    val pass = readLine()
  }
}
