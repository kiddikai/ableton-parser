package kiddi.music.abletonparser.simplemodel;

public class TempoEvent extends Event {

    private final int tempo;

    public TempoEvent(String timeQuarters, String tempo) {
        super(timeQuarters);
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

    public int getTempo() {
        return tempo;
    }
}
