package com.knoldus.scala.assignment3

/**
  * Created by ashish and anuj on 17/1/17.
  * Question no 2
  */

//Value classes

class Fname(val firstName:String) extends AnyVal{
  override def toString()={
    firstName
  }
}
class Lname(val lastName:String) extends AnyVal{
  override def toString()={
    lastName
  }
}
class Age(val age:Int) extends AnyVal{
  override def toString()={
    age.toString
  }
}

class ValueClasses {
  def displayDetails(firstName:String,lastName:String,age:Int):String={

    val fname=new Fname(firstName)
    val lname= new Lname(lastName)
    val personAge = new Age(age)

    s"$fname $lname is of $personAge years."
  }
}


//companion object

object ValueClasses{
  def main(args: Array[String]) {
    val valueClasses = new ValueClasses()
    println(valueClasses.displayDetails("Ashish","Tomer",24))
  }
}