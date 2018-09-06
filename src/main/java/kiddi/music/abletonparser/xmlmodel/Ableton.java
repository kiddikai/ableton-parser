package kiddi.music.abletonparser.xmlmodel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Ableton {
    @JsonProperty("MajorVersion")
    private String majorVersion;

    @JsonProperty("MinorVersion")
    private String minorVersion;

    @JsonProperty("Creator")
    private String creator;

    @JsonProperty("LiveSet")
    private LiveSet liveSet;

    public String getMajorVersion() {
        return majorVersion;
    }

    public String getMinorVersion() {
        return minorVersion;
    }

    public String getCreator() {
        return creator;
    }

    public LiveSet getLiveSet() {
        return liveSet;
    }
}
