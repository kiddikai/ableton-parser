package kiddi.music.abletonparser.simplemodel;

public class TimeSignature {
    final private int beats;
    final private int noteValue;

    // Ableton encodes time signatures as log2(noteValue) * 99 + beats - 1. This constructor decodes an Ableton time signature into the two separate values.
    public TimeSignature(String abletonSignature) {
        int abletonSignatureInt = Integer.parseInt(abletonSignature);
        int x = abletonSignatureInt % 99;
        int y = (abletonSignatureInt-x)/99;

        this.beats = x+1;
        this.noteValue = (int) Math.pow(2, y);
        System.out.println();
    }

    public String toString() {
        return beats + "/" + noteValue;
    }
}
