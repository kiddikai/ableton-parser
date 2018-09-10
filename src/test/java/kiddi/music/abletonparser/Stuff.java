package kiddi.music.abletonparser;

import kiddi.music.abletonparser.simplemodel.AbletonWrapper;
import kiddi.music.abletonparser.simplemodel.Locator;
import kiddi.music.abletonparser.simplemodel.TempoEvent;
import kiddi.music.abletonparser.simplemodel.TimeSignatureEvent;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

public class Stuff {
    @Test
    public void stuff() throws IOException {
        AbletonParser parser = new AbletonParser();
        AbletonWrapper ableton = parser.parse(Paths.get("src/test/resources/Agnosie.als"));

        List<Locator> locators = ableton.getLocators();
        List<TempoEvent> tempoEvents = ableton.getTempoEvents();
        List<TimeSignatureEvent> timeSignatureEvents = ableton.getTimeSignatureEvents();
    }
}
