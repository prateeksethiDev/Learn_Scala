package day_9_collections

object learnTuples extends App{
  //tuples index starts from 1
  val t=(2,2,22.7,"Hi")
  var x=t._3
  println(x) //22.7
  
  val multipleSymbols=Array("<","-",">")
  val counts=Array(2,10,2)
  val pairs=multipleSymbols.zip(counts)
  for((x,y)<-pairs){
    println(x*y)
  }  
  
  //Array Buffer
    println("Array Buffer")
    
    //Use new when not initialising the array
    var num=new Array[Any](10)
    
    var num2=Array("cricket","swimming","horse riding")
    
   for(n<-num2)println(n)

   println("Printing the even number from array")
   var num3= Array(1,2,3,4,5)
   for(number<-num3 if number%2==0) yield println(number)
    
   println("............List...............") 
   
   //Using List
   var list1= List(1,"hello",2.2)
   //Using Cons(::) operator
   var list2=1::2::3::4::Nil
   //Using Range
   var list3=List.range(5,10)
   //Combing list
   var list4=list1::list2::list3
   for(n<-list4)println(n)
   
   println("list of tuples")
   var list5=List((1,2),(3,4),(8,9))
   for((x,y)<-list5) yield println(x+y)
}