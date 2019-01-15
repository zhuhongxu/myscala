package com.zhx.chapter05

/*
 *
 * @Author: 遗忘的哈罗德
 * @Date: 2019-01-09 17:35
 */
object Exception {
  def main(args: Array[String]): Unit = {
    try{
      println(function1(10, 0))
    } catch {
      case ex : ArithmeticException => {
        println(ex.getMessage)
      }
      case ex : Throwable => {
        println(ex.getMessage)
      }
    } finally {
      println("finally")
    }
  }

//  @throws(classOf[ArithmeticException])
  def function1(var1 : Int, var2 : Int) : Int = {
    return var1/var2
  }



}
