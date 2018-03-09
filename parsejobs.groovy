import groovy.json.*

def getJobNameReposMap() {
	println "start parser" 
    def data = parseFile()
    println("data = "+data)    
    println "end parser" 
    return data 
}

@NonCPS
def parseFile() {
	println "start parsing file"
	def jsonFile = readFile("./buildjobs.json")
	println "end parsing file"
	def object = new JsonSlurper().parseText(json)
	if(object instanceof groovy.json.internal.LazyMap) {
	      return new HashMap<>(object)
	}
  	return object
}

def printJobDetails(def jobNameRepos) {
	//echo "${jobNameRepos.keySet()}"
    //echo "${jobNameRepos.values()}"
    //for (item in jobNameRepos) {
       // echo "Job name = "+item.key            
        //echo "Job repo = "+item.value 
   // }
   for (e in jobNameRepos ) {
    println "key = ${e.key}, value = ${e.value}"
   }
}
return this
