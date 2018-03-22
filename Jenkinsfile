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
        stash(name: 'springboot-sample-0.0.1-SNAPSHOT', includes: '**/*.jar')
      }
    }
    stage('Docker') {
      steps {
        sh '''echo "Listing out the docker images"
docker images'''
        unstash 'springboot-sample-0.0.1-SNAPSHOT'
        sh 'docker build -t samples/springboot-basic .'
      }
    }
    stage('Openshift Deployment') {
      agent {
        docker {
          image 'java:8'
          args '-u 0:0'
        }
        
      }
      steps {
        sh './scripts/openshift.sh'
      }
    }
  }
}