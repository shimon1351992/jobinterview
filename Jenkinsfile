pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat 'javac client.java'
                bat 'javac test.java'
            }
        }
        stage('Run') {
            steps {
               bat 'javac client.java'
               bat 'javac test.java'
            }
        }
    }
}
