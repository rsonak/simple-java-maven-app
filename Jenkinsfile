node {  
    checkout scm
    def jobNameRepos = getJobRepos()
    echo "${jobNameRepos.keySet()}"
    echo "${jobNameRepos.values()}"
    for (item in jobNameRepos) {
        echo "Job name = "+item.key            
        echo "Job repo = "+item.value 
    }

    def getJobRepos() {
        def buildJobs = load 'parsejobs.groovy' 
        def jobRepos = buildJobs.getJobNameReposMap() 
        return jobRepos
    }

    stage('Build') { 
        echo "Build step"
    }

    stage('Test') { 
        echo "test step"

    }

    stage('Deploy') { 
        echo "deploy step"
    }

}