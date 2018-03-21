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
        sh '''mvn -version
mvn clean install


'''
      }
    }
    stage('Docker') {
      agent {
        dockerfile {
          filename 'Dockerfile'
        }
        
      }
      steps {
        sh 'echo "Building Docker image"'
      }
    }
  }
}