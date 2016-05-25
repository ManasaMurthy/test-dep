name := "test-dep"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.8"

scalacOptions ++= Seq("-unchecked", "-deprecation" , "-feature", "-language:implicitConversions")

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.6" % "test"

libraryDependencies += "junit" % "junit" % "4.12" % "test"

initialCommands in console := """import testdep._"""

sourceGenerators in Compile <+=
 (sourceManaged in Compile, version, name) map {
  (dir, version, projectname) =>
  val file = dir / "testdep" / "MetaInfo.scala"
  val buildDate = (new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(new java.util.Date())
  IO.write(file,
  """package testdep
    |object MetaInfo { 
    |  val version="%s"
    |  val project="%s"
    |  val buildDate="%s"
    |}
    |""".stripMargin.format(version, projectname, buildDate) )
  Seq(file)
}

