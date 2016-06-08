package example

import utest._
import org.scalajs.dom
import scala.scalajs.js
import js.JSConverters._

object BarChartTest extends TestSuite {

  def tests = TestSuite {
    'BarChart {
      val barChart = new BarChart
      val barMap = Map("barWidth" -> "450")

      // the data is in the form of a generic sequence
      // The Seq trait represents sequences.
      // A sequence is a kind of iterable that has a length
      //  and whose elements have fixed index positions, starting from 0.
      val scSeq = Seq(24,25,35,36)

      //build a chart with data and with barMap provisos
      //barMap is not utiilized yet
      val sel = barChart.buildChart(scSeq, barMap)

      //find all my bars
      val actual = dom.document.querySelectorAll("rect")

      //how many bars do I have in my chart?
      //I should have same as sequence length
      assert(actual.length == scSeq.length)

    }
  }
}
