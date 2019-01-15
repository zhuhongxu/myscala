package com.zhx.chapter03

/*
 * 运算
 * @Author: 遗忘的哈罗德
 * @Date: 2019-01-08 15:21
 */
object Calculate {

  def main(args: Array[String]): Unit = {
    //一、基本运算符
    var r1 : Int = 10 / 3
    println("r1 = " + r1)

    var r2 : Double = 10 / 3
    println("r2 = " + r2)

    //注意:Scala 中没有++、--操作符，需要通过+=、-=来实现同样的效果

    //练习:假如还有 97 天放假，问:xx 个星期零 xx 天
    val days = 97
    println("统计结果是%d个星期零%d天", days / 7, days % 7)

    //二、关系运算符
    println(3 == 4)
    println(3 != 4)
    println(3 > 4)
    println(3 <= 4)

    //三、逻辑运算符
    println(true && false)
    println(true || false)
    println(!true)

    //四、赋值运算符
    var r3 = 10
    println(r3)
    r3 += 5
    println(r3)
    r3 -= 3
    println(r3)
    r3 *= 3
    println(r3)
    r3 /= 6
    println(r3)
    r3 %= 5
    println(r3)

    //五、scala不支持三目运算符，在scala中应当使用if else实现
    var r4 = if (5 > 4) 5 else 4
    println(r4)
  }



}
