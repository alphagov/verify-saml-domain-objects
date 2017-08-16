package uk.gov.ida.saml.core.domain;

import org.joda.time.DateTime;

/**
 * Domain Objects should not be shared across projects .
 * The aim is to inline all domain objects shared via this project and to get rid of this library
 *
 * @deprecated please replicate this class in the project it is used
 */
public abstract class IdaMatchingServiceResponse extends IdaMessage implements IdaResponse {

    private String inResponseTo;

    protected IdaMatchingServiceResponse() {
    }

    public IdaMatchingServiceResponse(String responseId, String inResponseTo, String issuer, DateTime issueInstant) {
        super(responseId, issuer, issueInstant);
        this.inResponseTo = inResponseTo;
    }

    public String getInResponseTo() {
        return inResponseTo;
    }
}
