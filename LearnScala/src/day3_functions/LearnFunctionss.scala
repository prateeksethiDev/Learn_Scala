package day3_functions

object LearnFunctionss {
  
  
  def main(args: Array[String]): Unit = {
    println("--------Calling Main------------------")
    def getAbsValue(x: Int) = {
      if (x < 0) {
        -x
      } else {
        x
      }
    }
    println(getAbsValue(-10))
  } 
  
  println("--------Uisng for loop------------------")
  def getFactorial(x:Int):Int={
    var r=1
    for(i<-1 to x)
      r=r*i
      r
  }
  var x=getFactorial(4)
  println(x)
  
  println("--------Uisng recurrsive approach-----------")  
  def recurssiveFac(x:Int):Int={
    if(x<=0) 1 else x*recurssiveFac(x-1)
  }
  
  println(recurssiveFac(3))
  
  println("--------Uisng Variadic function-----------")  
  
  def sum(args:Int*)={
    var result=0
    for(arg<-args){
      result+=arg
    }
    result
  }
  println(sum(1,2,3,4,5))
}