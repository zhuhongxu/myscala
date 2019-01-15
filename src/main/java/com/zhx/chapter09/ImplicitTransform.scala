package com.zhx.chapter09

/*
 * 隐式转换：
 * @Author: 遗忘的哈罗德
 * @Date: 2019-01-14 10:43
 */
object ImplicitTransform {

  def main(args: Array[String]): Unit = {
    val num : Int = 3.5;//如果没有transDouble2Int函数，改行代码将无法通过编译，原因：隐式转换不能由高精度转向低精度


    /**
      * 动态的给一个对象添加方法，查看编译后的代码：
      *   import com.zhx.chapter09.Mysql
      *   val mysql: Mysql = new Mysql
      *   mysql.insert()
      *   transMysql2Db(mysql).delete
      *   从class文件得知，该对象的类型并没有发生变化，而是调用动态增加的方法时，做了个临时转换
      */
    val mysql = new Mysql
    mysql.insert()
    mysql.delete()
    mysql.insert()

    /**
      * 隐式值也叫隐式变量（将变量标记为implicit的变量），编译器会在方法调用时省略掉方法的隐式参数，编译器
      * 会搜索作用域内的隐式值作为函数的参数
      */
    implicit var name = "hassan"
    fun3//输出：hassan, hello!






  }


  /**
    * 隐式转换函数是以implicit关键字声明的带有单个参数的函数，这种函数将会在当前作用域范围内自动应用，
    * 将值从一种类型转换为另一种类型。下面是隐式转换的注意细节：
    * 一、隐式转换与函数名无关，只与函数签名有关（参数类型和返回值类型）
    * 二、隐式转换函数可以有多个，但是需要在当前环境下，只有一个能匹配
    *
    */
  implicit def transDouble2Int(param : Double): Int = {
    param.toInt
  }

  implicit def transMysql2Db(param : Mysql): Db = {
    new Db
  }

  def fun3(implicit parm : String): Unit ={
    print(parm + ", hello!")
  }








}

class Mysql{
  def insert(): Unit ={
    println("mysql insert")
  }
}

class Db{
  def delete(): Unit ={
    print("Db.delete")
  }
}