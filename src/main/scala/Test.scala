object Test extends App {
  print("hello!!")

  val list = List(1,2,3,4)

  val find = list.find(_ % 2 == 0).map(_*2)
  println(find)
  val filter = list.filter(_ % 2 == 0).map(_*2)
  println(filter)
}
