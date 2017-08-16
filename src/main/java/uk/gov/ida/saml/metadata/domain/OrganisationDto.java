package uk.gov.ida.saml.metadata.domain;

/**
 * Domain Objects should not be shared across projects .
 * The aim is to inline all domain objects shared via this project and to get rid of this library
 *
 * @deprecated please replicate this class in the project it is used
 */
public class OrganisationDto {
    private String displayName;
    private String name;
    private String url;

    @SuppressWarnings("unused")//Needed by JAXB
    private OrganisationDto() {}

    public OrganisationDto(String displayName, String name, String url) {
        this.displayName = displayName;
        this.name = name;
        this.url = url;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }
}
