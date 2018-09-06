package kiddi.music.abletonparser.xmlmodel;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

public class Locators {
    @JacksonXmlElementWrapper(localName = "Locators")
    @JacksonXmlProperty(localName = "Locator")
    private List<Locator> locators;

    public List<Locator> getLocators() {
        return locators;
    }
}
