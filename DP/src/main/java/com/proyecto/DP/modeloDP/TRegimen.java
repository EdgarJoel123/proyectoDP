package com.proyecto.DP.modeloDP;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "PROJECTDP_TIPO_REGIMEN")

public class TRegimen implements Serializable {

    /*Atributos de la entidad tipo regimen*/
    @Id
    private int PK_PTIRE_ID;
    private String PTIRE_TIPO_REGIMEN;

    /*@ManyToOne
    @JoinColumn(name = "FK_PTIRE_ID_PER")
    private Matriz matriz;
     */

    /*Configuracion para trabjar en un entorno de JPA*/
    @OneToMany(mappedBy = "tRegimen")
    private List<Matriz> matriz;

    /*Constructor con parametros de la entidad*/
    public TRegimen(int PK_PTIRE_ID, String PTIRE_TIPO_REGIMEN) {
        this.PK_PTIRE_ID = PK_PTIRE_ID;
        this.PTIRE_TIPO_REGIMEN = PTIRE_TIPO_REGIMEN;
    }

    /*Constructor vacio de la entidad*/
    public TRegimen() {
    }

    /*GET and SET de la entidad*/
    public int getPK_PTIRE_ID() {
        return PK_PTIRE_ID;
    }

    public void setPK_PTIRE_ID(int PK_PTIRE_ID) {
        this.PK_PTIRE_ID = PK_PTIRE_ID;
    }

    public String getPTIRE_TIPO_REGIMEN() {
        return PTIRE_TIPO_REGIMEN;
    }

    public void setPTIRE_TIPO_REGIMEN(String PTIRE_TIPO_REGIMEN) {
        this.PTIRE_TIPO_REGIMEN = PTIRE_TIPO_REGIMEN;
    }
}
