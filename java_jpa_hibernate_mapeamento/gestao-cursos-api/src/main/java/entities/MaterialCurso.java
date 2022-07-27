package entities;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "materialCurso")
public class MaterialCurso implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id ;
    private String url ;

    @OneToOne(mappedBy = "materialCurso")
    private Curso curso ;

    public MaterialCurso() {
    }

    public MaterialCurso(Long id, String url) {
        this.id = id;
        this.url = url;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
