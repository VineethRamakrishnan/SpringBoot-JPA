pipeline {
  agent any
  stages {
    stage('Build') {
      agent {
        docker {
          image 'maven:3.5-jdk-8-slim'
        }
        
      }
      steps {
        sh '''echo "Building project"
mvn -version
mvn clean install
docker build -t samples/springboot-sample .
docker run -d 9025:9025 samples/springboot-sample'''
      }
    }
  }
}