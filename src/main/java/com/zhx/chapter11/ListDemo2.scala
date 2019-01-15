package com.zhx.chapter11

import scala.collection.mutable.ListBuffer

/*
 * list
 * @Author: 遗忘的哈罗德
 * @Date: 2019-01-14 16:38
 */
object ListDemo2 {

  def main(args: Array[String]): Unit = {
//    test1
//    println(test2(sum, 10.1))
//    test3
//    test4
    test5
  }

  /**
    * 需求，将List(3,5,7)中的所有元素都*2，并返回一个新集合：
    * 这样处理的优点:
    *   处理方法比较直接，好理解
    * 缺点：
    *   不够简洁，高效
    *   没有体现函数式编程特点
    *   不利于处理复杂的数据处理业务
    */
  def test1={
    val listSource = List(3, 5, 7)
    val listTarget = ListBuffer[Any]()
    for(item <- listSource){
      listTarget.append(item*2)
    }
    println(listTarget)
  }


  /**
    * 这是一个高阶函数（可以接受函数的函数叫做高阶函数）
    * @param f
    * @param param
    */
  def test2(f: Double => Double, param: Double) : Double = {
    f(param)
  }

  def sum(param: Double): Double ={
    param + 1
  }

  /**
    * 在 scala 中，可以把一个函数直接赋给一个变量,但是不执行函数
    */
  def test3: Unit ={
    val aa = printSTH _
    aa(("hello, world"))
  }

  def printSTH(param: String): Unit ={
    println(param)
  }

  /**
    * 使用化简的方式来计算 list 集合的和
    */
  def test4: Unit ={
    val list1 = List(1, 2, 3, 4, 5, 6)
    println(list1.reduceLeft(sum2))

  }

  def sum2(param1: Int, param2: Int): Int={
    return param1 + param2
  }

  /**
    * 循环删除集合中的元素
    */
  def test5: Unit ={
    val list = ListBuffer(1, 2, 3, 4, 5)
    val iterator = list.iterator
//    while(iterator.hasNext){
//      val value = iterator.next()
//      if (value == 3){
//        list.remove(value)
//      } else {
//        println(value)
//      }
//    }

    println("第二种循环方式")
    for(enum <- iterator){
      if (enum == 2){
        list.remove(enum)
      } else {
        println(enum)
      }
    }
  }









}
