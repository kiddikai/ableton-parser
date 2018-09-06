package kiddi.music.abletonparser.simplemodel;

public class TimeSignatureEvent {
    private final double time;
    private final TimeSignature timeSignature;

    public TimeSignatureEvent(String time, String abletonSignature) {
        this.time = Double.parseDouble(time);
        this.timeSignature = new TimeSignature(abletonSignature);
    }

    public double getTime() {
        return time;
    }

    public TimeSignature getTimeSignature() {
        return timeSignature;
    }
}
