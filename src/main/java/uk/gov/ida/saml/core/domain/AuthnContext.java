package uk.gov.ida.saml.core.domain;

import uk.gov.ida.saml.core.extensions.IdaAuthnContext;

/**
 * Domain Objects should not be shared across projects .
 * The aim is to inline all domain objects shared via this project and to get rid of this library
 *
 * @deprecated please replicate this class in the project it is used
 */
public enum AuthnContext {
    LEVEL_X(IdaAuthnContext.LEVEL_X_AUTHN_CTX),
    LEVEL_1(IdaAuthnContext.LEVEL_1_AUTHN_CTX),
    LEVEL_2(IdaAuthnContext.LEVEL_2_AUTHN_CTX),
    LEVEL_3(IdaAuthnContext.LEVEL_3_AUTHN_CTX),
    LEVEL_4(IdaAuthnContext.LEVEL_4_AUTHN_CTX);

    private String uri;

    AuthnContext(String uri) {
        this.uri = uri;
    }

    public String getUri() {
        return uri;
    }
}
