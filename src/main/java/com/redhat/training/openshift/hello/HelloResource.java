package com.redhat.training.openshift.hello;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/")
public class HelloResource {

    @GET
    @Path("/hello")
    @Produces("text/plain")
    public String hello() {
        String hostname = System.getenv().getOrDefault("HOSTNAME", "unknown");
        return "Hello world from host ["+hostname+"]\n";
    }

    @GET
    @Path("/health")
    @Produces("text/plain")
    public String health() {
        return "nothing\n";
    }
}
