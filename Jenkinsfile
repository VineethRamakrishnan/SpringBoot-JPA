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
docker images
echo "Executing samples/springboot-basic Docker image"'''
        pwd(tmp: true)
      }
    }
    stage('Openshift Deployment') {
      steps {
        pwd(tmp: true)
      }
    }
  }
}