package kiddi.music.abletonparser;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import kiddi.music.abletonparser.simplemodel.AbletonWrapper;
import kiddi.music.abletonparser.xmlmodel.Ableton;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;

public class AbletonParser {
    public AbletonWrapper parse(Path alsFile) throws IOException {
        // TODO deflate gzip
        XmlMapper mapper = new XmlMapper();
        mapper.configure(FAIL_ON_UNKNOWN_PROPERTIES, false);
        return new AbletonWrapper(mapper.readValue(Files.newInputStream(alsFile), Ableton.class));
    }
}
