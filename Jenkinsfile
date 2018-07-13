pipeline {
    agent any 

    stages {
        stage('Build') { 
            steps { 
				echo 'Building...'
                withMaven(maven: 'maven_3_5_2')
				{				   
				   /*bat 'mvn clean package -DskipTests'*/
				   /*bat 'mvn clean compile'*/
				   bat 'mvn package -DskipTests'
				}
            }
        }
        stage('Copy'){
            steps {
                echo 'Copying...'
				cifsPublisher(publishers: [[configName: 'jenkindemo', transfers: [[cleanRemote: false, excludes: '', flatten: false, makeEmptyDirs: true, noDefaultExcludes: false, patternSeparator: '[, ]+', remoteDirectory: 'testautomation', remoteDirectorySDF: false, removePrefix: 'target/', sourceFiles: 'target/*.jar']], usePromotionTimestamp: false, useWorkspaceInPromotion: false, verbose: false]])
			    
            }
        }
        stage('Test') {
            steps {
                echo 'Testing...'
                bat 'psexec \\\\jenkindemo -u thaochuong -p thaochuong@123 -accepteula -i "D:\\sharejenkins\\automationdp.bat"'
            }
        }
    }
}