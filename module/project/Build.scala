import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "play2-jquery"
  val appVersion      = "1.9.0"

  val appDependencies = Seq(
    javaCore,
    javaJdbc,
    javaEbean
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
    organization := "com.aidanns"     
  )

}
