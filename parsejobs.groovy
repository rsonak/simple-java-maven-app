import groovy.json.*
println "start parser" 

def getJobNameReposMap() {
    def jsonSlurper = new JsonSlurper()
    def data = jsonSlurper.parseText(new File("/Users/rohit.sonak/Documents/GitHub/simple-java-maven-app/buildjobs.json").text)
    def itemDataMap = [:]
    data.jobs.each { 
    	def jobName = it["name"]
    	def jobRepos = it["repos"].location
    	itemDataMap.put(jobName,jobRepos)
    }
    return itemDataMap  
}
println "end parser" 
return this
