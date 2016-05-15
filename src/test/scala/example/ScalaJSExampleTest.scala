package example

import org.scalajs.dom

import org.singlespaced.d3js.Ops._
import org.singlespaced.d3js.d3
import utest._

import scala.scalajs.js


object ScalaJSExampleTest extends TestSuite {

  import ScalaJSExample._


  val elem=dom.document.createElement("p")
  dom.document.body.appendChild(elem)
  val sel=d3.selectAll("p").data(js.Array(5))



  def tests = TestSuite {
    'ScalaJSExample {
      sel.attr("tabindex", (d:Int) => d*2 )

      assert("10" == elem.getAttribute("tabindex"))
    }
  }
}
