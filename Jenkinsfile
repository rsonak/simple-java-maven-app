node {  
    checkout scm
    def buildJobs = load 'parsejobs.groovy' 
    def jobNameRepos = buildJobs.getJobNameReposMap() 


    stage('Build') { 
        echo 'Build step'
        jobNameRepos.jobs.each { 
            def jobName = it["name"]
            println "job name = "+jobName
            def jobRepos = it["repos"]
            jobRepos.each {
                println("job location = "+it.location)
            }   
        }
    }

    stage('Test') { 
        echo 'test step'
    }

    stage('Deploy') { 
        echo 'deploy step'
    }

}