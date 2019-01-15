package com.zhx.chapter07

/*
 * 继承
 * @Author: 遗忘的哈罗德
 * @Date: 2019-01-11 15:26
 */
object Extends {
  def main(args: Array[String]): Unit = {
    /**
      * 一、obj.isInstanceOf[T]就如同Java的obj instanceof T 判断obj是不是T类型。
      * 二、obj.asInstanceOf[T]就如同 Java 的(T)obj 将 obj 强转成T类型。
      */
    var student = new Student
    println(student.isInstanceOf[Person])
  }
}

/**
  * 只有主构造器可以调用父类的构造器。辅助构造器不能直接调用父类的构造器。
  */
class Person{
  var name : String = _
  var age : Int = _
  def showInfo(): Unit = {
    println("学生信息如下:")
    println("名字:" + this.name)
  }
}

/**
  * 一、子类继承了父类，只是父类的私有属性不能访问，需要通过方法来访问
  * 二、 scala 明确规定，重写一个非抽象方法需要用 override 修饰符，调用超类的方法使用 super关键字
  * 三、覆写字段需使用 override 修饰
  */
class Student extends Person {
//  override var name : String = _
  def studying(): Unit = {
    //这里可以使用父类的属性
    println(this.name + "学习 scala 中....")
  }

  override def showInfo(): Unit = {
    super.showInfo()
  }
}
