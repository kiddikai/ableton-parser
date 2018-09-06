package kiddi.music.abletonparser.simplemodel;

public class Locator {
    private final double time;
    private final String name;

    public Locator(String time, String name) {
        this.time = Double.parseDouble(time);
        this.name = name;
    }

    public double getTime() {
        return time;
    }

    public String getName() {
        return name;
    }
}
