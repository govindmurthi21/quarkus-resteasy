package org.example;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.example.models.Connection;
import org.example.proxies.IRailConnectionProxy;

import java.util.List;

@Path("/connections")
public class IRailConnectionsResource {
    @RestClient
    IRailConnectionProxy proxy;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllConnections(@QueryParam("from") String from,
                                      @QueryParam("to") String to,
                                      @QueryParam("date") String date,
                                      @QueryParam("time") String time,
                                      @QueryParam("results") Integer results

    ) {
        List<Connection> connectionList = proxy.getConnections(
                from,
                to,
                date,
                time,
                "departure",
                "json",
                "en",
                "automatic",
                false,
                results).getConnectionList();
        return Response.ok(connectionList).build();
    }

}
