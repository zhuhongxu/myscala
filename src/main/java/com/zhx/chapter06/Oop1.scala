package com.zhx.chapter06

import scala.beans.BeanProperty

/*
 * 面向对象编程基础
 * @Author: 遗忘的哈罗德
 * @Date: 2019-01-09 17:44
 */
object Oop1 {
  def main(args: Array[String]): Unit = {
    /**
      * 如何创建一个对象？
      * 一、如果我们不希望改变对象的引用，那么声明为val（推荐），否则声明为var
      * 二、 scala在声明对象变量时，可以根据创建对象的类型自动推断，所以类型声明可以省略，但当类型和后面 new 对象类型有继承关系即多态时，就必须写了
      */
    val cat = new Cat("花花", 3)
    println(cat)

    /**
      * 主构造器参数：
      * 一、在Scala中，如果主构造器的形参未用任何修饰符修饰，那么这个变量是方法的局部变量
      * 二、如果主构造器的形参使用val修饰，那么Scala会将该参数作为类的私有只读属性使用，不可写
      * 三、如果主构造器的形参使用var修饰，那么Scala会将该参数作为类的私有成员属性使用，可读可写。
      *
      */
//    cat.inName = "aaa"

    /**
      * Bean属性：
      * 给某个属性加上@BeanPropertry属性后，会生成对应的set，get方法
      */
    cat.setSex("男")
    println(cat.getSex)





  }
}

/**
  * 如何定义一个类？
  * 一、在scala中，声明一个属性，必须显式地初始化，属性类型可以省略，然后会自动进行类型推断
  * 二、如果初始化当值为null，并且省略了类型，那么该属性的类型就是Null类型
  * 三、如果不想初始化，那么可以使用_，让系统自动分配默认值，例如：var age : Int = _
  */
/**
  * 关于构造器的一些说明：
  * 一、scala中构造器的作用是完成对新对象对初始化，构造器没有返回值
  * 二、主构造器的声明直接放置在类名之后（通过反编译可以一目了然）
  * 三、主构造器会执行类定义中的所有语句
  * 四、如果主构造器是无参构造器，那么小括号可以省略，构建对象时调用的构造方法的小括号也可以省略
  * 五、辅助构造器的名称为this，多个辅助构造器通过不同参数列表进行区分
  * 六、如果想让主构造器变成私有的，可以在()之前加上private，这样用户就只能通过辅助构造器来构造对象了，eg：class Dog private(){}
  * @param inName
  * @param inAge
  */
class Cat(inName : String, inAge : Int) {
  var name : String = inName
  var age : Int = inAge


  @BeanProperty
  var sex : String = _

  /**
    * 这是一个辅助构造器，方法体对第一句必须要调用主构造器器（定义的方法名出），目的是为了和父类发生联系（因为主构造器的第一句话默认调用父类构造器）
    * @param name
    */
  def this(name : String){
    this("aaa", 10)
    this.name = name
  }

  override def toString: String = {
    return "name : " + name + " + age + " + age
  }
}