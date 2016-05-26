package example

import utest._
import org.scalajs.dom
import scala.scalajs.js


object BarChartTest extends TestSuite {

  def tests = TestSuite {
    'BarChart {
      val barChart = new BarChart
      val sel = barChart.buildChart(js.Array(24,25,35,36))
      val actual = dom.document.querySelectorAll("rect")
      assert(actual.length == 4)

    }
  }
}
