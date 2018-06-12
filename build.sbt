enablePlugins(ScalaJSPlugin)
jsEnv := new org.scalajs.jsenv.jsdomnodejs.JSDOMNodeJSEnv()

testFrameworks += new TestFramework("utest.runner.Framework")

name := "scalaJSTutorial"

version := "0.1"

scalaVersion := "2.12.6"

scalaJSUseMainModuleInitializer := true

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.5"

libraryDependencies += "org.querki" %%% "jquery-facade" % "1.2"

libraryDependencies += "com.lihaoyi" %%% "utest" % "0.6.3" % "test"