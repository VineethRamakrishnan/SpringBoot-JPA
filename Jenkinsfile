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
      steps {
        sh '''echo "Listing out the docker images"
docker images'''
      }
    }
    stage('Openshift Deployment') {
      steps {
        sh '''echo "Deployment has been started"
oc login $URL_OS_TEST --token=$TOKEN_OS_TEST --insecure-skip-tls-verify'''
      }
    }
  }
}