pipeline {
    agent any
    
    stages {
        stage ('Initialize') {
            steps {
               echo "PATH = ${PATH}"
                echo "M2_HOME = ${M2_HOME}"
               
            }
        }

        stage ('Build') {
            steps {
                 bat 'mvn install tomcat7:run' 
                // junit 'build/surefire-reports/*.xml'
            }
            post {
                success {
                    echo "hello world" 
                }
            }
        }
    }
}