package kiddi.music.abletonparser.xmlmodel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Event {
    @JsonProperty("Time")
    private String time;

    @JsonProperty("Value")
    private String value;

    public String getTime() {
        return time;
    }

    public String getValue() {
        return value;
    }
}
