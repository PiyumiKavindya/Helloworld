pipeline {
  agent any
  stages {
    stage('Version check') {
      steps {
        sh '''java -version
mvn -v
git --version'''
      }
    }

  }
}