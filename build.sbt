lazy val jwt = (project in file("."))
  .settings(
    name := "jwt",
    organization := "com.evolutiongaming",
    homepage := Some(url("https://github.com/evolution-gaming/jwt")),
    startYear := Some(2019),
    organizationName := "Evolution",
    organizationHomepage := Some(url("https://evolution.com")),
    scalaVersion := crossScalaVersions.value.head,
    crossScalaVersions := Seq("2.13.0", "2.12.10"),
    publishTo := Some(Resolver.evolutionReleases),
    licenses := Seq(("MIT", url("https://opensource.org/licenses/MIT"))),
    releaseCrossBuild := true,
    libraryDependencies ++= Seq(
      "com.typesafe.play" %% "play-json" % "2.7.4",
      "org.scalatest" %% "scalatest" % "3.0.8"  % Test,
      "commons-codec" % "commons-codec" % "1.10",
    ),
      //addCommandAlias("check", "all versionPolicyCheck Compile/doc")
    addCommandAlias("check", "show version"),
    addCommandAlias("build", "+all compile test")
  )
