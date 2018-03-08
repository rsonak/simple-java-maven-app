import groovy.json.*

def getJobNameReposMap() {
	println "start parser" 
    def data = parseFile()
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

@NonCPS
def parseFile() {
	println "start parsing file"
	def jsonSlurper = new JsonSlurper()
	def jsonFile = readFile("./buildjobs.json")
	def object = jsonSlurper.parseText(jsonFile)
	if(object instanceof groovy.json.internal.LazyMap) {
      return new HashMap<>(object)
  	}
  	println "end parsing file"
	return object
}
return this
