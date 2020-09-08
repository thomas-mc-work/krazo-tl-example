package org.example;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.mvc.Controller;
import javax.mvc.Models;
import javax.mvc.View;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Controller
@Path("user")
@RequestScoped
public class UserController {

    @Inject
    Models models;

    @GET
    @View("example.xhtml")
    public void getRequestDebug2() {
        models.put("myVariable", "myValue");
    }

}
