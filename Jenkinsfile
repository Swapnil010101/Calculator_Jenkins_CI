pipeline {
    agent any

    stages {

        stage('Clone Repository') {
            steps {
                git 'https://github.com/Swapnil010101/Calculator_Jenkins_CI.git'
            }
        }

        stage('Compile') {
            steps {
                sh 'javac src/*.java'
            }
        }

        stage('Run Application') {
            steps {
                sh 'java -cp src Main'
            }
        }

        stage('Run Tests') {
            steps {
                sh 'java -ea -cp src CalculatorTest'
            }
        }
    }

    post {
        success {
            echo 'Build and Tests Successful!'
        }
        failure {
            echo 'Build Failed!'
        }
    }
}
