package com.zhx.chapter02

/*
 * 变量的使用
 * @Author: 遗忘的哈罗德
 * @Date: 2019-01-07 19:45
 */
object Variate {

  /**
    * 一、scala是强类型语言，变量类型一旦确定后，就不可更改
    * 二、声明一个变量时，可以使用var或者val来修饰，var修饰的变量可改变，val修饰的变量不可改变，val修饰的变量在更改后等同加上了final
    * 三、val没有线程安全问题，效率高，scala的设计者推荐我们使用val
    * 四、变量声明时，必须初始化
    * 五、程序中+号的使用，当两边都是数值型，则做加法运算，当左右两侧有一方是字符串，则做拼接运算
    * @param args
    */
  def main(args: Array[String]): Unit = {
    //TODO: https://blog.csdn.net/anywn2/article/details/53464008
    //在scala中，整数默认为Int
    var age : Int = 24
    println("age : " + age)
    age = 48
    println("age : " + age)

    var name : String = "zhx"
    println("name : "  + name)

    //在scala中，小数默认为Double
    var weigh : Double = 74.88
    println("weigh : " + weigh)

    var score : Float = 78.5f
    println("score : " + score)

    println(1 + 1)
    println("1" + "1")
    println("1" + 1)

    //类型推导
    var num = 10
    println(num.isInstanceOf[Int])

    //值类型转换
    //一、值类型隐式转换：
    //1》当scala程序在复制或者运算时，精度(容量)小的类型自动转换为精度(容量)大的数据类型，这个就是自动类型转换（隐式转换）；
    val num2 = 5.6 + 10
    println(num2.isInstanceOf[Double])
    //2》反之，当我们把精度(容量)大 的数据类型赋值给精度(容量)小 的数据类型时，就会报错。
    var num3 = 10
    //num3 = 5.6，该句不能通过编译
    //3》(byte, short) 和 char 之间不会相互自动转换
    var num4 : Byte = 10
    //var num5 : Char = num4，该句不能通过编译
    //4》byte，short，char 他们三者可以计算，在计算时首先转换为 int 类型
    var num6 : Byte = 1
    var num7 : Short = 2
    var num8 : Char = 3
    println(num6 + num7 + num8)

    //二、强制类型转换，属于自动类型转换的逆过程，将容量大的数据类型转换为容量小的数据类型，使用时要加上强制转函数，有可能造成精度降低或者溢出
    var num9 : Int = 2.7.toInt
    println(num9.isInstanceOf[Int])//true
    println(num9)//值为2

    //三、1》基本类型转String类型，将基本类型的值加""即可
    var num10 : Int = 10
    println(num10.isInstanceOf[Int])//true
    var num10S = num10 + ""
    println(num10S.isInstanceOf[Int])//false
    //2》String类型转换为基本数据类型，通过基本类型的toXxx方法即可
    var num11 = "11"
    var num12 = num11.toInt
    var num13 = num11.toString
    var num14 = num11.toDouble



  }

}
