pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                bat 'javac client.java'
                bat 'javac test.java'
            }
        }
        stage('Run') {
            steps {
               bat 'java Client'
               bat 'java test'
               echo 'Building2..'
            }
        }
    }
}
