package med.voll.api.dto;

import jakarta.validation.constraints.NotBlank;

public record AddressDTO(
        @NotBlank String streetAddress,
        @NotBlank String addressLine2,
        @NotBlank String city) {
}
