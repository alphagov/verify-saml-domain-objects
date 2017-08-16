package uk.gov.ida.saml.core.domain;

/**
 * @deprecated use version in hub-saml instead!
 */
@Deprecated
public enum MatchingServiceIdaStatus implements IdaStatus {
    NoMatchingServiceMatchFromMatchingService,
    RequesterError,
    MatchingServiceMatch,
    UserAccountCreated,
    Healthy
    }
