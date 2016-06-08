package example

import org.singlespaced.d3js.Ops._
import org.singlespaced.d3js.d3
import scala.scalajs.js
import js.JSConverters._

object ScalaJSChart extends js.JSApp {

//here is an example main

  def main(): Unit = {
    //of relevance here is the barchart object and the data
    // the barMap is not yet utilized
    val barMap = Map("barWidth" -> "450")
    // the data:
    // the data here is merely a generic sequence
    // viz. The Seq trait represents sequences. A sequence is a kind of iterable
    //that has a length and whose elements have fixed index positions, starting
    // from 0.
    val scSeq = Seq(24,35,45,18)
    // a new barchart object
    // see Barchart
    val barChart = new BarChart
    val sel = barChart.buildChart(scSeq, barMap)
  }

}
