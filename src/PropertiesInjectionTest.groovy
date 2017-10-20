def scriptDir = getClass().protectionDomain.codeSource.location.path

//Create the properties object, and load it from the file system:
Properties props = new Properties()
File propsFile = new File(scriptDir, './../test.properties')
props.load(propsFile.newDataInputStream())

//Take a peek:
//println props.getProperty('porcupine')


def appName = props.getProperty('appName')              
def appEnv = props.getProperty('appEnv')               
def appClientName = props.getProperty('appClientName')        
def appClientExtension = props.getProperty('appClientExtension')   
def appServiceName = props.getProperty('appServiceName')       
def appServiceExtension = props.getProperty('appServiceExtension')  
def artifactoryRepoName = props.getProperty('artifactoryRepoName')  

def tomcatStackName = props.getProperty('tomcatStackName')
def dockerImageName = props.getProperty('dockerImageName')

println appName
println appEnv
println appClientName

def something="${appName}${appEnv}${appClientName}"
println something

//Write a new random string and persist it to the file system:
//props.setProperty('porcupine', "randomString")
//props.store(propsFile.newWriter(), null)

//Peek again:
//props.load(propsFile.newDataInputStream())
//println props.getProperty('porcupine')
