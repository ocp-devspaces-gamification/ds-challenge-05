package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/api")
public class ChallengeResource {

    //TODO : Find out what is wrong in this method using breakpoints
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("challenge04")    
    public String challengeMethod() {
        String name = "OpenShift DevSpaces";
        int length = name.length();
        for (int index=0; index<length; index++){
            char myChat = name.charAt(index);
            if(index==5){
                char fifthCharacter = name.charAt(index);
                return "The Fifth Chatacter in the word \"OpenShift\"=["+fifthCharacter+"]\n";                
            }
        }
        return "String is shorter than length 5 \n";
    }


    @Path("greet/{name}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String greetUser(String name) {
     String user = name;
     return "Hello "+user+"\n";
    }    

    // Sample Hello Method
    @Path("hello")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String greet() {
        return "Hello Challenge Attendees";
    }    

}