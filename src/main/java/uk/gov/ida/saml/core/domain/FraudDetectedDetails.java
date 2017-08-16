package uk.gov.ida.saml.core.domain;

/**
 * Domain Objects should not be shared across projects .
 * The aim is to inline all domain objects shared via this project and to get rid of this library
 *
 * @deprecated please replicate this class in the project it is used
 */
public class FraudDetectedDetails {
    private String idpFraudEventId;
    private String fraudIndicator;

    public FraudDetectedDetails(String idpFraudEventId, String fraudIndicator) {
        this.idpFraudEventId = idpFraudEventId;
        this.fraudIndicator = fraudIndicator;
    }

    public String getIdpFraudEventId() {
        return idpFraudEventId;
    }

    public String getFraudIndicator() {
        return fraudIndicator;
    }
}
