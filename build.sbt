lazy val commonSettings = Seq(
  organization := "com.example",
  version := "0.1",
  scalaVersion := "2.13.1"
)

val baseDependencies = Seq(
  "org.scalatest" %% "scalatest" % "3.1.1" % "test",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.9.2"
)

lazy val root = (project in file("."))
    .settings(commonSettings: _*)
    .settings(
      name := "training",
      libraryDependencies ++= baseDependencies
    )
