import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "play201app"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      // Add your project dependencies here,
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = JAVA).settings(
      // Add your own project settings here
      //compile in Test <<= PostCompile(testScope = true)
      compile in Test <<= (compile in Test).dependsOn(PostCompile(testScope = true))
      //compile in Test <<= (compile in Test).andFinally(PostCompile(testScope = true))
    )

}
