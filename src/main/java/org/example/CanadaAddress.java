package org.example;

public class CanadaAddress extends Address {

    public CanadaAddress(String recipient,
                         String houseNumber,
                         String streetName,
                         String apartmentNumber,
                         String cityName,
                         String stateOrProvinceAbbreviation,
                         String postalCode,
                         String countryName) {
        super(recipient,
                streetName,
                houseNumber,
                apartmentNumber,
                cityName,
                stateOrProvinceAbbreviation,
                postalCode,
                countryName);
    }

    @Override
    public String toString() {
        return String.format("%s \n%s %s %s \n%s %s %s \n%s",
                getRecipient(),
                getHouseNumber(),
                getStreetName(),
                getApartmentNumber(),
                getCityName(),
                getStateOrProvinceAbbreviation(),
                getPostalCode(),
                getCountry());
    }
}
