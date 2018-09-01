package com.kodnito.restapi.rest;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@RequestScoped
@Path("hello")
public class HelloWorldResource {

    @GET
    @Produces("text/plain")
    public Response doGet() {
        return Response.ok("Hello from TomEE!").build();
    }
}