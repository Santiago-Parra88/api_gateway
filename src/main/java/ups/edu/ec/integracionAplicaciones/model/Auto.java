package ups.edu.ec.integracionAplicaciones.model;


import jakarta.persistence.*;

@Entity
@Table(name = "Auto")
public class Auto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "auto_id")
    private Integer autoId;

    @Column(name = "auto_marca", nullable = false, length = 150)
    private String autoMarca;

    @Column(name = "auto_modelo", nullable = false, length = 20, unique = true)
    private String autoModelo;


    @Column(name = "auto_anio", nullable = false, length = 100, unique = true)
    private String autoAnio;

    public Integer getAutoId() {
        return autoId;
    }

    public void setAutoId(Integer autoId) {
        this.autoId = autoId;
    }

    public String getAutoMarca() {
        return autoMarca;
    }

    public void setAutoMarca(String autoMarca) {
        this.autoMarca = autoMarca;
    }

    public String getAutoModelo() {
        return autoModelo;
    }

    public void setAutoModelo(String autoModelo) {
        this.autoModelo = autoModelo;
    }

    public String getAutoAnio() {
        return autoAnio;
    }

    public void setAutoAnio(String autoAnio) {
        this.autoAnio = autoAnio;
    }
}
