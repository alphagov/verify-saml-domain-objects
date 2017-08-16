package uk.gov.ida.saml.core.domain;

/**
 * Domain Objects should not be shared across projects .
 * The aim is to inline all domain objects shared via this project and to get rid of this library
 *
 * @deprecated please replicate this class in the project it is used
 */
public class FraudAuthnDetails {

    private final String eventId;
    private final String fraudIndicator;

    public FraudAuthnDetails(String eventId, String fraudIndicator) {
        this.eventId = eventId;
        this.fraudIndicator = fraudIndicator;
    }

    public String getEventId() {
        return eventId;
    }

    public String getFraudIndicator() {
        return fraudIndicator;
    }
}
