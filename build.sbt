
name := "lift-omniauth-example"

version := "0.1.0"

organization := "eureka.inf.br"
 
scalaVersion := "2.10.3"

scalacOptions ++= DefaultOptions.scalac

scalacOptions in Compile += Opts.compile.deprecation

scalacOptions in Compile += Opts.compile.unchecked
 
seq(webSettings: _*)

resolvers ++= Seq("snapshots"     at "http://oss.sonatype.org/content/repositories/snapshots",
                "releases"        at "http://oss.sonatype.org/content/repositories/releases"
                )

libraryDependencies ++= {
  val liftVersion = "3.0-SNAPSHOT"
  Seq(
    "net.liftweb" %% "lift-json-ext" % liftVersion % "compile->default" withSources(),
    "net.liftweb" %% "lift-webkit" % liftVersion % "compile->default" withSources()
  )
}
  
libraryDependencies ++= Seq(
    "javax.servlet"         % "servlet-api"        % "2.5"              % "provided->default",
    "org.specs2"            % "specs2_2.9.2"       % "1.9"              % "test->default",
    "org.eclipse.jetty"     % "jetty-webapp"       % "8.0.4.v20111024"  % "container",
    "org.eclipse.jetty"     % "jetty-plus"         % "8.0.4.v20111024"  % "container"
)

libraryDependencies ++= Seq(
  "net.liftmodules" %% "omniauth_3.0" % "0.11"
)

