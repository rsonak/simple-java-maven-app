pipeline {
    agent any
    stages {
        stage('Build') { 
                def buildJobs = load "./parsejobs.groovy" 
                def jobNameRepos = buildJobs.getJobNameReposMap()

                //println "${jobNameRepos.keySet()}"
                //println "${jobNameRepos.values()}"
                for (item in jobNameRepos) {
                    println "Job name = "+item.key
                    println "Job repo = "+item.value 
                }
            steps {
                echo "Steps"
            }
        }
        stage('Test') {
            steps {
                echo "Test stage steps"
                //sh 'mvn test'
            }
            post {
                always {
                    echo "Test stage post always"
                    //junit 'target/surefire-reports/*.xml'
                }
            }
        }
    }
}