package med.voll.api.dto;

import med.voll.api.domain.Specialty;

public record DoctorDTO(String name, Specialty specialty, AddressDTO address) {
}
