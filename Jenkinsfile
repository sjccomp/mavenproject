pipeline {
    agent any
    
    stages {
        stage ('Initialize') {
            steps {
		    echo 'pipeline started!'
                //echo "PATH = ${PATH}"
                //echo "M2_HOME = ${M2_HOME}"
           }
        }
		
		stage ('Test and Build') {
		            steps {
		               //junit 'D:/jenkinsproject/testReport.xml'
		               //junit 'D:/jenkinsproject/testReport.xml'
		               sh 'mvn test'
		               //junit 'build/surefire-reports/*.xml'
		                
			        }
		            post { 
		             always { 
            			echo 'I will always say Hello again!'
            			sh 'mvn install -Dmaven.test.skip=true tomcat7:run' 
            		}
            }
        }
           
       
    }
}
