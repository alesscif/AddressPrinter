package org.example;

public class MexicoAddress extends Address {
    String villageName;

    public MexicoAddress(String recipient,
                         String houseNumber,
                         String streetName,
                         String apartmentNumber,
                         String villageName,
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

        this.villageName = villageName;
    }

    public String getVillageName() {
        return villageName;
    }

    @Override
    public String toString() {
     return String.format("%s \n%s %s -- %s \n%s \n%s %s, %s \n%s",
             getRecipient(),
             getStreetName(),
             getHouseNumber(),
             getApartmentNumber(),
             getVillageName(),
             getPostalCode(),
             getCityName(),
             getStateOrProvinceAbbreviation(),
             getCountry());
    }
}
