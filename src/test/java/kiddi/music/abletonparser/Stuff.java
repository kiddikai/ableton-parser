package kiddi.music.abletonparser;

import kiddi.music.abletonparser.model.Ableton;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Paths;

public class Stuff {
    @Test
    public void stuff() throws IOException {
        AbletonParser parser = new AbletonParser();
        Ableton ableton = parser.parse(Paths.get("src/test/resources/Agnosie unpacked.als.xml"));
        System.out.println();
    }
}
