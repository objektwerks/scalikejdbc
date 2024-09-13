enablePlugins(JmhPlugin)

name := "scalikejdbc"
organization := "objektwerks"
version := "0.3-SNAPSHOT"
scalaVersion := "3.5.1-RC2"
libraryDependencies ++= {
  Seq(
    "org.scalikejdbc" %% "scalikejdbc" % "4.3.1",
    "com.h2database" % "h2" % "2.3.232",
    "com.typesafe" % "config" % "1.4.3",
    "ch.qos.logback" % "logback-classic" % "1.5.8",
    "org.scalatest" %% "scalatest" % "3.2.19" % Test
  )
}
scalacOptions ++= Seq(
  "-Wunused:all"
)
