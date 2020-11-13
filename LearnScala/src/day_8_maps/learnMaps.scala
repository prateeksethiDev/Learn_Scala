package day_8_maps

object learnMaps extends App{
  var sports=Map(1->"hockey",2->"cricket",3->"football")
  sports=sports+(4->"swimming")
  println( sports.get(2)) //Some(cricket)
  
  //sports(30) // throws java.util.NoSuchElementException: key not found: 30
  println( sports.getOrElse(30, "Key not exists"))
  
}