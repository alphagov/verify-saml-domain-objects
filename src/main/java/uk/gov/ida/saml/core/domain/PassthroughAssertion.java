package uk.gov.ida.saml.core.domain;

import com.google.common.base.Optional;

import java.io.Serializable;

import static com.google.common.base.Optional.absent;

/**
 * Domain Objects should not be shared across projects .
 * The aim is to inline all domain objects shared via this project and to get rid of this library
 *
 * @deprecated please replicate this class in the project it is used
 */
public class PassthroughAssertion implements Serializable {

    private PersistentId persistentId;
    // this is optional because this is used for both AuthnStatement and MDS Assertions
    private Optional<AuthnContext> authnContext = absent();
    private String underlyingAssertionBlob;
    private Optional<FraudDetectedDetails> fraudDetectedDetails = absent();
    private Optional<String> principalIpAddressAsSeenByIdp;

    public PassthroughAssertion(
            PersistentId persistentId,
            Optional<AuthnContext> levelOfAssurance,
            String underlyingAssertionBlob,
            Optional<FraudDetectedDetails> fraudDetectedDetails,
            Optional<String> principalIpAddressAsSeenByIdp) {

        this.persistentId = persistentId;
        this.authnContext = levelOfAssurance;
        this.underlyingAssertionBlob = underlyingAssertionBlob;
        this.fraudDetectedDetails = fraudDetectedDetails;
        this.principalIpAddressAsSeenByIdp = principalIpAddressAsSeenByIdp;
    }

    public String getUnderlyingAssertionBlob() {
        return underlyingAssertionBlob;
    }

    public Optional<AuthnContext> getAuthnContext() {
        return authnContext;
    }

    public PersistentId getPersistentId() {
        return persistentId;
    }

    public boolean isFraudulent() {
        return authnContext.isPresent() && authnContext.get().equals(AuthnContext.LEVEL_X);
    }

    public Optional<FraudDetectedDetails> getFraudDetectedDetails() {
        return fraudDetectedDetails;
    }

    public Optional<String> getPrincipalIpAddressAsSeenByIdp() {
        return principalIpAddressAsSeenByIdp;
    }
}
