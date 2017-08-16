package uk.gov.ida.saml.core.domain;

import org.joda.time.DateTime;

/**
 * Domain Objects should not be shared across projects .
 * The aim is to inline all domain objects shared via this project and to get rid of this library
 *
 * @deprecated please replicate this class in the project it is used
 */
public abstract class IdaMessage {

    private String id;
    private String issuer;
    private DateTime issueInstant;

    protected IdaMessage() {
    }

    public IdaMessage(String id, String issuer, DateTime issueInstant) {
        this.id = id;
        this.issuer = issuer;
        this.issueInstant = issueInstant;
    }

    public String getId(){
        return id;
    }

    public String getIssuer() {
        return issuer;
    }

    public DateTime getIssueInstant() {
        return issueInstant;
    }
}
