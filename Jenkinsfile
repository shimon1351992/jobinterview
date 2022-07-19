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
               bat 'javac client.java'
               bat 'javac test.java'
               echo 'Building2..'
            }
        }
    }
}
