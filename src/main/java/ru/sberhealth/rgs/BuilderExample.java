package ru.sberhealth.rgs;

public class BuilderExample {

    private Integer id;
    private String name;
    private String lastName;
    private String dateOfBirth;
    private String occupation;
    private String countryOfBirth;
    private Integer accountBalance;
    private String phoneNumber;
    private String homeTown;
    private String zipCode;
    private Integer timeZone;

    public BuilderExample() {}

    // Builder methods

    public BuilderExample withId(Integer id) {
        this.id = id;
        return this;
    }

    public BuilderExample withName(String name) {
        this.name = name;
        return this;
    }

    public BuilderExample withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public BuilderExample withDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public BuilderExample withOccupation(String occupation) {
        this.occupation = occupation;
        return this;
    }

    public BuilderExample withCountryOfBirth(String countryOfBirth) {
        this.countryOfBirth = countryOfBirth;
        return this;
    }

    public BuilderExample withAccountBalance(Integer accountBalance) {
        this.accountBalance = accountBalance;
        return this;
    }

    public BuilderExample withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public BuilderExample withHomeTown(String homeTown) {
        this.homeTown = homeTown;
        return this;
    }

    public BuilderExample withZipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    public BuilderExample withTimeZone(Integer timeZone) {
        this.timeZone = timeZone;
        return this;
    }


    // Getters


    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getCountryOfBirth() {
        return countryOfBirth;
    }

    public Integer getAccountBalance() {
        return accountBalance;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public String getZipCode() {
        return zipCode;
    }

    public Integer getTimeZone() {
        return timeZone;
    }
}
