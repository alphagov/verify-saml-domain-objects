package uk.gov.ida.saml.core.test.builders;

import com.google.common.base.Optional;
import org.joda.time.DateTime;
import uk.gov.ida.saml.core.domain.AssertionRestrictions;
import uk.gov.ida.saml.core.domain.Cycle3Dataset;
import uk.gov.ida.saml.core.domain.HubAssertion;
import uk.gov.ida.saml.core.domain.PersistentId;

import java.util.UUID;

import static com.google.common.base.Optional.absent;
import static uk.gov.ida.saml.core.test.builders.AssertionRestrictionsBuilder.anAssertionRestrictions;
import static uk.gov.ida.saml.core.test.builders.PersistentIdBuilder.aPersistentId;

/**
 * Domain Objects should not be shared across projects .
 * The aim is to inline all domain objects shared via this project and to get rid of this library
 *
 * @deprecated please replicate this class in the project it is used
 */
public class HubAssertionBuilder {

    private String id = "assertion-id" + UUID.randomUUID();
    private String issuerId = "assertion issuer id";
    private DateTime issueInstant = DateTime.now();
    private PersistentId persistentId = aPersistentId().build();
    private AssertionRestrictions assertionRestrictions = anAssertionRestrictions().build();
    private Optional<Cycle3Dataset> cycle3Data = absent();

    public static HubAssertionBuilder aHubAssertion() {
        return new HubAssertionBuilder();
    }

    public HubAssertion build() {
        return new HubAssertion(
                id,
                issuerId,
                issueInstant,
                persistentId,
                assertionRestrictions,
                cycle3Data);
    }

    public HubAssertionBuilder withId(String id) {
        this.id = id;
        return this;
    }

    public HubAssertionBuilder withIssuerId(String issuerId) {
        this.issuerId = issuerId;
        return this;
    }

    public HubAssertionBuilder withIssueInstant(DateTime issueInstant) {
        this.issueInstant = issueInstant;
        return this;
    }

    public HubAssertionBuilder withPersistentId(PersistentId persistentId) {
        this.persistentId = persistentId;
        return this;
    }

    public HubAssertionBuilder withAssertionRestrictions(AssertionRestrictions assertionRestrictions) {
        this.assertionRestrictions = assertionRestrictions;
        return this;
    }

    public HubAssertionBuilder withCycle3Data(Cycle3Dataset cycle3Data) {
        this.cycle3Data = Optional.fromNullable(cycle3Data);
        return this;
    }
}
