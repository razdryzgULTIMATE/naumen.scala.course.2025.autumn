name := "Lecture4"

version := "0.1"

scalaVersion := "2.13.16"

libraryDependencies += "com.lihaoyi" %% "utest" % "0.8.2" % "test"

testFrameworks += new TestFramework("utest.runner.Framework")