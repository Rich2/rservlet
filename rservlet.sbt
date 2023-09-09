scalaSource := (ThisBuild/baseDirectory).value / "src"
Compile/scalaSource := (ThisBuild/baseDirectory).value / "src"
resourceDirectory := (ThisBuild/baseDirectory).value / "res"
Compile/unmanagedResourceDirectories := List((ThisBuild/baseDirectory).value / "res")