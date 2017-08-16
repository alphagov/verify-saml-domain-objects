package uk.gov.ida.saml.core.domain;

/**
 * Domain Objects should not be shared across projects .
 * The aim is to inline all domain objects shared via this project and to get rid of this library
 *
 * @deprecated please replicate this class in the project it is used
 */
public enum Gender {
    FEMALE("Female"),
    MALE("Male"),
    NOT_SPECIFIED("Not Specified");

    private String value;

    Gender(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Gender fromString(String string) {
        for (Gender gender : values()) {
            if (gender.getValue().equalsIgnoreCase(string)) {
                return gender;
            }
        }
        throw new IllegalArgumentException("Not a legal value for gender: " + string);
    }
}
