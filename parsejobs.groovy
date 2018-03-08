import groovy.json.*

def getJobNameReposMap() {
	println "start parser" 
    def data = parseFile()
    println("Data")
    def itemDataMap = [:]
    data.jobs.each { 
    	def jobName = it["name"]
    	//def jobRepos = it["repos"].location
    	def jobRepos = it["repos"]
    	itemDataMap.put(jobName,jobRepos)
    }
    println "end parser" 
    return itemDataMap  
}

def parseFile() {
	println "start parsing file"
	def jsonSlurper = new JsonSlurper()
	def jsonFile = readFile("./buildjobs.json")
	def object = jsonSlurper.parseText(jsonFile)
  	println "end parsing file"
	return object
}
return this
