package entities;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "Endereco")
public class Endereco implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id ;
    private String logradouro ;

}
