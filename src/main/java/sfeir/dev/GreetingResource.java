package sfeir.dev;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import sfeir.dev.model.Person;

@Path("/api")
public class GreetingResource {

    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello !";
    }

    @GET
    @Path("/helloWithJson")
    @Produces(MediaType.APPLICATION_JSON)
    public Person helloWithJson() {
        return new Person("Axolotl");
    }
}
