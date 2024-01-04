package br.com.consultorio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @GetMapping
    public String buscarTodosPacientes() {
        return " testando commit Git com IntelliJ!!";
    }
}
