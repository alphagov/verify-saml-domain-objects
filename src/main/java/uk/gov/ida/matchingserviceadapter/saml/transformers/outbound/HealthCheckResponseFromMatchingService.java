package uk.gov.ida.matchingserviceadapter.saml.transformers.outbound;

import org.joda.time.DateTime;
import uk.gov.ida.saml.core.domain.IdaMatchingServiceResponse;

import java.util.UUID;

import static java.text.MessageFormat.format;

/**
 * Domain Objects should not be shared across projects .
 * The aim is to inline all domain objects shared via this project and to get rid of this library
 *
 * @deprecated please replicate this class where in the project it is used
 */
public class HealthCheckResponseFromMatchingService extends IdaMatchingServiceResponse {
    public HealthCheckResponseFromMatchingService(String entityId, String healthCheckRequestId, String msaVersion) {
        super(format("healthcheck-response-id-{0}-version-{1}", UUID.randomUUID(), msaVersion), healthCheckRequestId, entityId, DateTime.now());
    }
}

