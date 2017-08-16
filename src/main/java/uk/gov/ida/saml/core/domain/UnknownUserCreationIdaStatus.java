package uk.gov.ida.saml.core.domain;

/**
 * Domain Objects should not be shared across projects .
 * The aim is to inline all domain objects shared via this project and to get rid of this library
 *
 * @deprecated please replicate this class in the project it is used
 */
public enum UnknownUserCreationIdaStatus implements IdaStatus {
    Success,
    CreateFailure,
    NoAttributeFailure,
}
