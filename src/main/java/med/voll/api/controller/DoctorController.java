package med.voll.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import med.voll.api.domain.Doctor;
import med.voll.api.dto.DoctorDTO;
import med.voll.api.repository.DoctorRepository;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    @Autowired
    private DoctorRepository repository;

    @PostMapping
    public void create(@RequestBody DoctorDTO d) {
        repository.save(new Doctor(d));
    }

    @GetMapping
    public String read() {
        return "Doctors will be returned";
    }

}
