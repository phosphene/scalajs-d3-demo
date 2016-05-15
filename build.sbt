// Turn this project into a Scala.js project by importing these settings
enablePlugins(ScalaJSPlugin)

name := "Example"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.8"

persistLauncher in Compile := true

persistLauncher in Test := false



libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.9.0",
  "org.singlespaced" %%% "scalajs-d3" % "0.3.3",
  "com.lihaoyi" %%% "utest" % "0.4.3" % "test"
)

// uTest settings
testFrameworks += new TestFramework("utest.runner.Framework")
// use phantomjs for tests because d3 lib uses not features not supported by rhino
scalaJSUseRhino in Global := false
