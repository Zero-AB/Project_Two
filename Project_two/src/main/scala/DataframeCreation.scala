import org.apache.spark.sql.SparkSession

object DataframeCreation {

  def createDataframe(spark: SparkSession): Unit = {

    val df1 = spark.read.format("csv").option("header", "true").load("input/anch_data.csv")
    df1.show(5)
    println(df1.count())
    println(df1.describe())

    val df2 = spark.read.format("csv").option("header", "true").load("input/neth_data.csv")
    df2.show(5)
    println(df2.count())
    println(df2.describe())

    val df3 = spark.read.format("csv").option("header", "true").load("input/shang_data.csv")
    df3.show(5)
    println(df3.count())
    println(df3.describe("AvgTemperature"))


  }

}
