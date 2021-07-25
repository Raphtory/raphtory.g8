name := "$name$"

version := "$version$"

ThisBuild / organization := "$organization$"
ThisBuild / scalaVersion := "$scala_version$"

lazy val root = (project in file(".")).
  settings(
    name := "raphtory.g8"
  )

// SBT already finds jars jars present in the "lib" directory. However it is always best to express unmanaged dependencies explicitly.
// It eliminates scope of any assumptions and documents the dependencies right here in the "build.sbt" file.
unmanagedJars in Compile += baseDirectory.value / "lib/raphtory-v0.11.jar"
