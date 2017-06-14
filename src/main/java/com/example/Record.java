
package com.example;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "timestamp",
    "Districts",
    "ExoticBreedLandrays",
    "ExoticBreedYorkshire",
    "ExoticBreedHampshire",
    "ExoticBreedSaddleback",
    "ExoticBreedAustralianLargeBlack",
    "ExoticBreedDuroc",
    "ExoticBreedTotalExoticPigs"
})
public class Record {

    @JsonProperty("id")
    private String id;
    @JsonProperty("timestamp")
    private String timestamp;
    @JsonProperty("Districts")
    private String districts;
    @JsonProperty("ExoticBreedLandrays")
    private String exoticBreedLandrays;
    @JsonProperty("ExoticBreedYorkshire")
    private String exoticBreedYorkshire;
    @JsonProperty("ExoticBreedHampshire")
    private String exoticBreedHampshire;
    @JsonProperty("ExoticBreedSaddleback")
    private String exoticBreedSaddleback;
    @JsonProperty("ExoticBreedAustralianLargeBlack")
    private String exoticBreedAustralianLargeBlack;
    @JsonProperty("ExoticBreedDuroc")
    private String exoticBreedDuroc;
    @JsonProperty("ExoticBreedTotalExoticPigs")
    private String exoticBreedTotalExoticPigs;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("Districts")
    public String getDistricts() {
        return districts;
    }

    @JsonProperty("Districts")
    public void setDistricts(String districts) {
        this.districts = districts;
    }

    @JsonProperty("ExoticBreedLandrays")
    public String getExoticBreedLandrays() {
        return exoticBreedLandrays;
    }

    @JsonProperty("ExoticBreedLandrays")
    public void setExoticBreedLandrays(String exoticBreedLandrays) {
        this.exoticBreedLandrays = exoticBreedLandrays;
    }

    @JsonProperty("ExoticBreedYorkshire")
    public String getExoticBreedYorkshire() {
        return exoticBreedYorkshire;
    }

    @JsonProperty("ExoticBreedYorkshire")
    public void setExoticBreedYorkshire(String exoticBreedYorkshire) {
        this.exoticBreedYorkshire = exoticBreedYorkshire;
    }

    @JsonProperty("ExoticBreedHampshire")
    public String getExoticBreedHampshire() {
        return exoticBreedHampshire;
    }

    @JsonProperty("ExoticBreedHampshire")
    public void setExoticBreedHampshire(String exoticBreedHampshire) {
        this.exoticBreedHampshire = exoticBreedHampshire;
    }

    @JsonProperty("ExoticBreedSaddleback")
    public String getExoticBreedSaddleback() {
        return exoticBreedSaddleback;
    }

    @JsonProperty("ExoticBreedSaddleback")
    public void setExoticBreedSaddleback(String exoticBreedSaddleback) {
        this.exoticBreedSaddleback = exoticBreedSaddleback;
    }

    @JsonProperty("ExoticBreedAustralianLargeBlack")
    public String getExoticBreedAustralianLargeBlack() {
        return exoticBreedAustralianLargeBlack;
    }

    @JsonProperty("ExoticBreedAustralianLargeBlack")
    public void setExoticBreedAustralianLargeBlack(String exoticBreedAustralianLargeBlack) {
        this.exoticBreedAustralianLargeBlack = exoticBreedAustralianLargeBlack;
    }

    @JsonProperty("ExoticBreedDuroc")
    public String getExoticBreedDuroc() {
        return exoticBreedDuroc;
    }

    @JsonProperty("ExoticBreedDuroc")
    public void setExoticBreedDuroc(String exoticBreedDuroc) {
        this.exoticBreedDuroc = exoticBreedDuroc;
    }

    @JsonProperty("ExoticBreedTotalExoticPigs")
    public String getExoticBreedTotalExoticPigs() {
        return exoticBreedTotalExoticPigs;
    }

    @JsonProperty("ExoticBreedTotalExoticPigs")
    public void setExoticBreedTotalExoticPigs(String exoticBreedTotalExoticPigs) {
        this.exoticBreedTotalExoticPigs = exoticBreedTotalExoticPigs;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
