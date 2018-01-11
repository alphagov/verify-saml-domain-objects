package uk.gov.ida.saml.core.test.builders;


import uk.gov.ida.saml.core.domain.IpAddress;

/**
 * Domain Objects should not be shared across projects .
 * The aim is to inline all domain objects shared via this project and to get rid of this library
 *
 * @deprecated please replicate this class in the project it is used
 */
public class IpAddressBuilder {

    private String ipAddress = "1.2.3.4";

    public static IpAddressBuilder anIpAddress() {
        return new IpAddressBuilder();
    }

    public IpAddress build() {
        return new IpAddress(ipAddress);
    }

    public IpAddressBuilder withValue(String value) {
        this.ipAddress = value;
        return this;
    }
}
