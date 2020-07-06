package arthur.gabriel.projetofinalcliente.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiHello {
    @GetMapping("/")
    public String index()
    {
        return "API Arthur,Gabriel";
    }
}
