object Problema1 {
  def StripRepeated( input : String) : String = input.toCharArray.distinct.mkString

  def main (args : Array[String]) : Unit = {
    if (args.length > 0) println(StripRepeated(args[0]))
  }

}


import scala.util.{Try, Success, Failure}
object Problema2 {
  def SpecialDigit(input: BigInt) : Int = {
    var digits = input.toString.toArray.map(_-'0')
    if (digits.length > 1) SpecialDigit( digits.sum )
    else input.toInt
  }

  def main (args : Array[String]) : Unit = {
    if (args.length > 0 ) Try(args[0].toInt) match { case Success(value) => SpecialDigit(value)}
  }

}
