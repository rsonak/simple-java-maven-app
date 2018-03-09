import groovy.json.*

def getJobNameReposMap() {
    def data = parseFile()
    return data 
}

def parseFile() {
	println "start parsing file"
	def jsonFile = readJSON file:'buildjobs.json'	
  	return jsonFile
}

return this
