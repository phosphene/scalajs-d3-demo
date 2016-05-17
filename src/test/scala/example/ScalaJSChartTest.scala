package example


import utest._
import org.scalajs.dom

object ScalaJSChartTest extends TestSuite {

  import ScalaJSChart._
  val elem=dom.document.createElement("p")
  dom.document.body.appendChild(elem)


  def tests = TestSuite {
    'ScalaJSChart {
      ScalaJSChart.main()
      val actual=dom.document.getElementsByTagName("body")
      println(actual.length)
      println( actual.item(0).asInstanceOf[dom.Element].getAttribute("width"))

    }
  }
}
