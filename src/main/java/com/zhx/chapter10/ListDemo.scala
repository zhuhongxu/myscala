package com.zhx.chapter10

import scala.collection.mutable.ListBuffer

/*
 * 集合
 * @Author: 遗忘的哈罗德
 * @Date: 2019-01-12 00:19
 */
object ListDemo {

  /**
    * Scala中的List和Java List不一样，在Java中List是一个接口，真正存放数据是ArrayList，而Scala的List可以直接存放数据，
    * 就是一个object，默认情况下Scala的List是不可变的，List 属于序列 Seq。
    * @param args
    */
  def main(args: Array[String]): Unit = {
//    testList1()
//    testList2
    testList3
  }

  /**
    * 不可变List：
    * Scala 中的 List 和 Java List 不一样，在Java中 List是一个接口，真正存放数据是 ArrayList，而Scala的List可以直接存放数据，
    * 就是一个 object，默认情况下Scala 的 List 是不可变的，List属于序列 Seq。
    */
  def testList1(): Unit ={
    val list1 = List(1,2,3)
    println(list1.toVector)

    //向后加一个元素
    val list2 = list1 :+ 5
    println(list2)

    //向前加一个元素
    val list3 = 8 +: list2
    println(list3)

    //定义一个空集合
    val list4 = Nil
    println(list4)
  }

  /**
    * 在列表的最后增加数据，说明：
    * 一、符合::表示向集合中添加元素
    * 二、添加的顺序是从右向左
    * 三、运算时，集合要放在最右边
    */
  def testList2: Unit ={
    /**
      * 运行结果：
      * List(1, 2, 3)
      * List(1, 2, 3)
      * List(1, 2, 3)
      * 说明源集合没有发生变化，只是又生成了新的集合
      */
    val list1 = List(1, 2, 3)
    println(list1)
    4 :: list1
    println(list1)
    7 :: 6 :: 5 :: list1
    println(list1)

    val list2 = 7 :: 6 :: 5 :: 4 :: list1
    println(list2)
  }


  /**
    * ListBuffer 是可变的 list 集合，可以添加，删除元素,ListBuffer 属于序列
    */
  def testList3: Unit = {
    var list1 = ListBuffer(1, 2, 3)
    println("测试通过下标获取数据")
    println(list1(1))
    println(list1(2))

    println("测试添加元素")
    list1 += 4
    list1 += 5
    list1.append(6)
    list1.append(7)
    list1.append(8)

    println("测试for循环")
    for(item <- list1){
      println(item)
    }

  }
}
