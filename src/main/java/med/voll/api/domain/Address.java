package med.voll.api.domain;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {

    private String streetAddress;
    private String addressLine2;
    private String city;

}
