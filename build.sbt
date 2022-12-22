enablePlugins(JavaAppPackaging, AshScriptPlugin)

import Dependencies._

ThisBuild / scalaVersion     := "2.12.6"
ThisBuild / dockerBaseImage := "openjdk:8-jre-alpine"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.katchfashion"
ThisBuild / organizationName := "katchfashion"

packageName in Docker := "akkahttp-"
lazy val root = (project in file("."))
  .settings(
    name := "reboot",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.14" % "test"
  )

