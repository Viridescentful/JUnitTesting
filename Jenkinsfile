pipeline {
    agent any

    tools {
        maven 'Maven 3.9.11'
    }

    stages {
        stage('checking') {
            steps {
                echo 'Building...'
                git branch:'master', url:'https://github.com/Viridescentful/JUnitTesting.git'
            }
        }

        stage('build') {
            steps {
                bat 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Code Coverage') {
            steps {
                bat 'mvn jacoco:report'
            }
        }

        stage('Publish Test Results') {
            steps {
                junit '**/target/surefire-reports/*.xml'
            }
        }

        stage('Publish Coverage Report') {
            steps {
                jacoco()
            }
        }
    }
}