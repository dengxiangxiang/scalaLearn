package aboutType

import java.security.InvalidParameterException

//Nothing => Int Double Float =>AnyVal =>Any

//Nothing => Student Teacher =>AnyVal(Object) =>Any


object BasicType {
  def main(args: Array[String]): Unit = {
    var int = 0;
    var anyVal :AnyVal = 0
    anyVal = int

    var c = "Hello"
    var anyRef = null
//    anyRef = c //compile error

  }

  def sqt ( para:Double):Double={
    if(para>0){
      Math.sqrt(para)
    }else{
      throw new InvalidParameterException()
    }
  }

  def throwExp = {throw new NotImplementedError()}

  def commentOnTest (para:String) ={
    if(para.equals("Test")){
      Some("Good")
    }else{
      None
    }
  }

  def testOption={
    val str = "???"
    val res = commentOnTest(str).getOrElse("Not Found")
    print(res)

  }

  def fEither(input:Double)= {
    if (input > 0)
      Right(math.sqrt(input)) else
      Left("Error computing, invalid input")
  }
   def k(input: Int) = fEither(input)

}
