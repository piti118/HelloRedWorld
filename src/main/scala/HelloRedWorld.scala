import fansi._

object HelloRedWorld{
  def main(args: Array[String]) = {
    val colored = Console.RED + "Hello RED World" + Console.RESET
    println(colored)
    val colorblue: fansi.Str = fansi.Color.Blue("Hello World Ansi!")
    println(colorblue)
    HelloRedWorldLib.print()
  }
}
