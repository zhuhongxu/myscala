package com.zhx.chapter10

/*
 * Map
 * @Author: 遗忘的哈罗德
 * @Date: 2019-01-14 15:49
 */
object MapDemo {

  /**
    * scala中不可变的Map（Map(scala.collection.immutable.Map）是有序的，可变的Map（scala.collection.mutable.Map）是无序的
    * @param args
    */
  def main(args: Array[String]): Unit = {

//    test1
//    test2
    test3
  }

  /**
    * 不可变Map：有序
    * 1.默认 Map 是 immutable.Map
    * 2.key-value 类型支持 Any
    * 3.在 Map 的底层，每对 key-value 是 Tuple2
    */
  def test1: Unit = {
    val map1 = Map("zhx"->20, "jyq"->30, "yms"->25)
    println(map1)
  }


  /**
    * 可变Map:无序
    * 1、如果我们确定 map 有这个 key ,则应当使用 map(key), 速度快
    * 2、如果我们不能确定 map 是否有 key ,而且有不同的业务逻辑，使用 map.contains() 先判断在加入
    */
  def test2: Unit ={
    val map1 = scala.collection.mutable.Map("zhx"->20, "jyq"->30, "yms"->25)
    println(map1)
    println(map1("zhx"))

    //是否包含
    println(map1.contains("zzz"))
    println(map1.contains("zhx"))

    //key不存在，抛出异常：NoSuchElementException
//    println(map1("zzz"))
    println(map1.getOrElse("bbb", 10))


    //创建一个空的映射
    val map2 = new scala.collection.mutable.HashMap[String, Int]
    println(map2)

    //添加元素
    map2("aaa") = 111
    println(map2)
    map2("aaa") = 222//直接覆盖
    println(map2)
    //发现这样的写法，map2本身并没有发生变化而是生成了一个新map
    map2 + ("bbb"->333, "ccc"->444, "ddd"->555)
    val map3 = map2 + ("bbb"->333, "ccc"->444, "ddd"->555)
    println(map2)
    println(map3)
    //如果 key 存在，就删除，如果 key 不存在，也不会报错.
    map3 -= ("aaa", "bbb", "fff")
    println(map3)
  }

  def test3: Unit ={
    val map1 = scala.collection.mutable.Map("zhx"->20, "jyq"->30, "yms"->25)
    for ((k,v) <- map1){
      println("k : " + k + ", v : " + v)
    }
  }

}
