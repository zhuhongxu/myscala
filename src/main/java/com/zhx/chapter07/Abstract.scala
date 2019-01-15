package com.zhx.chapter07

/*
 * 抽象类
 * @Author: 遗忘的哈罗德
 * @Date: 2019-01-11 15:39
 */
object Abstract {

}

/**
  * 一、在 Scala 中，通过 abstract 关键字标记不能被实例化的类。方法不用标记 abstract，只要省掉方法体
  * 即可。抽象类可以拥有抽象字段，抽象字段/属性就是没有初始值的字段
  * 二、抽象类不一定要包含 abstract 方法。也就是说,抽象类可以没有 abstract 方法
  * 三、一旦类包含了抽象方法或者抽象属性,则这个类必须声明为 abstract
  * 四、抽象方法不能有主体，不允许使用 abstract 修饰
  * 五、如果一个类继承了抽象类，则它必须实现抽象类的所有抽象方法和抽象属性，除非它自己也声
  * 明为 abstract 类
  * 六、抽象方法和抽象属性不能使用 private、final 来修饰，因为这些关键字都是和重写/实现相违背的
  * 七、抽象类中可以有实现的方法.
  * 八、子类重写抽象方法不需要 override，写上也不会错.
  */
abstract class Animal{
  var name : String
  def cry()
}
