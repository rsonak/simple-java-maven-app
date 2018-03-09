import groovy.json.*

def getJobNameReposMap() {
	println "start parser" 
    def data = parseFile()
    println("data = "+data)    
    println "end parser" 
    return data 
}

def parseFile() {
	println "start parsing file"
	def jsonFile = readJSON file:'buildjobs.json'	
  	return jsonFile
}

def printJobDetails(def jobNameRepos) {
	//echo "${jobNameRepos.keySet()}"
    //echo "${jobNameRepos.values()}"
    //for (item in jobNameRepos) {
       // echo "Job name = "+item.key            
        //echo "Job repo = "+item.value 
   // }
   //for (e in jobNameRepos ) {
   	//println "e = "+e
   //}
   jobNameRepos.jobs.each { 
    	def jobName = it["name"]
    	println "jobName = "+jobName
    	//def jobRepos = it["jobs"]["repos"].location
    	def jobRepos = it["repos"]
    	println "jobRepos = "+jobRepos
    	jobRepos.each {
    		def jobLocation = it["location"]
    		println "location = "+location
    	}	
    }
}
return this
