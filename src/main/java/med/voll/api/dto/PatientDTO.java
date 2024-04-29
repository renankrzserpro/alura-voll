package med.voll.api.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record PatientDTO(
        @NotBlank String name,
        @NotNull @Valid AddressDTO address) {
}
