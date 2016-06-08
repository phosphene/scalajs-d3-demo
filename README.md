# scalajs-d3-demo

Demonstration of Test informed development of a Scala.js d3 facade application


This demo is based upon a fork of https://github.com/spaced/scala-js-d3-example-app


The most felicitous way in to understanding this simple demo is a simple test

    $ sbt test

some test code with comments is in [a test](/src/test/scala/example/BarChartTest.scala)


one can also run

    $ sbt fastOptJS

And when loading the repo [index page](index.html) in your browser you should see the results of the data defined in [main](src/main/scala/example/ScalaJSChart.scala)

The building of the barchart and the relevant d3 is now in [BarChart](src/main/scala/example/BarChart.scala)
