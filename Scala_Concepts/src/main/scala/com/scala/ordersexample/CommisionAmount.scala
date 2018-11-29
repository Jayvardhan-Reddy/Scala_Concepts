import java.sql.DriverManager
import java.sql.Connection

case class EmployeeCommission(fname: String, lname: String,
                              salary: Double, commission_amt: Double){

  override def toString(): String = {
    s"First name:" + fname + "Last name:" + lname + "Commission Amount" + commAmt()
  }

  def commAmt(): Any ={
    if(commission_amt == null){
      "Not a valid amount"
    }
    else commission_amt * salary
  }
}

object CommisionAmount {
  def main(args: Array[String]): Unit = {
    val driver = "com.mysql.jdbc.Driver"
    val url = "jdbc:mysql://nn01.itversity.com:3306/hr"   //1:23:54 - chk this tym video 4 for adress
    val username = "hr_ro"
    val password = "itversity"

    Class.forName(driver)
    val connection = DriverManager.getConnection(url, username, password)
    val statement = connection.createStatement()
    val resultSet = statement.executeQuery(s"SELECT fname, lname," +
        "salary, commission_amt FROM employees" )

    while(resultSet.next()){
     val e = EmployeeCommission(resultSet.getString("fname"),
        resultSet.getString("lname"),
        resultSet.getDouble("salary"),
        resultSet.getDouble("commission_amt"))
      println(e)

    }
  }
}
