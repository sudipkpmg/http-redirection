package com.sudip;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/error")
public class ErrorResource {

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String hello(
            @QueryParam("key") String key
    ) {
        return String.format("<html><body>Key <b>%s</b> not understood</body></html>", key);
    }
}