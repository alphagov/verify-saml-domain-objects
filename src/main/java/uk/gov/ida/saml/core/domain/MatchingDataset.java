package uk.gov.ida.saml.core.domain;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import org.joda.time.LocalDate;
import uk.gov.ida.saml.core.domain.Address;
import uk.gov.ida.saml.core.domain.Gender;
import uk.gov.ida.saml.core.domain.SimpleMdsValue;

import java.util.ArrayList;
import java.util.List;

/**
 * Domain Objects should not be shared across projects .
 * The aim is to inline all domain objects shared via this project and to get rid of this library
 *
 * @deprecated please replicate this class in the project it is used
 */
public class MatchingDataset {
    
    private List<SimpleMdsValue<String>> firstNames = new ArrayList<>();
    private List<SimpleMdsValue<String>> middleNames = new ArrayList<>();
    private List<SimpleMdsValue<String>> surnames = new ArrayList<>();
    private Optional<SimpleMdsValue<Gender>> gender = Optional.absent();
    private List<SimpleMdsValue<LocalDate>> dateOfBirths = new ArrayList<>();
    private List<Address> currentAddresses = new ArrayList<>();
    private List<Address> previousAddresses = new ArrayList<>();

    public MatchingDataset(
            List<SimpleMdsValue<String>> firstNames,
            List<SimpleMdsValue<String>> middleNames,
            List<SimpleMdsValue<String>> surnames,
            Optional<SimpleMdsValue<Gender>> gender,
            List<SimpleMdsValue<LocalDate>> dateOfBirths,
            List<Address> currentAddresses,
            List<Address> previousAddresses) {

        this.firstNames = firstNames;
        this.middleNames = middleNames;
        this.surnames = surnames;
        this.gender = gender;
        this.dateOfBirths = dateOfBirths;
        this.currentAddresses = currentAddresses;
        this.previousAddresses = previousAddresses;
    }

    public List<SimpleMdsValue<String>> getFirstNames() {
        return firstNames;
    }

    public List<SimpleMdsValue<String>> getMiddleNames() {
        return middleNames;
    }

    public List<SimpleMdsValue<String>> getSurnames() {
        return surnames;
    }

    public Optional<SimpleMdsValue<Gender>> getGender() {
        return gender;
    }

    public List<SimpleMdsValue<LocalDate>> getDateOfBirths() {
        return dateOfBirths;
    }

    public List<Address> getCurrentAddresses() {
        return currentAddresses;
    }

    public List<Address> getPreviousAddresses() {
        return previousAddresses;
    }

    public List<Address> getAddresses() {
        return ImmutableList.copyOf(Iterables.concat(currentAddresses, previousAddresses));
    }
}
