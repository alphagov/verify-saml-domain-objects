package uk.gov.ida.saml.core.test.builders;


import uk.gov.ida.saml.metadata.domain.OrganisationDto;

/**
 * Domain Objects should not be shared across projects .
 * The aim is to inline all domain objects shared via this project and to get rid of this library
 *
 * @deprecated please replicate this class in the project it is used
 */
public class OrganisationDtoBuilder {

    private String organisationDisplayName = "Display Name";
    private String organisationName = "MegaCorp";

    public static OrganisationDtoBuilder anOrganisationDto() {
        return new OrganisationDtoBuilder();
    }

    public OrganisationDto build() {
        return new OrganisationDto(
                organisationDisplayName,
                organisationName,
                "https://hub.ida.gov.uk");
    }

    public OrganisationDtoBuilder withDisplayName(String organisationDisplayName) {
        this.organisationDisplayName = organisationDisplayName;
        return this;
    }

    public OrganisationDtoBuilder withName(String organisationName) {
        this.organisationName = organisationName;
        return this;
    }
}
