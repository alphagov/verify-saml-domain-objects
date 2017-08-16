package uk.gov.ida.saml.hub;

/**
 * Domain Objects should not be shared across projects .
 * The aim is to inline all domain objects shared via this project and to get rid of this library
 *
 * @deprecated please replicate this class in the project it is used
 */
public interface HubConstants {
    String SP_NAME_QUALIFIER = "https://hub.gov.uk";
    String VERIFY_FEDERATION = "VERIFY-FEDERATION";
}
