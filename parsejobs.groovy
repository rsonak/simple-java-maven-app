import groovy.json.*

def getJobNameReposMap() {
	println "start parser" 
    def data = parseFile()
    println("Data = "+data)
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
	println "end parsing file"
	return jsonSlurper.parseText(jsonFile)
}
return this
