enablePlugins(JmhPlugin)

name := "scalikejdbc"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "3.1.1"
libraryDependencies ++= {
  val scalikejdbcVersion = "4.0.0"
  val quillVersion = "3.10.0"
  Seq(
    "org.scalikejdbc" %% "scalikejdbc" % scalikejdbcVersion,
    "com.h2database" % "h2" % "2.1.210",
    "com.typesafe" % "config" % "1.4.1",
    "com.typesafe.scala-logging" %% "scala-logging" % "3.9.4",
    "ch.qos.logback" % "logback-classic" % "1.2.10",
    "org.scalatest" %% "scalatest" % "3.2.10" % Test
  )
}
