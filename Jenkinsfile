pipeline {
  agent any
  stages {
    stage('Greet') {
      steps {
        writeFile(file: 'hola.txt', text: 'Si funciona')
        echo 'Hello'
      }
    }

  }
}