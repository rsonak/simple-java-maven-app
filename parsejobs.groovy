import groovy.json.*

def getJobNameReposMap() {
	println "start parser" 
    def data = parseFile()
    println("data = "+data)
    def itemDataMap = [:]
    data.each { 
    	def jobName = it["jobs"]["name"]
    	println("jobName = "+jobName)
    	//def jobRepos = it["jobs"]["repos"].location
    	def jobRepos = it["jobs"]["repos"]
    	println("jobRepos = "+jobRepos)
    	itemDataMap.put(jobName,jobRepos)
    }
    println "end parser" 
    return itemDataMap  
}

@NonCPS
def parseFile() {
	println "start parsing file"
	def jsonSlurper = new JsonSlurper()
	def jsonFile = readFile("./buildjobs.json")
	def object = jsonSlurper.parseText(jsonFile).text
  	println "end parsing file"
	return object
}
return this
