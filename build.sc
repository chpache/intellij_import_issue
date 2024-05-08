import mill._, scalalib._, scalafmt._
import mill.scalalib.publish.PublishInfo
import $ivy.`com.lihaoyi::mill-contrib-bloop:$MILL_VERSION`
import $ivy.`com.lihaoyi::mill-contrib-scalapblib:$MILL_VERSION`
import contrib.scalapblib.ScalaPBModule
import mill.scalalib._

val scala3 = "3.3.0"

trait CommonScalaModule extends ScalaModule with ScalafmtModule {
  def scalaVersion = scala3
  def scalacOptions = Seq("-deprecation", "--release", "11")
}

object speakeasy extends CommonScalaModule {

}

object maestro extends CommonScalaModule {

  def moduleDeps = Seq(speakeasy)

}
