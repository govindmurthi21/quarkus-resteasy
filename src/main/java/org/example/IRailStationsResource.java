package org.example;


import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.example.models.StationInfo;
import org.example.proxies.IRailStationProxy;

import java.util.List;

@Path("/stations")
public class IRailStationsResource {

    @RestClient
    private IRailStationProxy iRailStationProxy;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getStations() {
        List<StationInfo> stations = iRailStationProxy.getStations("json", "en").getStations();
        return Response.ok(stations).build();
    }
}
