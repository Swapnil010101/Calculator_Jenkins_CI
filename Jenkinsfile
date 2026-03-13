pipeline {
    agent any

    stages {

        stage('Checkout Code') {
            steps {
                git branch: 'master', url: 'https://github.com/Swapnil010101/Calculator_Jenkins_CI.git'
            }
        }

        stage('Compile Java Code') {
            steps {
                bat 'javac src\\*.java'
            }
        }

        stage('Run Application') {
            steps {
                bat 'java -cp src Main'
            }
        }

        stage('Run Test Cases') {
            steps {
                bat 'java -ea -cp src CalculatorTest'
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
