package med.voll.api.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.Specialty;

public record DoctorDTO(
        @NotBlank String name,
        @NotNull Specialty specialty,
        @NotNull @Valid AddressDTO address) {
}
