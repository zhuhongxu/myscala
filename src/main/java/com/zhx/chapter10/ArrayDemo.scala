package com.zhx.chapter10

import scala.collection.mutable.ArrayBuffer


/*
 * 数组
 * @Author: 遗忘的哈罗德
 * @Date: 2019-01-11 23:25
 */
object ArrayDemo {
  def main(args: Array[String]): Unit = {
//    testArray1()
//      testArray2()
//    testArray3
    scalaArray2JavaList

  }

  /**
    * 定长数组
    */
  def testArray1(): Unit ={
    //定义一个长度为3的数组
    val arr1 = new Array[Int](3)
    arr1(1) = 100
    //打印数组
    println(arr1.toVector)
    //循环数组
    for (i <- arr1){
      println(i)
    }

    //定义数组的第二种方式：底层是使用apply方法
    val arr2 = Array(1,2)
    println(arr2.toVector)
  }

  /**
    * 可变数组:每append一次，arr在底层会重新分配空间，进行扩容，arr2的内存地址会发生变化，也就成为新的ArrayBuffer
    */
  def testArray2(): Unit ={
    //定义一个可变长度的数组
    val arr1 = ArrayBuffer[Int]()
    arr1.append(100)
    println(arr1.toVector)

    //也可以直接初始化，然后append
    val arr2 = ArrayBuffer[Int](1,2,5)
    arr2.append(10)
    println(arr2.toVector)
  }

  /**
    * 定长数组和可变数组之间互相转换：不管如何转换，源数组并没有发生任何变化，只不过又产生了一个新的数组
    */
  def testArray3: Unit = {
    //定长转不定长
    val arr1 = new Array[Int](3)
    var arr11 = arr1.toBuffer
    println(arr11.toVector)

    //不定长转定长
    var arr2 = ArrayBuffer[Int](1, 2,3)
    var arr22 = arr2.toArray
    println(arr22.toVector)
  }

  /**
    * scala数组转java集合
    */
  def scalaArray2JavaList: Unit ={
    val arr = ArrayBuffer("1", "2", "3")
    println(arr)
    import scala.collection.JavaConversions.bufferAsJavaList
    val process = new ProcessBuilder(arr) //之所以编译通过，是因为使用了bufferAsJavaList这个隐式转换方法
    val javaList = process.command()
    println(javaList)

  }

}
