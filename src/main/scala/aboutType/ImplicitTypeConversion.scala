package aboutType
import java.security.InvalidParameterException
import java.util.{Calendar, Date}
import DateHelper._

import scala.language.implicitConversions


object ImplicitTypeConversion {
  def main(args: Array[String]): Unit = {
    val ago = "ago"
    val from_now = "from_now"

    val past = 2 days ago
    val appointment = 5 days from_now

    println(past)
    println(appointment)
  }


}

class DateHelper(val offset:Int){
  def days(str:String):Date ={

    var calendar :Calendar  = Calendar.getInstance()
    if(str.equals("ago")){
      calendar.add(Calendar.DAY_OF_YEAR,-offset)
    }else if(str.equals("from_now")){
      calendar.add(Calendar.DAY_OF_YEAR,offset)
    }else{
      throw new InvalidParameterException()
    }
    calendar.getTime

  }
}
object DateHelper{
  implicit def convertInt2DateHelper(offset:Int) :DateHelper = new DateHelper(offset)
}

