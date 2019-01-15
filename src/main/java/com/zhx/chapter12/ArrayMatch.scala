package com.zhx.chapter12

/*
 * 匹配数组：
 * 一、Array(0)匹配只有一个元素的数组，且该元素的值为0
 * 二、Array(x, y)匹配有两个元素的数组，并将这两个元素赋值给x，y
 * 三、Array(0, _*)匹配元素的值从0开始的数组
 * @Author: 遗忘的哈罗德
 * @Date: 2019-01-15 14:29
 */
object ArrayMatch {

  def main(args: Array[String]): Unit = {
    test1
  }

  /**
    * 说明：Array(0)即表示只有一个为0的数组，也表示起始元素为0的数组，但是只可以匹配一个case
    */
  def test1: Unit ={
    val arrs = Array(Array(0), Array(1, 2), Array(1, 2, 3, 4, 5), Array(0, 1, 2), Array(1, 3, 5))
    for(arr <- arrs){
      val result = arr match {
        case Array(0) => arr.toVector + ": 只有一个为0的元素"
        case Array(x, y) => arr.toVector +  ": x = " + x + ", y = " + y
        case Array(0, _*) => arr.toVector + ": 从0开始的数组"
        case _ => arr.toVector + "什么都不是"
      }
      println(result)
    }
  }

}
