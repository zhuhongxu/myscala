package com.zhx.chapter04
import util.control.Breaks._

/*
 * 流程控制
 * @Author: 遗忘的哈罗德
 * @Date: 2019-01-08 15:36
 */
object ProcessControl {

  def main(args: Array[String]): Unit = {
//    testIf(1)
//    testFor()
//    testWhile()
//    testDoWhile()
//    testBreak()
    testContinue()
  }


  /**
    * if else注意事项：如果{}内的代码只有一行，则{}可以省略，这点和java一样
    * @param a
    */
  def testIf(a : Int) : Unit = {
    if (a > 30){
      println("111")
    } else if (a > 20){
      println("222")
    } else if (a > 10){
      println("333")
    } else{
      println("444")
    }
  }

  def testFor() : Unit = {
    //前闭后闭
    println("---------------------------")
    for (i <- 1 to 3){
      println(i)
    }
    println("---------------------------")
    //前闭后开
    for (i <- 1 until 3){
      println(i)
    }
    println("---------------------------")
    //循环守卫，因为if是关键字，所以if之前不用加分号，表示如果i不等于2，才进入循环体
    for (i <- 1 to 3 if i != 2){
      println(i)
    }
    println("---------------------------")
    //引入变量，因为j不是关键字，所以之前要加分号用作区分
    for (i <- 1 to 3; j = 100 - i){
      println(j)
    }
    //嵌套循环
    println("---------------------------")
    for (i <- 1 to 3; j <- 1 to 5){
      println(i)
    }
    //循环返回值（将遍历过程中处理的结果返回到一个新的Vector集合中，使用yield关键字）
    println("---------------------------")
    val res = for(i <- 1 to 10) yield {
      if (i % 2 == 0) {
        i
      }else {
        "不是偶数"
      }
    }
    println(res)
    //使用Range控制步长
    println("---------------------------")
    for(i <- Range(1, 10, 2)){
      println(i)
    }
    //使用循环守卫控制步长
    println("---------------------------")
    for (i <- 1 to 10 if i % 2 == 1) {
      println("i = " + i) }
  }

  def testWhile() : Unit = {
    var i = 0
    while (i < 10){
      println(i)
      i += 1
    }
  }

  /**
    * 注意，do while是先执行再判断
    */
  def testDoWhile() : Unit = {
    var i = 0
    do {
      println(i)
      i += 1
    } while (i < 10)
  }

  /**
    * 在scala中没有switch，而是使用模式匹配来处理，关于模式匹配，后续在测试
    * @param b
    */
  def testSwith(b : String) : Unit = {

  }

  /**
    * 一、scala中没有break这个关键字，只有break()这个中断方法
    * 二、break()这个中断方法会抛出异常，如果不把这个异常捕获，则代码无法继续向后执行
    * 三、breakable()方法可以用来捕获break()抛出的异常，事实上，breakable()这个方法接收的是一个代码片段（函数式编程），然后捕获并处理异常
    *
    */
  def testBreak() : Unit = {
    breakable{
      for(i <- 1 to 10){
        println(i)
        if (i == 8){
          break()
        }
      }
    }
  }

  /**
    * scala中没有continue这个关键字，需要自己在程序中控制
    */
  def testContinue() : Unit = {
    for (i <- 1 to 10){
      if (i != 5 && i != 8){
        println(i)
      }
    }
  }

}
