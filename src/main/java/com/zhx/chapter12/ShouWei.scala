package com.zhx.chapter12

/*
 * 守卫：如果想要表达匹配某个范围的数据，就需要在模式匹配中增加条件守卫
 * @Author: 遗忘的哈罗德
 * @Date: 2019-01-15 12:02
 */
object ShouWei {
  def main(args: Array[String]): Unit = {
    test1
  }

  /**
    * 一、只要匹配到任意一个case，就认为已经匹配到了，不再执行下面的case
    * 二、case _ if后的表达式如果是true，也算匹配到
    */
  def test1: Unit ={
    val operate = "8"
    operate match {
      case "8" => println("111")
      case "9" => println("222")
      case _ if(operate.toString.toInt > 7) => println("333")
      case _ => println("444")
    }
  }


}
