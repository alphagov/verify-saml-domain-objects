package uk.gov.ida.saml.core.domain;

import org.joda.time.DateTime;

import java.net.URI;

/**
 * Domain Objects should not be shared across projects .
 * The aim is to inline all domain objects shared via this project and to get rid of this library
 *
 * @deprecated please replicate this class in the project it is used
 */
public abstract class IdaSamlMessage extends IdaMessage {

    private URI destination;

    protected IdaSamlMessage() {
    }

    public IdaSamlMessage(String id, String issuer, DateTime issueInstant, URI destination) {
        super(id, issuer, issueInstant);
        this.destination = destination;
    }

    public URI getDestination() {
        return destination;
    }
}
