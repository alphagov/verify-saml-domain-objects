package uk.gov.ida.saml.core.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.joda.time.DateTime;

import java.io.Serializable;

/**
 * Domain Objects should not be shared across projects .
 * The aim is to inline all domain objects shared via this project and to get rid of this library
 *
 * @deprecated please replicate this class in the project it is used
 */
public class SimpleMdsValue<T> implements Serializable {

    private T value;
    private DateTime from;
    private DateTime to;
    private boolean verified;

    @JsonCreator
    public SimpleMdsValue(@JsonProperty("value") T value, @JsonProperty("from") DateTime from, @JsonProperty("to") DateTime to, @JsonProperty("verified") boolean verified) {
        this.value = value;
        this.from = from;
        this.to = to;
        this.verified = verified;
    }

    public T getValue() {
        return value;
    }

    public DateTime getFrom() {
        return from;
    }

    public DateTime getTo() {
        return to;
    }

    public boolean isVerified() {
        return verified;
    }
}
