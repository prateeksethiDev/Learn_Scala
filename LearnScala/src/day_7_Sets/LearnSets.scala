package day_7_Sets

object LearnSets extends App{
  //Store Unique elements
  var number =Set(1,2,3,4,5)
 println("Does set contains number: "+number.contains(7)) //false
 
 var students =Set("Alex","John")
 
 //Combining two sets of different type
 var anyStr=number ++ students
 
 println(anyStr)
 
}