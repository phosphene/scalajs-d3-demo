package example

import org.singlespaced.d3js.Ops._
import org.singlespaced.d3js.d3
import scala.scalajs.js
import js.JSConverters._

object ScalaJSChart extends js.JSApp {

  def main(): Unit = {
    val barMap = Map("barWidth" -> "450")
    val scSeq = Seq(24,35,45,12)
    // Seq to js.Array -- Copy to js.Array
    val jsArray: js.Array[Int] = scSeq.toJSArray
    val barChart = new BarChart
    val sel = barChart.buildChart(jsArray, barMap)
  }

}
