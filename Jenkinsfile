pipeline {
    agent any
    stages {
        stage('Build') { 
            steps {
                def buildJobs = load "./parsejobs.groovy" 
                def jobNameRepos = buildJobs.getJobNameReposMap()

                //println "${jobNameRepos.keySet()}"
                //println "${jobNameRepos.values()}"
                for (item in jobNameRepos) {
                    println "Job name = "+item.key
                    println "Job repo = "+item.value 
                }
            }
        }
        stage('Test') {
            steps {
                println "Test stage steps"
                //sh 'mvn test'
            }
            post {
                always {
                    println "Test stage post always"
                    //junit 'target/surefire-reports/*.xml'
                }
            }
        }
    }
}