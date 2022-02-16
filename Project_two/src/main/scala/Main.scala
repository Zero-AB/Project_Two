import org.apache.spark.sql.{SparkSession, functions}
import DataframeCreation._
import login.UserLogin


object Main {

  def main(args: Array[String]): Unit = {

    println("Hello")
    UserLogin()
    // create a spark session
    // for Windows
    System.setProperty("hadoop.home.dir", "C:\\hadoop")
    //create spark session
    val spark = SparkSession.builder
      .master("local[*]")
      .appName("ClimateChange")
      .enableHiveSupport()
      .getOrCreate()

    spark.sparkContext.setLogLevel("ERROR")
    println("created spark session")

    createDataframe(spark)

  }

}
