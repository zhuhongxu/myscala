package com.zhx.chapter11

/*
 *
 * @Author: 遗忘的哈罗德
 * @Date: 2019-01-14 17:43
 */
object MapDemo2 {
  def main(args: Array[String]): Unit = {
//    test1
//    test2
//    test3
    test4
  }

  /**
    * 需求，将List(3,5,7)中的所有元素都*2，并返回一个新集合：
    * list.map(multiple) 做了什么?
    * 1. 将 list 这个集合的元素 依次遍历
    * 2. 将各个元素传递给 multiple 函数 => 新 Int
    * 3. 将得到新 Int ,放入到一个新的集合并返回
    * 4. 因此 multiple 函数调用 3
    */
  def test1: Unit ={

    val list = List(3, 5, 7, 9)
    val list2 = list.map(multiple)
    println(list2)

  }

  def multiple(n: Int): Int = {
    n*2
  }

  /**
    * List(Z, H, X, J, Y, Q, Y, M, S)
    */
  def test2: Unit ={
    val list1 = List("zHx", "jyq", "Yms")
    val list2 = list1.flatMap(toUpperCase)
    println(list2)

  }

  def toUpperCase(param: String): String={
    return param.toUpperCase()
  }

  /**
    * 选出首字母为a的元素
    */
  def test3: Unit ={
    val list1 = List("zHx", "ayq", "ams")
    val list2 = list1.filter(startWithA)
    println(list1)
    println(list2)
  }

  def startWithA(param : String): Boolean={
    param.startsWith("a")
  }

  /**
    * 测试map和flatMap的区别
    */
  def test4: Unit ={
    //reference: https://blog.csdn.net/bitcarmanlee/article/details/52983607
    val li = List(1,2,3)

    //flatMap中接受的函数的返回值只能是List，否则不能通过编译，并且flatMap会把返回的List平铺开，但是map不会，返回是什么样就是什么样
    val flatMapRes = li.flatMap(x => x match {
      case 3 => List('a','b')
      case _ => List(x*2)
    })
    println("flatMap : " + flatMapRes)


    val mapRes = li.map(x => x match {
      case 3 => List('a','b')
      case _ => x*2
    })
    println("map : " + mapRes)
  }

}
