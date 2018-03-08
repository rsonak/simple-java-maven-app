import groovy.json.*
println "start parser" 

def getJobNameReposMap() {
    def jsonSlurper = new JsonSlurper()
    //def data = jsonSlurper.parseText(new File("buildjobs.json").text)
    def jsonFile = readFile("./buildjobs.json")
    def data = jsonSlurper.parseText(jsonFile)
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
