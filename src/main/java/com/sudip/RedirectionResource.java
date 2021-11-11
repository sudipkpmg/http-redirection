package com.sudip;

import org.jboss.logging.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import java.net.URI;

@Path("/redirect")
public class RedirectionResource {

    private static final Logger logger = Logger.getLogger(RedirectionResource.class);

    @Path("/{key}")
    @GET
    public Response doRedirect(
            @PathParam("key") String key
    ) {
        String destinationUrl;
        switch (key.toLowerCase()) {
            case "google":
                destinationUrl = "http://www.google.com";
                break;
            case "amazon":
                destinationUrl = "http://www.amazon.com";
                break;
            case "apple":
                destinationUrl = "http://www.apple.com";
                break;
            case "netflix":
                destinationUrl = "http://www.netflix.com";
                break;
            default:
                destinationUrl = "http://localhost:8080/error?key=" + key;
                break;
        }
        URI uri = URI.create(destinationUrl);
        return Response.seeOther(uri).build();
    }

}
