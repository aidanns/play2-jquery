import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "play2-jquery-sample-java"
  val appVersion      = "1.9.0"

  val appDependencies = Seq(
    javaCore,
    javaJdbc,
    javaEbean,

    // Depend on the thing we're demoing
    "com.aidanns" %% "play2-jquery" % "1.9.0"

  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Search the local play repo for dependencies.
    resolvers += "Local Play Repository" at "file://usr/local/share/play-2.1-RC1/repository/",
    resolvers += Resolver.url("com.aidanns Github Repo", url("https://raw.github.com/aidanns/play2-modules/master/releases"))(Resolver.ivyStylePatterns),
    
    // Org name for publishing
    organization := "com.aidanns"
  )

}
