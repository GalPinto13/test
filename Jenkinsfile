pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout your Git repository
                script {
                    git branch: 'main', url: 'https://github.com/GalPinto13/test'
                }
            }
        }

        stage('Run Tests') {
            steps {
                // Run the Python test script

                    sh 'python -m .test_add.py'

            }
        }
    }
}