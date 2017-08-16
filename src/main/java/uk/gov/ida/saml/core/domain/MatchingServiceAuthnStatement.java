package uk.gov.ida.saml.core.domain;

/**
 * Domain Objects should not be shared across projects .
 * The aim is to inline all domain objects shared via this project and to get rid of this library
 *
 * @deprecated please replicate this class in the project it is used
 */
public final class MatchingServiceAuthnStatement {

    private AuthnContext authnContext;

    private MatchingServiceAuthnStatement() {
    }

    private MatchingServiceAuthnStatement(AuthnContext authnContext) {
        this.authnContext = authnContext;
    }

    public AuthnContext getAuthnContext() {
        return authnContext;
    }

    public static MatchingServiceAuthnStatement createIdaAuthnStatement(
            AuthnContext authnContext) {

        return new MatchingServiceAuthnStatement(authnContext);
    }
}
