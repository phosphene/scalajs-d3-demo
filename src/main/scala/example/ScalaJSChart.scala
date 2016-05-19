package example

import org.singlespaced.d3js.Ops._
import org.singlespaced.d3js.d3
import scala.scalajs.js

object ScalaJSChart extends js.JSApp {

  def main(): Unit = {
   val barChart = new BarChart
   var list = List(24,25,35,36)
   var jsArray = list.asInstanceOf[js.Array[Int]]
   val sel = barChart.buildChart(jsArray)
  }

}
