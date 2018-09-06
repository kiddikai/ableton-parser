package kiddi.music.abletonparser;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import kiddi.music.abletonparser.model.Ableton;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;

public class AbletonParser {
    public Ableton parse(Path alsFile) throws IOException {
        XmlMapper mapper = new XmlMapper();
        mapper.configure(FAIL_ON_UNKNOWN_PROPERTIES, false);
        return mapper.readValue(Files.newInputStream(alsFile), Ableton.class);
    }
}
