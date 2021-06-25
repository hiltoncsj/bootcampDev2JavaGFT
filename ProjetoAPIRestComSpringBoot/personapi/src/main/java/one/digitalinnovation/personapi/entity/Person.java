package one.digitalinnovation.personapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity                    //declara que é uma entidade
@Data                      //insere getter e setter
@Builder                   //facilitar a construção de objetos
@AllArgsConstructor        //inserção dos construtores
@NoArgsConstructor         //inserção dos construtores
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)   //faz a inserção do id no BD
    private Long id;

    @Column(nullable = false)      // não pode ser nulo
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false, unique = true)    // não pode ser nulo e o valor é único
    private String cpf;

    private LocalDate birthDate;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private List<Phone> phones;

}
