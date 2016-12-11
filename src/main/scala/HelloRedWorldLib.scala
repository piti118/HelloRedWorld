

object HelloRedWorldLib {
  def print(){
    println("Hello from lib")
  }

  def main(args: Array[String]) = {
    println("This shouldn't print")
  }
}
