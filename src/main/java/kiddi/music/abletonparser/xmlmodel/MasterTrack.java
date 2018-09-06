package kiddi.music.abletonparser.xmlmodel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MasterTrack {
    @JsonProperty("DeviceChain")
    private DeviceChain deviceChain;

    public DeviceChain getDeviceChain() {
        return deviceChain;
    }
}
