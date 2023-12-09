pipeline{
  agent any
  stages{
    stage("Demo"){
      steps{
        echo "Wecleom to the Jenkins Shared library"
      }
    }
  }
}

