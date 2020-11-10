package day2_loops

object LearnLoops {

  def main(args: Array[String]): Unit = {
    var x = 10
    while (x > 0) {
      println(x)
      x -= 1
    }
    println("While Loop exits")

    //will print x=0 one time only
    do {
      println(x)
      x -= 1
    } while (x > 0)
    println("Do-While Loop exits")
    
    //for reverse for loop, we need to provide step in this case it is -1
    for(i<-10 to 0 by -1){
      println(i)
    }
     println("For Loop exits")
     
      println("Another version of for loop")
     var incrementByOne=for(j<-1 to 10) yield j+1
     println(incrementByOne)
  }
}