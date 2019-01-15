package com.zhx.chapter10

/*
 * 元组
 * @Author: 遗忘的哈罗德
 * @Date: 2019-01-12 00:12
 */
object TupleDemo {

  /**
    * 一、将多个无关的数据封装为一个整体，成为元组
    * 二、元组可以理解为一个容器，可以存放各种相同或者不同类型的数据
    * 三、元组中最大只能有22个元素
    * 四、为了高效的操作元组 ， 编译器根据元素的个数不同，对应不同的元组类型
    * @param args
    */
  def main(args: Array[String]): Unit = {
    val tuple5 = (1, 2, 3, "hello", 4)
    println(tuple5.getClass)
    println(tuple5)

    for(item <- tuple5.productIterator){
      println(item)
    }
  }
}
