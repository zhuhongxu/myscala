package com.zhx.chapter13

/*
 * 函数式编程
 * 一、collect和map的区别：https://www.jianshu.com/p/fa2ed7ed391e
 * @Author: 遗忘的哈罗德
 * @Date: 2019-01-15 11:20
 */
object FunctionProgram2 {
  def main(args: Array[String]): Unit = {
//    test1
//    test5
      println(test6(sum, mod, 5.0))
  }


  /**
    * 偏函数
    */
  def test1: Unit ={
    //一、提出问题：将List(1, 2, 3, 4, "abc")中的所有数字+1，并返回一个新的集合，
    //要求忽略掉非数字的元素，即返回的新的集合形式为 (2, 3, 4, 5)
    val list = List(1, 2, 3, 4, "abc")

    //二、常规解决思路：filter + map
    //先把List中的非数字过滤掉，然后所有数字加一放入新集合
    //val result = test2(list)

    //三、更方便的解决方法：偏函数
    //val result = test3(list)

    //四、偏函数的简写
    //val result = test4(list)

    //五、比四更简洁的写法
    val result = list.collect{
      case i:Int => i + 1
    }

    println(result)

  }

  def test2(list: List[Any]): List[Int] = {
    list.filter(test22).map(test222)
  }

  def test22(param: Any): Boolean = {
    param.isInstanceOf[Int]
  }

  def test222(param: Any): Int = {
    param.toString.toInt + 1
  }

  def test3(list: List[Any]): List[Int] = {
    list.collect(test33)
  }

  /**
    * 定义一个偏函数
    * @return
    */
  def test33 = new PartialFunction[Any, Int] {
    /**
      * 如果该方法返回true，那么就会执行下面的apply方法进行构建对象
      * @param x
      * @return
      */
    override def isDefinedAt(x: Any): Boolean = {
      x.isInstanceOf[Int]
    }


    override def apply(v1: Any): Int = {
      v1.toString.toInt + 1
    }
  }


  def test4(list: List[Any]): List[Int] = {
    list.collect(test44)
  }

  def test44: PartialFunction[Any, Int] = {
    case i:Int => i + 1
  }

  /**
    * 匿名函数:
    * 一、不需要写 def 函数名
    * 二、不需要写返回类型，使用类型推导
    * 三、= 变成 =>
    */
  def test5: Unit ={
    val fun = (param : Double) => {
      param * 2
    }

    println(fun(2))
  }

  /**
    * 高阶函数：能接受函数的函数
    */
  def test6(f : Double => Double, f2: Double => Int, n1: Double)= {
    f(f2(n1))
  }

  def sum(d: Double): Double = {
    d + d
  }

  def mod(d:Double): Int = {
    d.toInt % 2
  }
}
