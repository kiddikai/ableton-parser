package kiddi.music.abletonparser.xmlmodel;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

public class ArrangerAutomationTempo {
    @JacksonXmlElementWrapper(localName = "Events")
    @JacksonXmlProperty(localName = "Event")
    private List<Event> events;

    public List<Event> getEvents() {
        return events;
    }
}
