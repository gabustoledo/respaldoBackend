pipeline {
    agent any

    tools{
        gradle 'gradle-6.8.3'
    }

    stages {

        stage('SonarQube'){
            steps{
                dir("/var/lib/jenkins/workspace/G1E1/backend"){
                    withSonarQubeEnv('sonarcloud_hpinochet'){
                        sh 'chmod +x ./gradlew'
                        sh './gradlew sonarqube'
                    }    
                }                
            }
        }

	    stage('JUnit'){
		    steps {
			    catchError(buildResult: 'SUCCESS', stageResult: 'FAILURE') {
                 		dir("/var/lib/jenkins/workspace/G1E1/backend") {
						    sh 'chmod +x ./gradlew'
                    		sh './gradlew test'
					    }
                	}
		    }
	    }

    }
}