package org.example;

public class Address {
    private String recipient;
    private String streetName;
    private String apartmentNumber;
    private String cityName;
    private String country;
    private String stateOrProvinceAbbreviation;
    private String houseNumber;
    private String postalCode;

    public Address(String recipient,
                   String streetName,
                   String houseNumber,
                   String apartmentNumber,
                   String cityName,
                   String stateOrProvinceAbbreviation,
                   String postalCode,
                   String country) {
        this.recipient = recipient;
        this.streetName = streetName;
        this.apartmentNumber = apartmentNumber;
        this.cityName = cityName;
        this.country = country;
        this.stateOrProvinceAbbreviation = stateOrProvinceAbbreviation;
        this.houseNumber = houseNumber;
        this.postalCode = postalCode;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public String getCityName() {
        return cityName;
    }

    public String getCountry() {
        return country;
    }

    public String getStateOrProvinceAbbreviation() {
        return stateOrProvinceAbbreviation;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }
}
