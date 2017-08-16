package uk.gov.ida.saml.core.domain;

import org.joda.time.DateTime;

/**
 * Domain Objects should not be shared across projects .
 * The aim is to inline all domain objects shared via this project and to get rid of this library
 *
 * @deprecated please replicate this class in the project it is used
 */
public class OutboundAssertion {

    private String id;
    private String issuerId;
    private DateTime issueInstant;
    private PersistentId persistentId;
    private AssertionRestrictions assertionRestrictions;

    public OutboundAssertion(
            String id,
            String issuerId,
            DateTime issueInstant,
            PersistentId persistentId,
            AssertionRestrictions assertionRestrictions) {

        this.id = id;
        this.issuerId = issuerId;
        this.issueInstant = issueInstant;
        this.persistentId = persistentId;
        this.assertionRestrictions = assertionRestrictions;
    }

    public PersistentId getPersistentId() {
        return persistentId;
    }

    public AssertionRestrictions getAssertionRestrictions() {
        return assertionRestrictions;
    }

    public String getId() {
        return id;
    }

    public String getIssuerId() {
        return issuerId;
    }

    public DateTime getIssueInstant() {
        return issueInstant;
    }
}
