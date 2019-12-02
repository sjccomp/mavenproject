pipeline {
    agent any
    
    stages {
        stage ('Initialize') {
            steps {
               echo "PATH = ${PATH}"
                echo "M2_HOME = ${M2_HOME}"
               
            }
        }
		try {
		      stage ('Test') {
		            steps {
		                bat 'mvn test'
			            // junit 'build/surefire-reports/*.xml'
		            }
           
        }
		} catch (Exception ex) {
		    
		}
      
        stage ('Build') {
            steps {
                 bat 'mvn install -Dmaven.test.skip=true tomcat7:run' 
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
