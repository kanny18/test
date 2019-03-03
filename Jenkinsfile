//import hudson.model.*
//import hudson.EnvVars
//import groovy.json.JsonSlurperClassic
//import groovy.json.JsonBuilder
//import groovy.json.JsonOutput
//import java.net.URL
//import jenkins.model.Jenkins

node(){
    
    
    stage('test')
    sh 'touch test.txt'
   // def signature = 'new groovy.json.JsonSlurperClassicorg.jenkinsci.plugins.scriptsecurity.scripts.ScriptApproval.get().approveSignature(signature)
    stage ('checkout')
    git credentialsId: 'aba8ab2b-8f2d-4c9f-a9ca-02992a28484f', url: 'https://github.com/kanny18/test.git'
    stage('groovy')
  /*  def signature = 'new groovy.json.JsonSlurperClassic'
 org.jenkinsci.plugins.scriptsecurity.scripts.ScriptApproval.get().approveSignature(signature)
def securitySdkJob = Jenkins.instance.getItemByFullName("sparse")
def securitySdkLastSuccessfulBuildNumber=securitySdkJob.getLastSuccessfulBuild().getNumber()

def darkSuiteJob = Jenkins.instance.getItemByFullName("checkout")
def darkSuiteLastSuccessfulBuildNumber=darkSuiteJob.getLastSuccessfulBuild().getNumber()
echo "$darkSuiteLastSuccessfulBuildNumber"

currentBuild.description = "Latest Master-DarkSuite Build: $darkSuiteLastSuccessfulBuildNumber<br>Latest Master-SecuritySDK Build: $securitySdkLastSuccessfulBuildNumber"
*/
    load 'test.groovy'
    stage ('checkout again')
    {
       git credentialsId: 'aba8ab2b-8f2d-4c9f-a9ca-02992a28484f', url: 'https://github.com/kanny18/jenkins.git'
    }
    
}
