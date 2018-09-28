object Problema1 {
  def StripRepeated( input : String) : String = input.toCharArray.distinct.mkString

  def main (args : Array[String]) : Unit = {
    if (args.length > 0) println(StripRepeated(args[0]))
  }

}
