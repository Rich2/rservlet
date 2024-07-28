enablePlugins(TomcatPlugin)
version := "0.0.1"
scalaVersion := "3.4.2"
scalaSource := (ThisBuild/baseDirectory).value / "src"
Compile/scalaSource := (ThisBuild/baseDirectory).value / "src"
resourceDirectory := (ThisBuild/baseDirectory).value / "res"
Compile/unmanagedResourceDirectories := List((ThisBuild/baseDirectory).value / "res")

