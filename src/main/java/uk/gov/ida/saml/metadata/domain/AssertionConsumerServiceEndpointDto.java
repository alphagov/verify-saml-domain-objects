package uk.gov.ida.saml.metadata.domain;


import java.net.URI;

/**
 * Domain Objects should not be shared across projects .
 * The aim is to inline all domain objects shared via this project and to get rid of this library
 *
 * @deprecated please replicate this class in the project it is used
 */
public class AssertionConsumerServiceEndpointDto extends SamlEndpointDto {

    private boolean isDefault;
    private int index;

    @SuppressWarnings("unused") // needed for JAXB
    private AssertionConsumerServiceEndpointDto() {
    }

    public AssertionConsumerServiceEndpointDto(URI location, boolean isDefault, int index) {
        super(SamlEndpointDto.Binding.POST, location); // Assertion Consumer Services must always be post
        this.isDefault = isDefault;
        this.index = index;
    }

    public boolean getIsDefault() {
        return isDefault;
    }

    public int getIndex() {
        return index;
    }

    public static AssertionConsumerServiceEndpointDto createAssertionConsumerService(URI location, boolean isDefault, int index) {
        return new AssertionConsumerServiceEndpointDto(location, isDefault, index);
    }
}
