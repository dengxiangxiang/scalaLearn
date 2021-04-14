package `trait`

object FuncAndClosure {
  def main(args: Array[String]): Unit = {
    val app = new Check with CreditCheck with  CriminalRecordCheck

    println(app.check)



  }
}

abstract class  Check{
  def check:String = "Checked Application Details..."
}

trait CreditCheck extends Check{
  override def check: String = s"CreditCheck...${super.check}"
}

trait  EmploymentCheck extends Check{
  override def check: String = s"EmploymentCheck...${super.check}"
}

trait CriminalRecordCheck extends Check {
  override def check: String = s"CheckCriminal Records...${super.check}"

}


