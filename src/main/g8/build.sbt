name := "$name$"

version := "$version$"

ThisBuild / organization := "$organization$"
ThisBuild / scalaVersion := "$scala_version$"

lazy val root = (project in file(".")).
  settings(
    name := "raphtory.g8"
  )
