lazy val commonSettings = Seq(
  organization := "com.example",
  version := "0.1",
  scalaVersion := "2.13.1"
)

val baseDependencies = Seq(
  "org.scalatest" %% "scalatest" % "3.0.1" % "test",
  "org.scalatest" % "scalatest_2.13" % "3.1.1" % "test",
  "ch.qos.logback" % "logback-classic" % "1.2.3" % "Test",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.9.2"
)

lazy val root = (project in file("."))
    .settings(commonSettings: _*)
    .settings(
      name := "training",
      libraryDependencies ++= baseDependencies
    )
