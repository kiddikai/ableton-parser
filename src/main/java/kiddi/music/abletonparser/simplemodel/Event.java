package kiddi.music.abletonparser.simplemodel;

public abstract class Event {

    private final double timeQuarters;

    public Event(String timeQuarters) {
        this.timeQuarters = Double.parseDouble(timeQuarters);
    }

    public double getTimeQuarters() {
        return timeQuarters;
    }
}
