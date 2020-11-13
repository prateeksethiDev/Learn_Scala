package day_10_OOPS_in_Scala

object BankAccountTest extends App {
  
  var account1= new BankAccount("Alex",3000,"saving");
  var account2= new BankAccount("Sam",4000,"checking");
  println(account1)
  println(account2)
}

class BankAccount(clientName:String,balance:Double,accountType:String){
  var accountNumber=BankAccount.getAccountNumber()
  override def toString()="Client Name: "+clientName+"\n balance: "+balance +(if (accountType=="saving") "\nSaving account" else "\n Checking account")
}

object BankAccount{
  var accountNumber=1000
  def getAccountNumber()={
    accountNumber+=1
    accountNumber
  }
}