package org.example.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StopWrapper {

    @JsonProperty("stop")
    private List<Stop> stop;

    public List<Stop> getStop() {
        return stop;
    }

    public void setStop(List<Stop> stops) {
        this.stop = stops;
    }
}
