package uk.gov.ida.saml.core.domain;

import org.joda.time.DateTime;

import java.net.URI;
import java.util.Optional;

/**
 * Domain Objects should not be shared across projects .
 * The aim is to inline all domain objects shared via this project and to get rid of this library
 *
 * @deprecated please replicate this class in the project it is used
 */
public class OutboundResponseFromHub extends IdaSamlResponse {

    private Optional<String> matchingServiceAssertion;
    private TransactionIdaStatus status;

    public OutboundResponseFromHub(
            String responseId,
            String inResponseTo,
            String issuer,
            DateTime issueInstant,
            TransactionIdaStatus status,
            Optional<String> matchingServiceAssertion,
            URI destination) {

        super(responseId, issueInstant, inResponseTo, issuer, destination);
        this.matchingServiceAssertion = matchingServiceAssertion;
        this.status = status;
    }

    public Optional<String> getMatchingServiceAssertion() {
        return matchingServiceAssertion;
    }

    public TransactionIdaStatus getStatus() {
        return status;
    }
}
