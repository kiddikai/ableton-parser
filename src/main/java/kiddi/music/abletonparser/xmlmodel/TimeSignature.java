package kiddi.music.abletonparser.xmlmodel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TimeSignature {
    @JsonProperty("ArrangerAutomation")
    private ArrangerAutomationTimeSignature arrangerAutomation;

    public ArrangerAutomationTimeSignature getArrangerAutomation() {
        return arrangerAutomation;
    }
}
