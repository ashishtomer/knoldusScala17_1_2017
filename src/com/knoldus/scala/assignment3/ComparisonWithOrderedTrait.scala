package com.knoldus.scala.assignment3

/**
  * Created by ashish and anuj on 17/1/17
  * Question 1st.
  *
  */
class ComparisonWithOrderedTrait(val name: String, val age: Int) extends Ordered[ComparisonWithOrderedTrait]{

  def compare(that : ComparisonWithOrderedTrait)={

    if(this.name.toLowerCase==that.name.toLowerCase){
      this.age-that.age
    }
    else
      this.name.length-that.name.length

  }

}


//comapanion object
object ComparisonWithOrderedTrait{
  def main(args: Array[String]) {

    val personOne = new ComparisonWithOrderedTrait("Prashant", 24)
    val  personTwo = new ComparisonWithOrderedTrait("Prashant", 25)
    println(personOne<personTwo)

    val personThree = new ComparisonWithOrderedTrait("Ashish", 24)
    val  personFour = new ComparisonWithOrderedTrait("Anuj", 24)
    println(personThree<personFour)

  }
}