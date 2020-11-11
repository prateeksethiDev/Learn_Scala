package day_5_Excptionhandling

import io.Source._
import java.io._

object exceptionHandling extends App{
  
  try{
  for(line<-fromFile("imaginaryFile.txt").getLines()){
    println(line.toLowerCase())
  }
  }catch{
    case e:FileNotFoundException => println("File does not exists")
    case _:Exception =>println("Your program contains an error, pls chkeck")    
  }
  
  try{
    var value=20/0;
  }catch{
    case e:ArithmeticException=>println("divide by zero is not correct mathematic operation")
  }
}