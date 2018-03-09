import groovy.json.*

def getJobNameReposMap() {
	println "start parser" 
    def data = parseFile()
    println("data = "+data)
    def itemDataMap = [:]
    data.jobs.each { 
    	def jobName = it["name"]
    	//def jobRepos = it["jobs"]["repos"].location
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
	println "end parsing file"
	return jsonSlurper.parseText(jsonFile)
}

def printJobDetails(def jobNameRepos) {
	echo "${jobNameRepos.keySet()}"
    echo "${jobNameRepos.values()}"
    for (item in jobNameRepos) {
        echo "Job name = "+item.key            
        echo "Job repo = "+item.value 
    }
}
return this
