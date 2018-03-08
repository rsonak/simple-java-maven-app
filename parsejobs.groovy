import groovy.json.*
println "start parser" 

def getJobNameReposMap() {
    def data = parseFile()
    println("Data = "+data)
    def itemDataMap = [:]
    data.jobs.each { 
    	def jobName = it["name"]
    	def jobRepos = it["repos"].location
    	itemDataMap.put(jobName,jobRepos)
    }
    return itemDataMap  
}

def parseFile() {
	println "start parsing file"
	def jsonSlurper = new JsonSlurper()
	def jsonFile = readFile("./buildjobs.json")
	println "end parsing file"
	return jsonSlurper.parseText(jsonFile)
}
println "end parser" 
return this
