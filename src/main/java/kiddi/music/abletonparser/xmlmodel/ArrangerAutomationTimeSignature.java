package kiddi.music.abletonparser.xmlmodel;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

public class ArrangerAutomationTimeSignature {
    @JacksonXmlElementWrapper(localName = "Events")
    @JacksonXmlProperty(localName = "EnumEvent")
    private List<Event> events;

    public List<Event> getEvents() {
        return events;
    }
}
