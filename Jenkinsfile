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
'''
      }
    }
    stage('Docker') {
      steps {
        sh '''echo "Listing out the docker images"
docker images
echo "Executing samples/springboot-basic Docker image"
docker run -p 9025:9025 samples/springboot-basic'''
      }
    }
    stage('Openshift Deployment') {
      steps {
        pwd(tmp: true)
      }
    }
  }
}