//import hudson.model.*
//import hudson.EnvVars
//import groovy.json.JsonSlurperClassic
//import groovy.json.JsonBuilder
//import groovy.json.JsonOutput
//import java.net.URL
//import jenkins.model.Jenkins

node(){
    
    properties([pipelineTriggers([pollSCM('H/2 * * * *')])])

    
    stage('checkout')
    //checkout([$class: 'GitSCM', branches: [[name: '/refs/heads/develop']], doGenerateSubmoduleConfigurations: false, extensions: [[$class: 'SparseCheckoutPaths', sparseCheckoutPaths: [[path: '']]]], submoduleCfg: [], userRemoteConfigs: [[credentialsId: '277ec06f-179d-4198-9ef6-ce88e0b98a96', url: 'https://github.com/kanny18/test.git']]])
    //checkout([$class: 'GitSCM', branches: [[name: '/refs/heads/develop']], doGenerateSubmoduleConfigurations: false, extensions: [[$class: 'SparseCheckoutPaths', sparseCheckoutPaths: [[path: '']]]], submoduleCfg: [], userRemoteConfigs: [[credentialsId: '277ec06f-179d-4198-9ef6-ce88e0b98a96', url: 'https://github.com/kanny18/myrepo.git']]])
      checkout([$class: 'GitSCM', branches: [[name: '/refs/heads/develop']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: '277ec06f-179d-4198-9ef6-ce88e0b98a96', url: 'https://github.com/kanny18/test.git']]])
      checkout([$class: 'GitSCM', branches: [[name: '/refs/heads/develop']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: '277ec06f-179d-4198-9ef6-ce88e0b98a96', url: 'https://github.com/kanny18/myrepo.git']]])


    stage('test')
    sh 'touch test.txt'
   // def signature = 'new groovy.json.JsonSlurperClassicorg.jenkinsci.plugins.scriptsecurity.scripts.ScriptApproval.get().approveSignature(signature)
   // stage('groovy')
   /* def signature = 'new groovy.json.JsonSlurperClassic'
 org.jenkinsci.plugins.scriptsecurity.scripts.ScriptApproval.get().approveSignature(signature)
def securitySdkJob = Jenkins.instance.getItemByFullName("sparse")
def securitySdkLastSuccessfulBuildNumber=securitySdkJob.getLastSuccessfulBuild().getNumber()

def darkSuiteJob = Jenkins.instance.getItemByFullName("checkout")
def darkSuiteLastSuccessfulBuildNumber=darkSuiteJob.getLastSuccessfulBuild().getNumber()
echo "$darkSuiteLastSuccessfulBuildNumber"

currentBuild.description = "Latest Master-DarkSuite Build: $darkSuiteLastSuccessfulBuildNumber<br>Latest Master-SecuritySDK Build: $securitySdkLastSuccessfulBuildNumber"
*/
   
}
