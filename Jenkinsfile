pipeline {
    agent {
        docker {
            image 'qnib/pytest'
        }
    }

    stages {
         stage('Install Dependencies') {
            steps {
                script {
                    sh 'pip install pytest'
                }
            }
        }

        stage('Run Tests') {
            steps {
                // Run the Python test script

                    sh 'python -m pytest'
            }
        }
    }
}
