package example

import utest._
import org.scalajs.dom
import scala.scalajs.js
import js.JSConverters._

object BarChartTest extends TestSuite {

  def tests = TestSuite {
    'BarChart {
      val barChart = new BarChart
      val scSeq = Seq(24,25,35,36)
      // Seq to js.Array -- Copy to js.Array
      val jsArray: js.Array[Int] = scSeq.toJSArray
      val sel = barChart.buildChart(jsArray)
      val actual = dom.document.querySelectorAll("rect")
      assert(actual.length == 4)

    }
  }
}
