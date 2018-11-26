import org.apache.spark.sql.SparkSession

object SparkWordcount extends App {

  val spark = SparkSession.builder.appName("My App").master("local[*]").getOrCreate()

  import spark.implicits._

  val df = spark.read.option("header", "true").option("delimiter",",") csv("people.csv")
  df.printSchema()
}