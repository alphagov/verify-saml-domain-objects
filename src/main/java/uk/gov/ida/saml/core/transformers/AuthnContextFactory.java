package uk.gov.ida.saml.core.transformers;

import uk.gov.ida.saml.core.domain.AuthnContext;
import uk.gov.ida.saml.core.extensions.IdaAuthnContext;

import static java.text.MessageFormat.format;

public class AuthnContextFactory {

    public AuthnContext authnContextForLevelOfAssurance(String levelOfAssurance) {
        switch (levelOfAssurance) {
            case IdaAuthnContext.LEVEL_1_AUTHN_CTX:
                return AuthnContext.LEVEL_1;
            case IdaAuthnContext.LEVEL_2_AUTHN_CTX:
                return AuthnContext.LEVEL_2;
            case IdaAuthnContext.LEVEL_3_AUTHN_CTX:
                return AuthnContext.LEVEL_3;
            case IdaAuthnContext.LEVEL_4_AUTHN_CTX:
                return AuthnContext.LEVEL_4;
            case IdaAuthnContext.LEVEL_X_AUTHN_CTX:
                return AuthnContext.LEVEL_X;
            default:
                throw new IllegalStateException(format("SAML AuthnContext 'AuthnContextClassRef' element value ''{0}'' is not a recognised value.", levelOfAssurance));
        }
    }
}
