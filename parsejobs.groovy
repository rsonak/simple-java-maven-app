import groovy.json.*

def getJobNameReposMap() {
	println "start parser" 
    def data = parseFile()
    println("data = "+data)    
    println "end parser" 
    return jobs(data)  
}

def jobs(list) {
    list
        .grep { it.value == true  }
        .collect { [ name : it.key.toString(),
                      repos : it.value.toString() ] }

}

def parseFile() {
	println "start parsing file"
	def jsonSlurper = new JsonSlurper()
	def jsonFile = readFile("./buildjobs.json")
	println "end parsing file"
	return new HashMap<>(jsonSlurper.parseText(jsonFile))
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
