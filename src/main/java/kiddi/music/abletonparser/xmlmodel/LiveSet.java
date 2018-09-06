package kiddi.music.abletonparser.xmlmodel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LiveSet {
    @JsonProperty("MasterTrack")
    private MasterTrack masterTrack;

    @JsonProperty("Locators")
    private Locators locators;

    public MasterTrack getMasterTrack() {
        return masterTrack;
    }

    public Locators getLocators() {
        return locators;
    }
}
