package com.zhx.chapter10

/*
 * Set
 * @Author: 遗忘的哈罗德
 * @Date: 2019-01-14 16:16
 */
object SetDemo {

  /**
    * 默认情况下，Scala 使用的是不可变集合，如果你想使用可变集合，需要引用 scala.collection.mutable.Set 包
    * @param args
    */
  def main(args: Array[String]): Unit = {
//    test1
    test2
  }

  /**
    * 不可变Set
    */
  def test1: Unit ={
    val set1 = Set(1, 2, 3, 4, 4)
//    set1.add(5);无法通过编译，因为默认是不可变集合
    println(set1)
//    set1.remove(1);无法通过编译，因为默认是不可变集合
  }

  /**
    * 可变Set
    */
  def test2: Unit ={
    val set1 = scala.collection.mutable.Set(1, 2, 3, 4, 4)
    set1.add(5)
    println(set1)
    set1.remove(1)
    println(set1)

    for (item <- set1){
      println(item)
    }
  }

}
