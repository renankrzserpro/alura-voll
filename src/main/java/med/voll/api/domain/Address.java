package med.voll.api.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.dto.AddressDTO;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    private String streetAddress;
    @Column(name = "address_line_2")
    private String addressLine2;
    private String city;

    public Address(AddressDTO dto) {
        this.streetAddress = dto.streetAddress();
        this.addressLine2 = dto.addressLine2();
        this.city = dto.city();
    }

}
