package uk.gov.ida.saml.core.domain;

import org.joda.time.DateTime;

import java.net.URI;

/**
 * Domain Objects should not be shared across projects .
 * The aim is to inline all domain objects shared via this project and to get rid of this library
 *
 * @deprecated please replicate this class in the project it is used
 */
public abstract class IdaSamlResponse extends IdaSamlMessage implements IdaResponse {

    private String inResponseTo;

    protected IdaSamlResponse() {
    }

    protected IdaSamlResponse(
            String responseId,
            DateTime issueInstant,
            String inResponseTo,
            String issuer,
            URI destination) {

        super(responseId, issuer, issueInstant, destination);

        this.inResponseTo = inResponseTo;
    }

    public String getInResponseTo() {
        return inResponseTo;
    }
}
