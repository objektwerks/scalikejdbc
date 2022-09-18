enablePlugins(JmhPlugin)

name := "scalikejdbc"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "3.2.1-RC2"
libraryDependencies ++= {
  val scalikejdbcVersion = "4.0.0"
  val quillVersion = "3.10.0"
  Seq(
    "org.scalikejdbc" %% "scalikejdbc" % scalikejdbcVersion,
    "com.h2database" % "h2" % "2.1.214",
    "com.typesafe" % "config" % "1.4.2",
    "com.typesafe.scala-logging" %% "scala-logging" % "3.9.5",
    "ch.qos.logback" % "logback-classic" % "1.4.1",
    "org.scalatest" %% "scalatest" % "3.2.13" % Test
  )
}
