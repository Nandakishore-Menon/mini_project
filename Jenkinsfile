pipeline {
    agent any
    stages {
        stage('Git Pull') {
            steps {
				git url: 'https://github.com/Nandakishore-Menon/mini_project.git',
				branch: 'main',
                credentialsId: 'github_mini_project'
            }
        }
        stage('Maven Build') {
            steps {
                sh 'mvn clean install'
            }
        }
     }
    post {
       always {
            sh 'docker logout'
      }
   } 
}
