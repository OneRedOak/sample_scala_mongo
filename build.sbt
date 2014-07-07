name := "scala"

version := "1.0"

scalaVersion := "2.10.2"

libraryDependencies += "junit" % "junit" % "4.5"

libraryDependencies +="org.scalatest" % "scalatest_2.10" % "2.0.RC2" % "test"

testOptions in Test <+= (target in Test) map {
  t => Tests.Argument(TestFrameworks.ScalaTest, "junitxml(directory=\"%s\")" format (t / "../shippable/testresults"))
}
