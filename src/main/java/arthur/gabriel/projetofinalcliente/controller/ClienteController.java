package arthur.gabriel.projetofinalcliente.controller;

import arthur.gabriel.projetofinalcliente.model.ClienteEntity;
import arthur.gabriel.projetofinalcliente.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public ResponseEntity<List<ClienteEntity>> findAll() {
        return new ResponseEntity<List<ClienteEntity>>(
                (List<ClienteEntity>) this.clienteRepository.findAll(),
                new HttpHeaders(), HttpStatus.OK);

    }

    public ResponseEntity<ClienteEntity> findById(@PathVariable("id") long id)
    {
        if(this.clienteRepository.findById(id).isPresent()){
            return new ResponseEntity<ClienteEntity>(
                    this.clienteRepository.findById(id).get(),
                    new HttpHeaders(),
                    HttpStatus.OK);

        }
        return new ResponseEntity<ClienteEntity>(HttpStatus.NOT_FOUND);
    }

    public ResponseEntity<ClienteEntity> cadastrar (@RequestBody ClienteEntity clienteEntity)
    {
        return new ResponseEntity<ClienteEntity>(
                this.clienteRepository.save(clienteEntity),
                new HttpHeaders(),
                HttpStatus.CREATED
        );
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<ClienteEntity> deletar (@PathVariable("id") long id )
    {
        this.clienteRepository.deleteById(id);
        return new ResponseEntity<ClienteEntity>(new HttpHeaders(), HttpStatus.OK);
    }

}
