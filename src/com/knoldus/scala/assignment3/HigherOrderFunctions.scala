package com.knoldus.scala.assignment3

/**
  * Created by ashish and anuj on 17/1/17.
  * question 4th
  */

class HigherOrderFunctions {

  def sum(f:(Int, Int) => Int, num1: Int, num2 : Int ): Int = {
    f(num1,num2)
  }

}

//companion object
object HigherOrderFunctions {

  def main(args: Array[String]) {

    val higherOrderFunction = new HigherOrderFunctions()

    println(higherOrderFunction.sum((x:Int,y:Int)=>x*x + y*y, 5,4))//sum  of squares

    println(higherOrderFunction.sum((x:Int,y:Int)=>x*x*x + y*y*y, 5,4))//sum of cubes

    println(higherOrderFunction.sum((x:Int,y:Int)=>x + y, 5,4))//sum of int

  }

}