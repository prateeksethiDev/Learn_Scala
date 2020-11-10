package day1

object worksheet_1 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  var x=5                                         //> x  : Int = 5
  val str="Let's learn Scala"                     //> str  : String = Let's learn Scala
  var listInt=List(1,2,3,4,5)                     //> listInt  : List[Int] = List(1, 2, 3, 4, 5)
  3 to 10                                         //> res0: scala.collection.immutable.Range.Inclusive = Range 3 to 10
  var bool=true                                   //> bool  : Boolean = true
  val pi =3.14159                                 //> pi  : Double = 3.14159
  
  def add(a:Int,b:Int):Int =a+b                   //> add: (a: Int, b: Int)Int
  add(5,7)                                        //> res1: Int = 12
  
  val num=7                                       //> num  : Int = 7
  val dec=5.789                                   //> dec  : Double = 5.789
  var z= 1 + 6 * 3.7                              //> z  : Double = 23.200000000000003
  List("hello",1,false)                           //> res2: List[Any] = List(hello, 1, false)
  
  def addTwo(x:Int)=x+2                           //> addTwo: (x: Int)Int
  def functionDemo(x:Int)=if(x>1) 2 else "Hello"  //> functionDemo: (x: Int)Any
  var j=298  +'a'                                 //> j  : Int = 395
}