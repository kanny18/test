def signature = 'new groovy.json.JsonSlurperClassic'
 org.jenkinsci.plugins.scriptsecurity.scripts.ScriptApproval.get().approveSignature(signature)
def securitySdkJob = Jenkins.instance.getItemByFullName("sparse")
def securitySdkLastSuccessfulBuildNumber=securitySdkJob.getLastSuccessfulBuild().getNumber()

def darkSuiteJob = Jenkins.instance.getItemByFullName("checkout")
def darkSuiteLastSuccessfulBuildNumber=darkSuiteJob.getLastSuccessfulBuild().getNumber()
echo "$darkSuiteLastSuccessfulBuildNumber"

currentBuild.description = "Latest Master-DarkSuite Build: $darkSuiteLastSuccessfulBuildNumber<br>Latest Master-SecuritySDK Build: $securitySdkLastSuccessfulBuildNumber"
