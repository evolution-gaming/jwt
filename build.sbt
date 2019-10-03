lazy val jwt = (project in file("."))
  .settings(
    name := "jwt",
    organization := "com.evolutiongaming",
    homepage := Some(new URL("http://github.com/evolution-gaming/jwt")),
    startYear := Some(2019),
    organizationName := "Evolution Gaming",
    organizationHomepage := Some(url("http://evolutiongaming.com")),
    bintrayOrganization := Some("evolutiongaming"),
    scalaVersion := crossScalaVersions.value.head,
    crossScalaVersions := Seq("2.13.0", "2.12.10"),
    resolvers += Resolver.bintrayRepo("evolutiongaming", "maven"),
    licenses := Seq(("MIT", url("https://opensource.org/licenses/MIT"))),
    releaseCrossBuild := true,
    libraryDependencies ++= Seq(
      "com.typesafe.play" %% "play-json" % "2.7.4",
      "org.scalatest" %% "scalatest" % "3.0.8"  % Test,
      "commons-codec" % "commons-codec" % "1.10",
    )
)
