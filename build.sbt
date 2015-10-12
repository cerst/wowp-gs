lazy val root = (project in file(".")).
  settings(
    name := "wowp-gs",
    version := "2.0.0-SNAPSHOT",
    scalaVersion := "2.11.7",
    
    //resolvers ++= Seq(
    //)

    libraryDependencies ++= {
      val akkaVersion = "2.4.0"
      val akkaStreamsVersion = "1.0"
      val logbackVersion = "1.1.3"

      Seq(
        "com.typesafe.akka" %% "akka-actor" % akkaVersion,
        "com.typesafe.akka" %% "akka-stream-experimental" % akkaStreamsVersion,
        "io.scalac" %% "reactive-rabbit" % "1.0.2",
        // Logging: Akka SLF4J logger + logging backend
        "com.typesafe.akka" %% "akka-slf4j" % akkaVersion,
        "ch.qos.logback" % "logback-classic" % logbackVersion
      )
    },

    scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature", "-encoding", "utf8")
  )


