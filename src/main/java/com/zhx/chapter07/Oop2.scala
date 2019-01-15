package com.zhx.chapter07

/*
 * 面向对象编程中级
 * @Author: 遗忘的哈罗德
 * @Date: 2019-01-11 14:40
 */
object Oop2 {

  /**
    * 一、scala中包名和文件系统所在的目录可以不一致，在编译的时候，scala会以package为准重新生成对应的文件系统
    * 二、scala中默认引入java.lang.*，scala包，Predef包，但是引入相应的包并不意味着可以使用该包下的所有内容
    * 三、scala中存在嵌套包，子包可以使用父包中的内容，但是需要import
    * 四、父包要访问对应的子包时，也需要import相关的类
    * @param args
    */
  def main(args: Array[String]): Unit = {


    /**
      * 权限修饰符：
      * 一、在scala中，属性默认是private，方法默认是public的效果，但是scala中没有public关键字
      * 二、protected修饰的属性只能给子类使用，同包无法使用
      */

    /**
      * 引包：
      * 一、使用import引入，import可以出现在任何地方，并不局限于文件顶部
      * 二、java中引入包的所有类，可以通过通配符*，scala中采用_
      * 三、如果不想要某个包中全部的类，而是其中的几个类，可以采用选取器(大括号)如果不想要某个包中全部的类，而是其中的几个类，可以采用选取器(大括号)：import scala.collection.mutable.{HashMap, HashSet}
      */

    /**
      * 面向对象编程三大特性：封装、继承、多态
      */

  }
}
