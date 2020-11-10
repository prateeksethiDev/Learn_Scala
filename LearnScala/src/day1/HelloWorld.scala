package day1

object HelloWorld {
  
  def main(args:Array[String]):Unit={
    
    println("Hello World")
    
    var firstName:String="Prateek"
    val age:Int=30
    println(firstName + " is "+age+" years old currently")
    var sum=
      20+
      35
    
    def function1:Unit={
      println("This is my first function after main in scala"+" btw the sum is "+sum)
    }
    //let's call it
    function1
  }
}