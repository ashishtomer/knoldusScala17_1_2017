package com.knoldus.scala.assignment3.queue

/**
  * Created by anuj and ashish on 17/1/17.
  *
  * Question 3
  *
  */

trait Queue {

  var list:List[Int] = List()

  def enqueue( number : Int)

  def dequeue() = {
    list = list.slice(1,list.length)
  }

}

class DoubleQueue() extends Queue {

  override def enqueue(number : Int): Unit = {
    list = list :+ (number * 2)
  }

}

class SquareQueue extends Queue {

  override def enqueue(number : Int): Unit = {
    list = list :+ (number * number)
  }
}

class QueueOps {

  val doubleQueue = new DoubleQueue()
  val squareQueue = new SquareQueue()

}

//Companion Object

object QueueOps {

  def main(args: Array[String]) {

    val queueOps = new QueueOps

    /*
    *
    * Operations on double queue
    *
    */

    queueOps.doubleQueue.enqueue(90)
    queueOps.doubleQueue.enqueue(23)
    queueOps.doubleQueue.enqueue(976)
    queueOps.doubleQueue.enqueue(45)

    println(queueOps.doubleQueue.list)

    queueOps.doubleQueue.dequeue()
    queueOps.doubleQueue.dequeue()

    println(queueOps.doubleQueue.list)

    /*
    *
    * Operations on square queue
    *
    */

    queueOps.squareQueue.enqueue(20)
    queueOps.squareQueue.enqueue(40)
    queueOps.squareQueue.enqueue(22)
    queueOps.squareQueue.enqueue(11)
    queueOps.squareQueue.enqueue(39)

    println(queueOps.squareQueue.list)

    queueOps.squareQueue.dequeue()
    queueOps.squareQueue.dequeue()

    println(queueOps.squareQueue.list)

  }
}