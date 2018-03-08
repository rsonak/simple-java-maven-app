node {  
    checkout scm
    def buildJobs = load 'parsejobs.groovy' 
    def jobNameRepos = buildJobs.getJobNameReposMap() 
    echo "${jobNameRepos.keySet()}"
    echo "${jobNameRepos.values()}"
    for (item in jobNameRepos) {
        echo "Job name = "+item.key            
        echo "Job repo = "+item.value 
    }

    stage('Build') { 
        echo 'Build step'
    }

    

}