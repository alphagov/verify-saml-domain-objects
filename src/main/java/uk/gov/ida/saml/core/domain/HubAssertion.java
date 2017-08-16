package uk.gov.ida.saml.core.domain;

import com.google.common.base.Optional;
import org.joda.time.DateTime;

/**
 * Domain Objects should not be shared across projects .
 * The aim is to inline all domain objects shared via this project and to get rid of this library
 *
 * @deprecated please replicate this class in the project it is used
 */
public class HubAssertion extends OutboundAssertion {
    private Optional<Cycle3Dataset> cycle3Data = Optional.absent();

    public HubAssertion(
            String id,
            String issuerId,
            DateTime issueInstant,
            PersistentId persistentId,
            AssertionRestrictions assertionRestrictions,
            Optional<Cycle3Dataset> cycle3Data) {

        super(id, issuerId, issueInstant, persistentId, assertionRestrictions);

        this.cycle3Data = cycle3Data;
    }

    public Optional<Cycle3Dataset> getCycle3Data() {
        return cycle3Data;
    }
}
