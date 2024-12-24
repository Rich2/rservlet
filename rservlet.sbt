enablePlugins(TomcatPlugin)
version := "0.0.2snap"
scalaVersion := "3.5.2"
scalaSource := (ThisBuild/baseDirectory).value / "src"
Compile/scalaSource := (ThisBuild/baseDirectory).value / "src"
resourceDirectory := (ThisBuild/baseDirectory).value / "res"
Compile/unmanagedResourceDirectories := List((ThisBuild/baseDirectory).value / "res")