package aboutType

import java._

object GenericTypeAndCollection {
  def main(args: Array[String]): Unit = {

    // Nothing => Sometype like Int =>Any


    var listOfNothing = new util.ArrayList
    var listOfInt = new util.ArrayList[Int]
    var listOfAny = new util.ArrayList[Any]

//    listOfInt = listOfNothing  //compile error
//    listOfAny = listOfInt //compile error

    var int :Int= 1
    var any :Any=null
    any = int





  }
}
