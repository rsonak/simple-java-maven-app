node {  
    def buildJobs = load "/Users/rohit.sonak/Documents/GitHub/simple-java-maven-app/parsejobs.groovy" 
    def jobNameRepos = buildJobs.getJobNameReposMap()

    println "${jobNameRepos.keySet()}"
    println "${jobNameRepos.values()}"
    for (item in jobNameRepos) {
        println "Job name = "+item.key
        println "Job repo = "+item.value 
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