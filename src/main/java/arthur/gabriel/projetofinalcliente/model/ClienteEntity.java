package arthur.gabriel.projetofinalcliente.model;


import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name= "cliente")
public class ClienteEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "email")
    private String email;



    @Column(name = "telefone")
    private String telefone;

    @Column(name = "cpf")
    private String cpf;
}
