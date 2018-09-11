package kiddi.music.abletonparser.simplemodel;

public class Locator extends Event {
    private final String name;

    public Locator(String timeQuarters, String name) {
        super(timeQuarters);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
