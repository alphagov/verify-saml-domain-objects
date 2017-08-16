package uk.gov.ida.saml.core.domain;

import java.io.Serializable;

/**
 * Domain Objects should not be shared across projects .
 * The aim is to inline all domain objects shared via this project and to get rid of this library
 *
 * @deprecated please replicate this class in the project it is used
 */
public class PersistentId implements Serializable {

    private String nameId;

    public PersistentId(String nameId) {
        this.nameId = nameId;
    }

    public String getNameId() {
        return nameId;
    }
}
