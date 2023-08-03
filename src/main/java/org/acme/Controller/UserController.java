package org.acme.Controller;


import org.acme.Entity.User;
import org.acme.Service.UserService;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/api")
public class UserController {

    @Inject
    UserService userService;

    @POST
    @Path("/create")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(User user) {
        userService.addUSer(user);
        return Response.ok(user).status(Response.Status.CREATED).build();
    }

    
    
}
