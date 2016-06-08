package example

import org.singlespaced.d3js.Ops._
import org.singlespaced.d3js.d3
import scala.scalajs.js
import js.JSConverters._

object ScalaJSChart extends js.JSApp {

  def main(): Unit = {
    val barMap = Map("barWidth" -> "450")
    // the data:
    // the data here is merely a generic sequence
    // viz. The Seq trait represents sequences. A sequence is a kind of iterable
    //that has a length and whose elements have fixed index positions, starting
    // from 0.
    val scSeq = Seq(24,35,45,18)
    // a new barchart object
    val barChart = new BarChart
    val sel = barChart.buildChart(scSeq, barMap)
  }

}
