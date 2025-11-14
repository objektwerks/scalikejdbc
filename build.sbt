enablePlugins(JmhPlugin)

name := "scalikejdbc"
organization := "objektwerks"
version := "0.3-SNAPSHOT"
scalaVersion := "3.7.4"
libraryDependencies ++= {
  Seq(
    "org.scalikejdbc" %% "scalikejdbc" % "4.3.2",
    "com.h2database" % "h2" % "2.4.240",
    "com.typesafe" % "config" % "1.4.3",
    "ch.qos.logback" % "logback-classic" % "1.5.21",
    "org.scalatest" %% "scalatest" % "3.2.19" % Test
  )
}
scalacOptions ++= Seq(
  "-Wunused:all"
)
