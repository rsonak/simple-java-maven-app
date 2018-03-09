import groovy.json.*

def getJobNameReposMap() {
    def data = parseFile()
    return data 
}

def parseFile() {
	def jsonFile = readJSON file:'buildjobs.json'	
  	return jsonFile
}

return this
