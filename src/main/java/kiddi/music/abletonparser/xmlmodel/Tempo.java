package kiddi.music.abletonparser.xmlmodel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Tempo {
    @JsonProperty("ArrangerAutomation")
    private ArrangerAutomationTempo arrangerAutomation;

    public ArrangerAutomationTempo getArrangerAutomation() {
        return arrangerAutomation;
    }
}
