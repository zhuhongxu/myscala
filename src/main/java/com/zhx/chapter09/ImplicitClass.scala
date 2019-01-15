package com.zhx.chapter09

/*
 * 隐式类
 * @Author: 遗忘的哈罗德
 * @Date: 2019-01-14 11:36
 */
object ImplicitClass {
  def main(args: Array[String]): Unit = {
    implicit class Sqlserver(param : Oracle){
      def addSuffix(): String = {
        "scala" + param
      }
    }


    /**
      * 使用隐式类Sqlserver动态的给oracle这个对象添加了addSuffix方法
      */
    val oracle = new Oracle
    println(oracle)
    oracle.query
    println(oracle.addSuffix())
  }
}

class Oracle{
  def query: Unit ={
    println("query something...")
  }
}
