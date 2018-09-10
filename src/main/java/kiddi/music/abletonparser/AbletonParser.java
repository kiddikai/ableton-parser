package kiddi.music.abletonparser;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import kiddi.music.abletonparser.simplemodel.AbletonWrapper;
import kiddi.music.abletonparser.xmlmodel.Ableton;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.zip.GZIPInputStream;

import static com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;

public class AbletonParser {
    public AbletonWrapper parse(Path alsFile) throws IOException {
        XmlMapper mapper = new XmlMapper();
        mapper.configure(FAIL_ON_UNKNOWN_PROPERTIES, false);
        InputStream inputStream = Files.newInputStream(alsFile);
        GZIPInputStream gzipInputStream = new GZIPInputStream(inputStream);
        return new AbletonWrapper(mapper.readValue(gzipInputStream, Ableton.class));
    }
}
