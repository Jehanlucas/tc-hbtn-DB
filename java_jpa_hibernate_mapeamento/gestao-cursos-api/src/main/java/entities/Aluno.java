package entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Aluno")
public class Aluno implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id ;
    private String nomeCompleto ;
    private String matricula ;
    private Date nascimento ;
    private String email;

    @OneToMany
    @JoinColumn(name="endereco_id")
    private List<Endereco>endeco ;

    @OneToMany
    @JoinColumn(name="telefone_id")
    private List<Telefone>telefones ;




    public Aluno() {
    }

    public Aluno(Long id, String nomeCompleto, String matricula, Date nascimento, String email) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.matricula = matricula;
        this.nascimento = nascimento;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Date getDataNascimento() {
        return nascimento;
    }

    public void setDataNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
