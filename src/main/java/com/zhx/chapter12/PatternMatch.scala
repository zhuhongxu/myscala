package com.zhx.chapter12

/*
 * 模式匹配
 * @Author: 遗忘的哈罗德
 * @Date: 2019-01-14 21:45
 */
object PatternMatch {

  def main(args: Array[String]): Unit = {
//    test1
//    val b1: Short = 1;test2(b1)
  }

  /**
    * match....case
    * 如果所有 case 都不匹配，那么会执行 case _ 分支，类似于 Java 中 default 语句
    * 可以在 match 中使用其它类型，而不仅仅是字符
    * => 等价于 java swtich 的 :
    * => 后面的代码块到下一个case，是作为一个整体执行，可以使用{}扩起来，也可以不扩
    * 如果所有 case 都不匹配，又没有写 case _ 分支，那么会抛出 MatchError
    */
  def test1: Unit ={
    val operate = '-'
    val p1 = 10
    val p2 = 20
    var res = 0
    operate match {
      case '+' => res = p1 + p2
      case '-' => {
        res = p1 - p2
      }
      case '*' => {
        res = p1 * p2
      }
      case _ => println("没有匹配到")
    }
    println(res)
  }


  /**
    * 类型匹配
    */
  def test2(n1: Any): Unit ={
    n1 match {
      case a : String => println("参数是String类型")
      case b : Int => println("参数是Int类型")
      case a : Double => println("参数是Double类型")
      case a : Float => println("参数是Float类型")
      case a : Char => println("参数是Char类型")
      case a : Byte => println("参数是Byte类型")
      case _ => println("我也不知道参数是什么类型")
    }

  }
}
