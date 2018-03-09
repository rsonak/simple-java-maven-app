node {  
    checkout scm
    def buildJobs = load 'parsejobs.groovy' 
    def jobNameRepos = buildJobs.getJobNameReposMap() 
    buildJobs.printJobDetails(jobNameRepos)

    stage('Build') { 
        echo 'Build step'
    }

    stage('Test') { 
        echo 'test step'
    }

    stage('Deploy') { 
        echo 'deploy step'
    }

}