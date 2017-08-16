package uk.gov.ida.matchingserviceadapter.saml.transformers.outbound;

import com.google.common.base.Optional;
import org.joda.time.DateTime;
import uk.gov.ida.common.shared.security.IdGenerator;
import uk.gov.ida.saml.core.domain.IdaMatchingServiceResponse;
import uk.gov.ida.saml.core.domain.MatchingServiceIdaStatus;
import uk.gov.ida.matchingserviceadapter.domain.MatchingServiceAssertion;

import static com.google.common.base.Optional.fromNullable;

/**
 * Domain Objects should not be shared across projects .
 * The aim is to inline all domain objects shared via this project and to get rid of this library
 *
 * @deprecated please replicate this class where in the project it is used
 */
public class OutboundResponseFromMatchingService extends IdaMatchingServiceResponse {
    private static IdGenerator idGenerator = new IdGenerator();

    private Optional<MatchingServiceAssertion> matchingServiceAssertion;
    private MatchingServiceIdaStatus status;

    public OutboundResponseFromMatchingService(
            String responseId,
            String inResponseTo,
            String issuer,
            DateTime issueInstant,
            MatchingServiceIdaStatus status,
            Optional<MatchingServiceAssertion> matchingServiceAssertion) {

        super(responseId, inResponseTo, issuer, issueInstant);

        this.matchingServiceAssertion = matchingServiceAssertion;
        this.status = status;
    }

    public Optional<MatchingServiceAssertion> getMatchingServiceAssertion() {
        return matchingServiceAssertion;
    }

    public static OutboundResponseFromMatchingService createMatchFromMatchingService(
            MatchingServiceAssertion assertion,
            String originalRequestId,
            String issuerId) {
        return new OutboundResponseFromMatchingService(
                idGenerator.getId(),
                originalRequestId,
                issuerId,
                DateTime.now(),
                MatchingServiceIdaStatus.MatchingServiceMatch,
                fromNullable(assertion)
        );
    }

    public static OutboundResponseFromMatchingService createNoMatchFromMatchingService(
            String originalRequestId,
            String issuerId) {
        return new OutboundResponseFromMatchingService(
                idGenerator.getId(),
                originalRequestId,
                issuerId,
                DateTime.now(),
                MatchingServiceIdaStatus.NoMatchingServiceMatchFromMatchingService,
                Optional.<MatchingServiceAssertion>absent()
        );
    }

    public MatchingServiceIdaStatus getStatus() {
        return status;
    }
}
