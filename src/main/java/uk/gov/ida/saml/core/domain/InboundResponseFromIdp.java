package uk.gov.ida.saml.core.domain;

import org.joda.time.DateTime;
import org.opensaml.xmlsec.signature.Signature;

import java.net.URI;
import java.util.Optional;

/**
 * Domain Objects should not be shared across projects .
 * The aim is to inline all domain objects shared via this project and to get rid of this library
 *
 * @deprecated please replicate this class in the project it is used
 */
public class InboundResponseFromIdp extends IdaSamlResponse {
    private Optional<PassthroughAssertion> matchingDatasetAssertion;
    private Optional<PassthroughAssertion> authnStatementAssertion;
    private Optional<Signature> signature;
    private IdpIdaStatus status;

    public InboundResponseFromIdp(
            String id,
            String inResponseTo,
            String issuer,
            DateTime issueInstant,
            IdpIdaStatus status,
            Optional<Signature> signature,
            Optional<PassthroughAssertion> matchingDatasetAssertion,
            URI destination,
            Optional<PassthroughAssertion> authnStatementAssertion) {
        super(id, issueInstant, inResponseTo, issuer, destination);
        this.signature = signature;
        this.matchingDatasetAssertion = matchingDatasetAssertion;
        this.authnStatementAssertion = authnStatementAssertion;
        this.status = status;
    }

    public Optional<PassthroughAssertion> getMatchingDatasetAssertion() {
        return matchingDatasetAssertion;
    }

    public Optional<PassthroughAssertion> getAuthnStatementAssertion() {
        return authnStatementAssertion;
    }

    public Optional<Signature> getSignature() {
        return signature;
    }

    public IdpIdaStatus getStatus() {
        return status;
    }

}
