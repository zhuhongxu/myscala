package com.zhx.chapter05

/*
 * 函数式编程
 * @Author: 遗忘的哈罗德
 * @Date: 2019-01-09 15:02
 */
object FunctionProgram1 {

  /**
    * 一、函数声明的关键字为def（definition）
    * 二、返回值直接写=表示返回值类型不确定，要使用类型推倒来完成
    * 三、如果没有return，则最后一行的执行结果作为返回值
    * 四、函数的形参列表可以是多个, 如果函数没有形参，调用时 可以不带（）
    * 五、递归类型不能使用类型推断，必须指定返回的数据类型
    * @param args
    */
  def main(args: Array[String]): Unit = {
    function1()
    function2(24, "遗忘的哈罗德")
  }

  /**
    * 定义一个无参函数
    */
  def function1() : Unit = {
    println("我是一个无参函数")
  }

  /**
    * 定义一个有参函数
    * @param age
    * @param name
    */
  def function2(age : Int, name : String) : Unit = {
    println("我是一个有参函数")
  }

}
