pipeline {
  agent any
  stages {
    stage('Checkout') {
      steps {
        checkout scm
      }
    }
    stage('Build') {
      steps {
        echo 'This is basic setup message'
      }
    }
    stage('Test') {
      steps {
        echo 'This is test setup message'
      }
    }
  }
}