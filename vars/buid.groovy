def call(String mvngoal ) {

  if ("${mvngoal}" == "Clean") {
        sh "mvn clean"
      }
   else if ("${mvngoal}" == "Compile") {
        sh "mvn clean compile"
      }
   else if ("${mvngoal}" == "Test") {
        sh "mvn clean compile test"
      }

  else if ("${mvngoal}" == "Package") {
        sh "mvn clean compile test package"
      }

}
