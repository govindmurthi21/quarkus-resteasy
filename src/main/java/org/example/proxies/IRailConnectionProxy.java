package org.example.proxies;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.example.models.Connection;
import org.example.models.ConnectionWrapper;

import java.util.List;

@Path("v1/")
@Produces(MediaType.APPLICATION_JSON)
@RegisterRestClient()
public interface IRailConnectionProxy {
    @Path("connections")
    @GET
    ConnectionWrapper getConnections(@QueryParam("from") String from,
                                     @QueryParam("to") String to,
                                     @QueryParam("date") String date,
                                     @QueryParam("time") String time,
                                     @QueryParam("timesel") String timesel,
                                     @QueryParam("format") String format,
                                     @QueryParam("lang") String lang,
                                     @QueryParam("typeOfTransport") String typeOfTransport,
                                     @QueryParam("alerts") Boolean alerts,
                                     @QueryParam("results") Integer results
                        );
}
