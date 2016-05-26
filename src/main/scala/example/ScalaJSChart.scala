package example

import org.singlespaced.d3js.Ops._
import org.singlespaced.d3js.d3
import scala.scalajs.js

object ScalaJSChart extends js.JSApp {

  def main(): Unit = {
   val barChart = new BarChart
   val sel = barChart.buildChart(js.Array(24,35,45,12))
  }

}
