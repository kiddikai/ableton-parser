package kiddi.music.abletonparser.xmlmodel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Locator {
    @JsonProperty("Time")
    private ValueElement time;

    @JsonProperty("Name")
    private ValueElement name;

    public ValueElement getTime() {
        return time;
    }

    public ValueElement getName() {
        return name;
    }
}
