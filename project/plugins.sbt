addSbtPlugin("com.github.sbt" % "sbt-pgp" % "2.1.2")

addSbtPlugin("com.github.sbt" % "sbt-release" % "1.0.15")

addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "3.9.7")

addSbtPlugin("com.thesamet" % "sbt-protoc" % "1.0.2")
libraryDependencies += "com.thesamet.scalapb" %% "compilerplugin" % "0.11.0"

addSbtPlugin("com.typesafe" % "sbt-mima-plugin" % "0.8.1")

addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.4.2")
