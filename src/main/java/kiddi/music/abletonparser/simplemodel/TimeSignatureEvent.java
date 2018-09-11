package kiddi.music.abletonparser.simplemodel;

public class TimeSignatureEvent extends Event {
    private final TimeSignature timeSignature;

    public TimeSignatureEvent(String timeQuarters, String abletonSignature) {
        super(timeQuarters);
        this.timeSignature = new TimeSignature(abletonSignature);
    }
    public TimeSignature getTimeSignature() {
        return timeSignature;
    }
}
