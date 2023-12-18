pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout your Git repository
                script {
                    git branch: 'main', credentialsId: 'GalPinto13', url: 'https://github.com/GalPinto13/test'
                }
            }
        }

        stage('Run Tests') {
            steps {
                // Run the Python test script
                script {
                    sh 'test_add.py'
                }
            }
        }
    }
}