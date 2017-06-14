
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
public class Fields {

    @JsonProperty("id")
    private Id id;
    @JsonProperty("timestamp")
    private Timestamp timestamp;
    @JsonProperty("Districts")
    private Districts districts;
    @JsonProperty("ExoticBreedLandrays")
    private ExoticBreedLandrays exoticBreedLandrays;
    @JsonProperty("ExoticBreedYorkshire")
    private ExoticBreedYorkshire exoticBreedYorkshire;
    @JsonProperty("ExoticBreedHampshire")
    private ExoticBreedHampshire exoticBreedHampshire;
    @JsonProperty("ExoticBreedSaddleback")
    private ExoticBreedSaddleback exoticBreedSaddleback;
    @JsonProperty("ExoticBreedAustralianLargeBlack")
    private ExoticBreedAustralianLargeBlack exoticBreedAustralianLargeBlack;
    @JsonProperty("ExoticBreedDuroc")
    private ExoticBreedDuroc exoticBreedDuroc;
    @JsonProperty("ExoticBreedTotalExoticPigs")
    private ExoticBreedTotalExoticPigs exoticBreedTotalExoticPigs;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Id getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Id id) {
        this.id = id;
    }

    @JsonProperty("timestamp")
    public Timestamp getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("Districts")
    public Districts getDistricts() {
        return districts;
    }

    @JsonProperty("Districts")
    public void setDistricts(Districts districts) {
        this.districts = districts;
    }

    @JsonProperty("ExoticBreedLandrays")
    public ExoticBreedLandrays getExoticBreedLandrays() {
        return exoticBreedLandrays;
    }

    @JsonProperty("ExoticBreedLandrays")
    public void setExoticBreedLandrays(ExoticBreedLandrays exoticBreedLandrays) {
        this.exoticBreedLandrays = exoticBreedLandrays;
    }

    @JsonProperty("ExoticBreedYorkshire")
    public ExoticBreedYorkshire getExoticBreedYorkshire() {
        return exoticBreedYorkshire;
    }

    @JsonProperty("ExoticBreedYorkshire")
    public void setExoticBreedYorkshire(ExoticBreedYorkshire exoticBreedYorkshire) {
        this.exoticBreedYorkshire = exoticBreedYorkshire;
    }

    @JsonProperty("ExoticBreedHampshire")
    public ExoticBreedHampshire getExoticBreedHampshire() {
        return exoticBreedHampshire;
    }

    @JsonProperty("ExoticBreedHampshire")
    public void setExoticBreedHampshire(ExoticBreedHampshire exoticBreedHampshire) {
        this.exoticBreedHampshire = exoticBreedHampshire;
    }

    @JsonProperty("ExoticBreedSaddleback")
    public ExoticBreedSaddleback getExoticBreedSaddleback() {
        return exoticBreedSaddleback;
    }

    @JsonProperty("ExoticBreedSaddleback")
    public void setExoticBreedSaddleback(ExoticBreedSaddleback exoticBreedSaddleback) {
        this.exoticBreedSaddleback = exoticBreedSaddleback;
    }

    @JsonProperty("ExoticBreedAustralianLargeBlack")
    public ExoticBreedAustralianLargeBlack getExoticBreedAustralianLargeBlack() {
        return exoticBreedAustralianLargeBlack;
    }

    @JsonProperty("ExoticBreedAustralianLargeBlack")
    public void setExoticBreedAustralianLargeBlack(ExoticBreedAustralianLargeBlack exoticBreedAustralianLargeBlack) {
        this.exoticBreedAustralianLargeBlack = exoticBreedAustralianLargeBlack;
    }

    @JsonProperty("ExoticBreedDuroc")
    public ExoticBreedDuroc getExoticBreedDuroc() {
        return exoticBreedDuroc;
    }

    @JsonProperty("ExoticBreedDuroc")
    public void setExoticBreedDuroc(ExoticBreedDuroc exoticBreedDuroc) {
        this.exoticBreedDuroc = exoticBreedDuroc;
    }

    @JsonProperty("ExoticBreedTotalExoticPigs")
    public ExoticBreedTotalExoticPigs getExoticBreedTotalExoticPigs() {
        return exoticBreedTotalExoticPigs;
    }

    @JsonProperty("ExoticBreedTotalExoticPigs")
    public void setExoticBreedTotalExoticPigs(ExoticBreedTotalExoticPigs exoticBreedTotalExoticPigs) {
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
