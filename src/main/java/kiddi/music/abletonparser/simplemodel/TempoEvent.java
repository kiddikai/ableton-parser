package kiddi.music.abletonparser.simplemodel;

public class TempoEvent {

    private final double time;
    private final int tempo;

    public TempoEvent(String time, String tempo) {
        this.time = Double.parseDouble(time);
        this.tempo = parseTempo(tempo);
    }

    private int parseTempo(String tempo) {
        double dTempo = Double.parseDouble(tempo);
        int iTempo = (int) Math.floor(dTempo);

        // TODO is this being restricted by MIDI in general or only by GP5?
        if (dTempo - iTempo > 0.0001) {
            System.err.println("Caution: Tempo events with decimal tempo values are not supported. Using " + iTempo + " bpm instead of " + dTempo);
        }

        return iTempo;
    }

    public double getTime() {
        return time;
    }

    public int getTempo() {
        return tempo;
    }
}
