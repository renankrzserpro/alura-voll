package med.voll.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import med.voll.api.dto.PatientDTO;

@RestController
@RequestMapping("patients")
public class PatientController {

    @PostMapping
    public String create(@RequestBody PatientDTO p) {
        return "Patient: " + p;
    }

    @GetMapping
    public String read() {
        return "Patients will be returned";
    }

}
