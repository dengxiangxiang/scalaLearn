package aboutType

object TypeInfer {
  def main(args: Array[String]): Unit = {
    val v1:String = "Hello World!"
    println(v1.getClass)

    val v2 = "Hello Scala!"
    println(v2.getClass)

    val v3 :Int= 123
    println(v3.getClass)

    val v4 = 1234
    println(v4.getClass)

    val v5 = 123456789012345L
    println(v5.getClass)

    val v6 = 0.1
    println(v6.getClass)

    val v7 = 0.1f
    println(v7.getClass)

    val v8 :Double= 0
    println(v8.getClass)
  }
}
