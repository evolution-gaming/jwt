lazy val jwt = (project in file("."))
  .settings(
    name := "jwt",
    organization := "com.evolutiongaming",
    homepage := Some(url("https://github.com/evolution-gaming/jwt")),
    startYear := Some(2019),
    organizationName := "Evolution",
    organizationHomepage := Some(url("https://evolution.com")),
    scalaVersion := crossScalaVersions.value.head,
    crossScalaVersions := Seq("2.13.18", "3.3.8"),
    publishTo := Some(Resolver.evolutionReleases),
    licenses := Seq(("MIT", url("https://opensource.org/licenses/MIT"))),
    libraryDependencies ++= Seq(
      "org.playframework" %% "play-json" % "3.0.6",
      "org.scalatest" %% "scalatest" % "3.2.20" % Test,
      "commons-codec" % "commons-codec" % "1.22.1",
    ),
    versionPolicyIntention := Compatibility.BinaryCompatible,
    versionPolicyIgnored ++= Seq(
      "com.typesafe.play" %% "play-functional",
      "com.typesafe.play" %% "play-json",
      "joda-time" % "joda-time",
    ),

    addCommandAlias("check", "+all scalafmtCheckRepo versionPolicyCheck Compile/doc"),
    addCommandAlias("fmt", "scalafmtRepo"),
    addCommandAlias("build", "+all compile test"),
  )
