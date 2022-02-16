import scala.io.StdIn._
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions._
object login {
  def UserLogin(spark: SparkSession): Unit = {
    print("Please enter your credentials:\nUsername:\t")
    val user = readLine()
    print("Password:\t")
    val pass = readLine()
    val df4 = spark.read.format("csv").option("header", "true").load("input/user_data.csv")
    val dfuser = df4.select("*").where(df4("Username")===user).show()
    val a = dfuser.
//    if (user == dfuser & pass == dfuser) {
//
//    } else {
//
//    }
  }
}
