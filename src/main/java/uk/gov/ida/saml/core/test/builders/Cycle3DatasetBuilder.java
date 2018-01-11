package uk.gov.ida.saml.core.test.builders;

import uk.gov.ida.saml.core.domain.Cycle3Dataset;

import java.util.HashMap;
import java.util.Map;

/**
 * Domain Objects should not be shared across projects .
 * The aim is to inline all domain objects shared via this project and to get rid of this library
 *
 * @deprecated please replicate this class in the project it is used
 */
public class Cycle3DatasetBuilder {

    private Map<String,String> attributes = new HashMap<>();

    public static Cycle3DatasetBuilder aCycle3Dataset() {
        return new Cycle3DatasetBuilder();
    }

    public Cycle3Dataset build() {
        return Cycle3Dataset.createFromData(attributes);
    }

    public Cycle3DatasetBuilder addCycle3Data(String name, String value) {
        attributes.put(name, value);
        return this;
    }
}
