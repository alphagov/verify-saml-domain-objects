package uk.gov.ida.saml.core.domain;

import java.util.HashMap;
import java.util.Map;

/**
 * Domain Objects should not be shared across projects .
 * The aim is to inline all domain objects shared via this project and to get rid of this library
 *
 * @deprecated please replicate this class in the project it is used
 */
public class Cycle3Dataset {
    private Map<String, String> attributes;

    protected Cycle3Dataset(Map<String, String> attributes) {
        this.attributes = attributes;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    public static Cycle3Dataset createFromData(String attributeKey, String userInputData) {
        HashMap<String, String> attributes = new HashMap<>();
        attributes.put(attributeKey, userInputData);
        return new Cycle3Dataset(attributes);
    }

    public static Cycle3Dataset createFromData(Map<String, String> map) {
        return new Cycle3Dataset(map);
    }
}
