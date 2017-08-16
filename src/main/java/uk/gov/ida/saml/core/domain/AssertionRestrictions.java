package uk.gov.ida.saml.core.domain;

import org.joda.time.DateTime;

/**
 * Domain Objects should not be shared across projects .
 * The aim is to inline all domain objects shared via this project and to get rid of this library
 *
 * @deprecated please replicate this class in the project it is used
 */
public class AssertionRestrictions {
    private String recipient;
    private DateTime notOnOrAfter;
    private String inResponseTo;

    protected AssertionRestrictions() {}

    public AssertionRestrictions(DateTime notOnOrAfter, String inResponseTo, String recipient) {
        this.notOnOrAfter = notOnOrAfter;
        this.inResponseTo = inResponseTo;
        this.recipient = recipient;
    }

    public DateTime getNotOnOrAfter() {
        return notOnOrAfter;
    }

    public String getInResponseTo() {
        return inResponseTo;
    }

    public String getRecipient() {
        return this.recipient;
    }
}
