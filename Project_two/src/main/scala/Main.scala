import org.apache.spark.sql.SparkSession

object Main {

  def main(args: Array[String]): Unit = {

    println("Hello")
    System.setProperty("hadoop.home.dir", "C:\\hadoop")
    //create spark session
    val spark = SparkSession.builder
      .master("local[*]")
      .appName("ProjectOne")
      .enableHiveSupport()
      .getOrCreate()

    spark.sparkContext.setLogLevel("ERROR")
    println("created spark session")

   // spark.sql("create table test1(Region String,Country String, State String, City String, Month Int, Day Int, Year Int, AvgTemp Double) row format delimited fields terminated by ','");
   // spark.sql("LOAD DATA LOCAL INPATH 'input/anchorage_data.csv' INTO TABLE test1")
    spark.sql("SELECT * FROM test1").show()


  }

}
