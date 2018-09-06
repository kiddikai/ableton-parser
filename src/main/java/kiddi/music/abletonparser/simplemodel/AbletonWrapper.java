package kiddi.music.abletonparser.simplemodel;

import kiddi.music.abletonparser.xmlmodel.Ableton;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AbletonWrapper {
    private final Ableton ableton;

    public AbletonWrapper(Ableton ableton) {
        this.ableton = ableton;
    }

    public List<Locator> getLocators() {
        return ableton.getLiveSet().getLocators().getLocators().stream()
                .map(locator -> new Locator(
                        locator.getTime().getValue(),
                        locator.getName().getValue()
                ))
                .sorted(Comparator.comparingDouble(Locator::getTime))
                .collect(Collectors.toList());
    }

    public List<TempoEvent> getTempoEvents() {
        return ableton.getLiveSet().getMasterTrack().getDeviceChain().getMixer().getTempo().getArrangerAutomation().getEvents().stream()
                .map(event -> new TempoEvent(event.getTime(), event.getValue()))
                .sorted(Comparator.comparingDouble(TempoEvent::getTime))
                .collect(Collectors.toList());
    }

    public List<TimeSignatureEvent> getTimeSignatureEvents() {
        return ableton.getLiveSet().getMasterTrack().getDeviceChain().getMixer().getTimeSignature().getArrangerAutomation().getEvents().stream()
                .map(event -> new TimeSignatureEvent(event.getTime(), event.getValue()))
                .sorted(Comparator.comparingDouble(TimeSignatureEvent::getTime))
                .collect(Collectors.toList());
    }
}
