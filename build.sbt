lazy val root = (project in file(".")).
  settings(
    name := "akka-noob",
    version := "1.0",
    scalaVersion := "2.11.8",
	libraryDependencies ++= Seq("com.typesafe.akka" %% "akka-actor" % "2.4.11")
  )
