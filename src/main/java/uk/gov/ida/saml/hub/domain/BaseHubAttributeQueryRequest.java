package uk.gov.ida.saml.hub.domain;

import org.joda.time.DateTime;
import uk.gov.ida.saml.core.domain.IdaSamlMessage;
import uk.gov.ida.saml.core.domain.PersistentId;

import java.net.URI;

/**
 * Domain Objects should not be shared across projects .
 * The aim is to inline all domain objects shared via this project and to get rid of this library
 *
 * @deprecated please replicate this class in the project it is used
 */
public class BaseHubAttributeQueryRequest extends IdaSamlMessage {
    protected PersistentId persistentId;
    protected URI assertionConsumerServiceUrl;
    protected String authnRequestIssuerEntityId;

    public BaseHubAttributeQueryRequest(String id,
                                        String issuer,
                                        DateTime issueInstant,
                                        URI destination,
                                        PersistentId persistentId,
                                        URI assertionConsumerServiceUrl,
                                        String authnRequestIssuerEntityId) {
        super(id, issuer, issueInstant, destination);
        this.persistentId = persistentId;
        this.assertionConsumerServiceUrl = assertionConsumerServiceUrl;
        this.authnRequestIssuerEntityId = authnRequestIssuerEntityId;
    }

    public PersistentId getPersistentId() {
        return persistentId;
    }

    public URI getAssertionConsumerServiceUrl() {
        return assertionConsumerServiceUrl;
    }

    public String getAuthnRequestIssuerEntityId() {
        return authnRequestIssuerEntityId;
    }

}
