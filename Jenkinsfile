pipeline {
  agent any
  stages {
    stage("build") {
      steps {
        echo 'building...'
        script {
          def x = 6 * 2 > 10 ? 'yay' : 'ha'
          echo x
        }
      }
    }
    stage("test") {
      steps {
        echo 'testing...'
      }
    }
    stage("deploy") {
      steps {
        echo 'deploying...'
      }
    }
  }
}