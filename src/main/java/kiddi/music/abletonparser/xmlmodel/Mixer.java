package kiddi.music.abletonparser.xmlmodel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Mixer {
    @JsonProperty("Tempo")
    private Tempo tempo;

    @JsonProperty("TimeSignature")
    private TimeSignature timeSignature;

    public Tempo getTempo() {
        return tempo;
    }

    public TimeSignature getTimeSignature() {
        return timeSignature;
    }
}
