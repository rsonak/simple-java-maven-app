node {  
    checkout scm
    def buildJobs
    buildJobs = load 'parsejobs.groovy' 
    def jobNameRepos = buildJobs.getJobNameReposMap()

    
    
    stage('Build') { 
        echo "Build step"
    }

    stage('Test') { 
        echo "test step"
        echo "${jobNameRepos.keySet()}"
        echo "${jobNameRepos.values()}"
        for (item in jobNameRepos) {
            echo "Job name = "+item.key
            echo "Job repo = "+item.value 
        }
    }

    stage('Deploy') { 
        echo "deploy step"
    }

}