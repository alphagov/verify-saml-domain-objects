package uk.gov.ida.saml.core;

import org.opensaml.xmlsec.signature.support.SignatureConstants;

/**
 * Domain Objects should not be shared across projects .
 * The aim is to inline all domain objects shared via this project and to get rid of this library
 *
 * @deprecated please replicate this class in the project it is used
 */
public enum SignatureAlgorithm {
    DSA_SHA1 {
        @Override
        public String toString() {
            return SignatureConstants.ALGO_ID_SIGNATURE_DSA_SHA1;
        }
    },
    RSA_SHA1 {
        @Override
        public String toString() {
            return SignatureConstants.ALGO_ID_SIGNATURE_RSA_SHA1;
        }
    },
    RSA_SHA256 {
        @Override
        public String toString() {
            return SignatureConstants.ALGO_ID_SIGNATURE_RSA_SHA256;
        }
    },
    RSA_SHA512 {
        @Override
        public String toString() {
            return SignatureConstants.ALGO_ID_SIGNATURE_RSA_SHA512;
        }
    };
}
