package uk.gov.ida.saml.core.test.builders;

import org.joda.time.DateTime;
import uk.gov.ida.saml.core.domain.AssertionRestrictions;

/**
 * Domain Objects should not be shared across projects .
 * The aim is to inline all domain objects shared via this project and to get rid of this library
 *
 * @deprecated please replicate this class in the project it is used
 */
public class AssertionRestrictionsBuilder {

    private DateTime notOnOrAfter = DateTime.now().plusDays(2);
    private String inResponseTo = "default-in-response-to";
    private String recipient = "recipient";

    public static AssertionRestrictionsBuilder anAssertionRestrictions() {
        return new AssertionRestrictionsBuilder();
    }

    public AssertionRestrictions build() {
        return new AssertionRestrictions(
                notOnOrAfter,
                inResponseTo,
                recipient);
    }

    public AssertionRestrictionsBuilder withNotOnOrAfter(DateTime notOnOrAfter) {
        this.notOnOrAfter = notOnOrAfter;
        return this;
    }

    public AssertionRestrictionsBuilder withInResponseTo(String inResponseTo) {
        this.inResponseTo = inResponseTo;
        return this;
    }

    public AssertionRestrictionsBuilder withRecipient(String recipient) {
        this.recipient = recipient;
        return this;
    }
}
