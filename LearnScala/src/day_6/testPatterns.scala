package day_6

object testPatterns extends App{
  //Similar to switch statement in java
  //_ means default, to prevent Match error
  
  def translate(letter:Char)={
    letter match {
      case 'a' | 'A' => "Alpha"
      case 'b' | 'B' => "Beta"
      case _=>"Not supported character"
    }
  }
  println(translate('c'))
  
  def findMax(x:Int,y:Int):Int=x>y match{
    case true=>x
    case false=>y
  }
  println(findMax(20,21))
  
}