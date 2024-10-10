## Challenge-05

### Scenario
* Lets continue to built on top of ds-challenge-04
* What we have done so far to reduce Developers pain points?
    * Automatic Extensions (Language Support for Java(TM) by Red Hat) inclusion
    * Automatic provisioning of required command line tools
    * Consistent way of building, packaging and running the programs
    * Consistent way of creating standardized end points for current and future testing
    * A kubernetes way of requesting resources for workloads that need more memory/cpu for testing. This allows dev to avoid unnecessary machine upgrades and or testing on other machines which require a complete setup
* This section will explore on adding more extensions in consistent way and also debugging code

### Set Up + verification
* Open a terminal. Run the command "chmod 755 mvnw" to change the mvnw file to be executable
* Run the quarkus application using commands "2. Start Development mode" from devfile like you did in the previous lab(s)
* Select your option "y/n" to the question (if asked) : Do you agree to contribute anonymous build time data to the Quarkus community?
* Open a new terminal and execute "curl localhost:8080/api/challenge". The response from the method has an error. The fifth character is "S" but it is returning "h"
* Open the "src/main/java/org/acme/ChallengeResource.java" and inspect the method challengeMethod()
* Try to put a breakpoint and you realize that they do not work and or a way to do it
* Find out what extension is required for adding breakpoints. Include the required line in the file ".vscode/extensions.json"
* Once you update the extensions.json, close the window, restart your workspace. Now you should be able to put a breakpoint in the challengeMethod()
* Rerun the quarkus application using commands "2. Start Development mode". You should see Debug functionality
* Now fix the code, execute "curl localhost:8080/api/challenge" to see you are seeing "The Fifth Chatacter in the word "OpenShift"=[S]"

### Success Criteria
* ".vscode/extensions.json" is updated with the required debug extension
* You have used the debugger to fix the challenge() method

### Resources 
* https://go.microsoft.com/fwlink/?LinkId=827846
* 

### What did we learn
* As a Developer, your life is getting simpler with the below
    * Automatic Extensions (Language Support for Java(TM) by Red Hat) inclusion
    * Automatic provisioning of required command line tools
    * Consistent way of building, packaging and running the programs
    * Consistent way of creating standardized end points for current and future testing
* Added to it, now you can debug just the way your normal IDE is
* Developers can get a requirement to test a service that needs very high resources that are not available on the laptops/desktops. The only way to deal in that scenario is to either update the laptop hardware or code in a different machine (where you will have to reconfigure the entire environment). Lets see how we can handle such scenario without losing all the benefits in the next challenge?
