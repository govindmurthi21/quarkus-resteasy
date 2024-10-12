package org.example.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Stop {
    @JsonProperty("stationinfo")
    private StationInfo stationInfo;
    @JsonProperty("scheduledArrivalTime")
    private Instant scheduledArrivalTime;
    @JsonProperty("scheduledDepartureTime")
    private Instant scheduledDepartureTime;

    public StationInfo getStationInfo() {
        return stationInfo;
    }

    public void setStationInfo(StationInfo stationInfo) {
        this.stationInfo = stationInfo;
    }

    public Instant getScheduledArrivalTime() {
        return scheduledArrivalTime;
    }

    public void setScheduledArrivalTime(Instant scheduledArrivalTime) {
        this.scheduledArrivalTime = scheduledArrivalTime;
    }

    public Instant getScheduledDepartureTime() {
        return scheduledDepartureTime;
    }

    public void setScheduledDepartureTime(Instant scheduledDepartureTime) {
        this.scheduledDepartureTime = scheduledDepartureTime;
    }
}
