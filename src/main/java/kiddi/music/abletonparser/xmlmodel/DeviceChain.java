package kiddi.music.abletonparser.xmlmodel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DeviceChain {
    @JsonProperty("Mixer")
    private Mixer mixer;

    public Mixer getMixer() {
        return mixer;
    }
}
