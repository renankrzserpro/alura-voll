package med.voll.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import med.voll.api.domain.Doctor;

@RestController
@RequestMapping("/doctors")
public class DoctorsController {

    @GetMapping
    public String getDoctors() {
        return "Doctors will be returned";
    }

    @PostMapping
    public String saveDoctor(@RequestBody Doctor d) {
        return "Doctor: " + d;
    }

}
