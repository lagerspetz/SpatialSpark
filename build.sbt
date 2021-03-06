name := "SpatialSpark"

version := "1.0"

scalaVersion := "2.11.7"
val sparkVersion = "2.1.0"

libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.5.0"

libraryDependencies +="org.apache.spark" %% "spark-core" % sparkVersion

libraryDependencies +="com.vividsolutions" % "jts" % "1.13"

libraryDependencies += "org.apache.commons" % "commons-math3" % "3.2"

libraryDependencies +="com.google.uzaygezen" % "uzaygezen-core" % "0.2"

libraryDependencies += "org.scalactic" %% "scalactic" % "2.2.6"
libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.6" % "test"
