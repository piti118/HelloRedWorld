object HelloRedWorld{
  def main(args: Array[String]) = {
    val colored = Console.RED + "Hello RED World" + Console.RESET
    println(colored)
    HelloRedWorldLib.print()
  }
}
