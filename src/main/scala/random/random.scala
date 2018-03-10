package random
import org.apache.spark._

  object random  extends addition("ankur","pareek") {

    def main(args: Array[String]) {

      val conf = new SparkConf().setAppName("Spark Pi").setMaster("local[2]")
      val spark = new SparkContext(conf)
      val slices = if (args.length > 0) args(0).toInt else 2
      val n = math.min(100000L * slices, Int.MaxValue).toInt // avoid overflow

      val count =2*2

      println("Pi is roughly " + 4.0 * count / n)


      val y = new addition("","")

      println(y.x)
      println(y.y)


      spark.stop()
    }

  }


