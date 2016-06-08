# scalajs-d3-demo

Demonstration of Test informed development of a Scala.js d3 facade application


This is currently a skeleton based upon a fork of https://github.com/spaced/scala-js-d3-example-app


The most felicitous way in to understanding this simple demo is this simple test

    $ sbt test

https://github.com/phosphene/scalajs-d3-demo/blob/master/src/test/scala/example/BarChartTest.scala


one can also run

    $ sbt fastOptjs

And when loading the repo [index page](index.html) in your browser you should see the results of the data defined in [main](src/main/scala/example/ScalaJSChart.scala)

The building of the barchart and the relevant d3 is now in [BarChart](src/main/scala/example/BarChart.scala)
