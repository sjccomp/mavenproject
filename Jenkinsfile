pipeline {
    agent any
    
    stages {
        stage ('Initialize') {
            steps {
                echo "PATH = ${PATH}"
                echo "M2_HOME = ${M2_HOME}"
           }
        }
		
		stage ('Test and Build') {
		            steps {
		               junit 
		                
			        }
		            post { 
		             always { 
            			echo 'I will always say Hello again!'
            			//bat 'mvn install -Dmaven.test.skip=true tomcat7:run' 
            		}
            }
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
