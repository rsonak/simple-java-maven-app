node {  
    checkout scm
    def buildJobs = load 'parsejobs.groovy' 
    def jobNameRepos = buildJobs.getJobNameReposMap() 
    //buildJobs.printJobDetails(jobNameRepos)
    jobNameRepos.jobs.each { 
        def jobName = it["name"]
        println "job name = "+jobName
        def jobRepos = it["repos"]
        jobRepos.each {
            println("job location = "+it.location)
        }   
    }

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