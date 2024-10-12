package org.example.proxies;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.example.models.Station;

@Path("v1/")
@Produces(MediaType.APPLICATION_JSON)
@RegisterRestClient(baseUri = "https://api.irail.be/")
public interface IRailStationProxy {
    @Path("stations")
    @GET
    @JsonProperty("station")
    Station getStations(@DefaultValue("json") @QueryParam("format") String format,
                        @DefaultValue("en") @QueryParam("lang") String lang);
}
