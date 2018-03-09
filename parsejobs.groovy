import groovy.json.*

def getJobNameReposMap() {
	println "start parser" 
    def data = parseFile()
    println "end parser" 
    return data 
}

def parseFile() {
	println "start parsing file"
	def jsonFile = readJSON file:'buildjobs.json'	
  	return jsonFile
}

def printJobDetails(def jobNameRepos) {
	
   jobNameRepos.jobs.each { 
    	def jobName = it["name"]
    	println "job name = "+jobName
    	def jobRepos = it["repos"]
    	jobRepos.each {
    		println("job location = "+it.location)
     	}	
    }
}
return this
