package entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Curso")
public class Curso implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id ;
    private String nome ;
    private String sigla ;

    @ManyToOne
    @JoinColumn(name = "professor_id")
    private Professor professor ;

    @OneToOne(mappedBy = "Curso")
    private MaterialCurso material ;

    public Curso() {
    }

    public Curso(Long id, String nome, String sigla) {
        this.id = id;
        this.nome = nome;
        this.sigla = sigla;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
}
