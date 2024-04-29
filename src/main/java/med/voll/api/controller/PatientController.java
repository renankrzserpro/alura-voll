package med.voll.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import med.voll.api.domain.Patient;
import med.voll.api.dto.PatientDTO;
import med.voll.api.repository.PatientRepository;

@RestController
@RequestMapping("patients")
public class PatientController {

    @Autowired
    private PatientRepository repository;

    @PostMapping
    @Transactional
    public void create(@RequestBody @Valid PatientDTO p) {
        repository.save(new Patient(p));
    }

    @GetMapping
    public String read() {
        return "Patients will be returned";
    }

}
