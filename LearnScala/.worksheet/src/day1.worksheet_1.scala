package day1

object worksheet_1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(78); 
  println("Welcome to the Scala worksheet");$skip(10); 
  var x=5;System.out.println("""x  : Int = """ + $show(x ));$skip(30); 
  val str="Let's learn Scala";System.out.println("""str  : String = """ + $show(str ));$skip(30); 
  var listInt=List(1,2,3,4,5);System.out.println("""listInt  : List[Int] = """ + $show(listInt ));$skip(10); val res$0 = 
  3 to 10;System.out.println("""res0: scala.collection.immutable.Range.Inclusive = """ + $show(res$0));$skip(16); 
  var bool=true;System.out.println("""bool  : Boolean = """ + $show(bool ));$skip(18); 
  val pi =3.14159;System.out.println("""pi  : Double = """ + $show(pi ));$skip(35); 
  
  def add(a:Int,b:Int):Int =a+b;System.out.println("""add: (a: Int, b: Int)Int""");$skip(11); val res$1 = 
  add(5,7);System.out.println("""res1: Int = """ + $show(res$1));$skip(15); 
  
  val num=7;System.out.println("""num  : Int = """ + $show(num ));$skip(16); 
  val dec=5.789;System.out.println("""dec  : Double = """ + $show(dec ));$skip(21); 
  var z= 1 + 6 * 3.7;System.out.println("""z  : Double = """ + $show(z ));$skip(24); val res$2 = 
  List("hello",1,false);System.out.println("""res2: List[Any] = """ + $show(res$2));$skip(27); 
  
  def addTwo(x:Int)=x+2;System.out.println("""addTwo: (x: Int)Int""");$skip(49); 
  def functionDemo(x:Int)=if(x>1) 2 else "Hello";System.out.println("""functionDemo: (x: Int)Any""");$skip(18); 
  var j=298  +'a';System.out.println("""j  : Int = """ + $show(j ))}
}
