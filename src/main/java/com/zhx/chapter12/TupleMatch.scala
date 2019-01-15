package com.zhx.chapter12

/*
 * 匹配元组
 * @Author: 遗忘的哈罗德
 * @Date: 2019-01-15 14:51
 */
object TupleMatch {

  def main(args: Array[String]): Unit = {
    test1
  }

  /**
    * 说明：
    * 一、(0)匹配不到(0, _)或者(0, y)
    * 二、(0, 1)即可以匹配到(0, _)也可以匹配到(0, y)，但是只能匹配一个case
    */
  def test1: Unit ={
    val param = Array((0), (0, 1), (1, 2), (2, 3, 4), (5, 2, 9))
    for (one <- param){
      one match {
        case (0, _) => println("(0, _) " + one)
        case (x, y, z) => println("(x, y, z) " + one + " x = " + x + " y = " + y + " z = " + z)
        case (0, y) => println("(0, y) " + one + " y = " + y)
        case _ => println("什么都没匹配到")
      }
    }
  }

}
