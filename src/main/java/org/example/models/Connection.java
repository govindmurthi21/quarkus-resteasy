package org.example.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Connection {

    @JsonProperty("departure")
    private Stats departure;
    @JsonProperty("arrival")
    private Stats arrival;

    public Stats getDeparture() {
        return departure;
    }

    public void setDeparture(Stats departure) {
        this.departure = departure;
    }

    public Stats getArrival() {
        return arrival;
    }

    public void setArrival(Stats arrival) {
        this.arrival = arrival;
    }
}


