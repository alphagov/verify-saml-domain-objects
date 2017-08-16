package uk.gov.ida.matchingserviceadapter.saml.transformers.outbound;

import com.google.common.base.Optional;
import org.joda.time.DateTime;
import uk.gov.ida.common.shared.security.IdGenerator;
import uk.gov.ida.saml.core.domain.IdaMatchingServiceResponse;
import uk.gov.ida.saml.core.domain.UnknownUserCreationIdaStatus;
import uk.gov.ida.matchingserviceadapter.domain.MatchingServiceAssertion;

import static com.google.common.base.Optional.fromNullable;

/**
 * Domain Objects should not be shared across projects .
 * The aim is to inline all domain objects shared via this project and to get rid of this library
 *
 * @deprecated please replicate this class where in the project it is used
 */
public class OutboundResponseFromUnknownUserCreationService extends IdaMatchingServiceResponse {

    private static IdGenerator idGenerator = new IdGenerator();

    private final UnknownUserCreationIdaStatus status;
    private final Optional<MatchingServiceAssertion> matchingServiceAssertion;

    public OutboundResponseFromUnknownUserCreationService(
            String responseId,
            String inResponseTo,
            String issuer,
            DateTime issueInstant,
            UnknownUserCreationIdaStatus status,
            Optional<MatchingServiceAssertion> matchingServiceAssertion) {
        super(responseId, inResponseTo, issuer, issueInstant);
        this.status = status;
        this.matchingServiceAssertion = matchingServiceAssertion;
    }

    public static OutboundResponseFromUnknownUserCreationService createFailure(
            String originalRequestId,
            String issuerId) {
        return new OutboundResponseFromUnknownUserCreationService(
                idGenerator.getId(),
                originalRequestId,
                issuerId,
                DateTime.now(),
                UnknownUserCreationIdaStatus.CreateFailure,
                Optional.<MatchingServiceAssertion>absent());
    }

    public static OutboundResponseFromUnknownUserCreationService createNoAttributeFailure(
            String originalRequestId,
            String issuerId) {
        return new OutboundResponseFromUnknownUserCreationService(
                idGenerator.getId(),
                originalRequestId,
                issuerId,
                DateTime.now(),
                UnknownUserCreationIdaStatus.NoAttributeFailure,
                Optional.<MatchingServiceAssertion>absent());
    }

    public static OutboundResponseFromUnknownUserCreationService createSuccess(
            MatchingServiceAssertion assertion,
            String originalRequestId,
            String issuerId) {
        return new OutboundResponseFromUnknownUserCreationService(
                idGenerator.getId(),
                originalRequestId,
                issuerId,
                DateTime.now(),
                UnknownUserCreationIdaStatus.Success,
                fromNullable(assertion)
        );
    }

    public Optional<MatchingServiceAssertion> getMatchingServiceAssertion() {
        return matchingServiceAssertion;
    }

    public UnknownUserCreationIdaStatus getStatus() {
        return status;
    }
}
