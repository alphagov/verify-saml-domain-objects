package uk.gov.ida.saml.core.test.builders.metadata;

import uk.gov.ida.saml.metadata.domain.AssertionConsumerServiceEndpointDto;

import java.net.URI;

/**
 * Domain Objects should not be shared across projects .
 * The aim is to inline all domain objects shared via this project and to get rid of this library
 *
 * @deprecated please replicate this class in the project it is used
 */
public class AssertionConsumerServiceEndpointDtoBuilder {

    private URI location = URI.create("https://hub.ida.gov.uk/blah");
    private boolean isDefault = false;
    private int index = 0;

    public static AssertionConsumerServiceEndpointDtoBuilder anAssertionConsumerServiceEndpointDto() {
        return new AssertionConsumerServiceEndpointDtoBuilder();
    }

    public AssertionConsumerServiceEndpointDto build() {
        return new AssertionConsumerServiceEndpointDto(
                location,
                isDefault,
                index);
    }

    public AssertionConsumerServiceEndpointDtoBuilder withLocation(URI location) {
        this.location = location;
        return this;
    }

    public AssertionConsumerServiceEndpointDtoBuilder isDefault() {
        isDefault = true;
        return this;
    }

    public AssertionConsumerServiceEndpointDtoBuilder withIndex(int index) {
        this.index = index;
        return this;
    }
}
