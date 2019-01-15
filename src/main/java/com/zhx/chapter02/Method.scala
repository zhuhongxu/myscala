package com.zhx.chapter02

/*
 * 方法
 * @Author: 遗忘的哈罗德
 * @Date: 2019-01-08 11:13
 */
object Method {

  def main(args: Array[String]): Unit = {

    println("Unit的返回值实例：" + sayHello())

    //null值只能赋值给引用类型，不能赋值给值类型（虽然能够通过编译）
    val dog : Dog = null
  }

  def sayHello(): Unit = {

  }



}

class Dog{

}
