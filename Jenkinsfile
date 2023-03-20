pipeline {
    agent any
    tools {
        maven 'maven-3.9.0'
    }
    stages {
        stage('Git pull') {
            steps {
				git url: 'https://github.com/Nandakishore-Menon/mini_project.git',
				branch: 'main',
                credentialsId: 'github_mini_project'
            }
        }
        stage('Compile') {
            steps {
                sh 'mvn compiler:compile'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
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
        stage('Deploy'){
        steps {
            ansiblePlaybook becomeUser: null, colorized: true, disableHostKeyChecking: true, installation: 'Ansible', inventory: 'inventory', playbook: 'playbook.yml', sudoUser: null
            }
        }
     }
    post {
       always {
            sh 'docker logout'
      }
   } 
}
