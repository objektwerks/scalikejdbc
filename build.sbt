enablePlugins(JmhPlugin)

name := "scalikejdbc"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "2.13.6"
libraryDependencies ++= {
  val scalikejdbcVersion = "3.5.0"
  val quillVersion = "3.9.0"
  Seq(
    "org.scalikejdbc" %% "scalikejdbc" % scalikejdbcVersion,
    "com.h2database" % "h2" % "1.4.200",
    "com.typesafe" % "config" % "1.4.1",
    "com.typesafe.scala-logging" %% "scala-logging" % "3.9.4",
    "ch.qos.logback" % "logback-classic" % "1.2.5",
    "org.scalatest" %% "scalatest" % "3.2.10" % Test
  )
}
