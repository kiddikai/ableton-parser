package kiddi.music.abletonparser.xmlmodel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ValueElement {
    @JsonProperty("Value")
    private String value;

    public String getValue() {
        return value;
    }
}
