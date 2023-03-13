pipeline {
    agent any
    tools {
        maven 'maven-3.9.0'
        docker 'docker'
    }
    stages {
        stage('Git pull') {
            steps {
				git url: 'https://github.com/Nandakishore-Menon/mini_project.git',
				branch: 'main',
                credentialsId: 'github_mini_project'
            }
        }
        stage('Build jar') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Build docker image') {
            steps {
                sh 'docker build -t samaelarch/mini_project:latest .'
            }
        }
        stage('Publish to dockerhub') {
            steps {
                withDockerRegistry([ credentialsId: "dockerhub_id", url: "" ]) {
                    sh 'docker push samaelarch/mini_project:latest'
                }
            }
        }
     }
    post {
       always {
            sh 'docker logout'
      }
   } 
}
