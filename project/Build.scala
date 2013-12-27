import sbt._
import Keys._

object Billborad extends Build {

  val appVersion = "0.0.1"
  val appScalaVersion = "2.10.3"

  lazy val root = Project(
    id = "rtb-engine",
    base = file("."),
    settings =
      Defaults.defaultSettings ++ Seq(
        version := appVersion,
        scalaVersion := appScalaVersion,
        scalacOptions := Seq("-unchecked", "-deprecation", "-feature", "-encoding", "utf8"),
        fork in Test := true,
        testOptions in Test += Tests.Argument("junitxml", "console"),
        resolvers ++= Resolvers.site,
        libraryDependencies ++= Dependencies.libs)
  )

}

object Dependencies {

  val sprayVersion = "1.2-RC3"
  val akkaVersion = "2.2.3"

  val libs = Seq()

}

object Resolvers {
  val site = Seq(
    "spray repo" at "http://repo.spray.io/",
    "spray nightly repo" at "http://nightlies.spray.io/",
    "msgpack repo" at "http://msgpack.org/maven2/"
  )
}
