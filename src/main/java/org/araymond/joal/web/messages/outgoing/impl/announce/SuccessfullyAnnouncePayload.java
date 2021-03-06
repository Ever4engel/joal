package org.araymond.joal.web.messages.outgoing.impl.announce;

import com.turn.ttorrent.common.protocol.TrackerMessage.AnnounceRequestMessage.RequestEvent;
import org.araymond.joal.core.events.announce.SuccessfullyAnnounceEvent;

public class SuccessfullyAnnouncePayload extends AnnouncePayload {
    private final RequestEvent requestEvent;

    public SuccessfullyAnnouncePayload(final SuccessfullyAnnounceEvent event) {
        super(event.getAnnouncerFacade());
        this.requestEvent = event.getEvent();
    }

    public RequestEvent getRequestEvent() {
        return requestEvent;
    }
}
