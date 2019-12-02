pipeline {
    agent any
    
    stages {
        stage ('Initialize') {
            steps {
               echo "PATH = ${PATH}"
                echo "M2_HOME = ${M2_HOME}"
               
            }
        }

        stage ('Test') {
            steps {
                 bat 'mvn test' 
                // junit 'build/surefire-reports/*.xml'
            }
           
        }
        stage ('Build') {
            steps {
                 bat 'mvn install -Dmaven.test.skip=truetomcat7:run' 
                // junit 'build/surefire-reports/*.xml'
            }
            //post {
            //    success {
            //        echo "hello world" 
            //    }
           // }
        }
    }
}
