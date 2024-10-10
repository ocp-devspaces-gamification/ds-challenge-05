## Challenge-05

### Scenario
* Lets continue to built on top of ds-challenge-04
* This section will explore on adding more extensions in consistent way and also debugging code

### Set Up + verification
* Open a terminal. Run the command "chmod 755 mvnw" to change the mvnw file to be executable
* Run the quarkus application using commands "2. Start Development mode" from devfile like you did in the previous lab(s)
* Select your option "y/n" to the question (if asked) : Do you agree to contribute anonymous build time data to the Quarkus community?
* Open a new terminal and execute "curl localhost:8080/api/challenge". The response from the method has an error. The fifth character is "S" but it is returning "h"
* Open the "src/main/java/org/acme/ChallengeResource.java" and inspect the method challengeMethod()
* Try to put a breakpoint and you realize that they do not work and or a way to do it
* Find out what extension is required for adding breakpoints. Include the required line in the file ".vscode/extensions.json"
* Once you update the extensions.json, restart your workspace. Now you should be able to put a breakpoint in the challengeMethod()
* Rerun the quarkus application using commands "2. Start Development mode". You can now use the "Run & Debug" from the navigation. There is a ".vscode/launch.json" already setup for you to use as a debug configuration.
* Now fix the code, execute "curl localhost:8080/api/challenge" to see you are seeing "The Fifth Chatacter in the word "OpenShift"=[S]"

### Success Criteria
* ".vscode/extensions.json" is updated with the required debug extension
* You have used the debugger to fix the challengeMethod() in "src/main/java/org/acme/ChallengeResource.java"

### Resources 
* https://go.microsoft.com/fwlink/?LinkId=827846
* 

### What did we learn?
* OpenShift DevSpaces reduces the Developers pain points. As a Developer, your life is getting simpler with the below
    * Automatic Extensions (Language Support for Java(TM) by Red Hat) inclusion
    * Automatic provisioning of required command line tools
    * Consistent way of building, packaging and running the programs
    * Consistent way of creating standardized end points for current and future testing
    * You can request additional resources easily similar to any workload in the kubernetes without the need for traditional hardware refreshes and or needing to require a compelete setup on brand new infrastructure
* Added to it, now you can debug your code similar to your normal IDE
* BIG TAKEAWAY
    * OpenShift DevSpaces works similar to your IDEs
    * All the above mentioned benefits enhance the developers joy
    * The entire development environment is created with "IDE as code" notion inside which makes it easier to track changes
