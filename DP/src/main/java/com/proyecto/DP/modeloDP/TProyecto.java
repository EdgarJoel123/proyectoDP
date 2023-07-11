package com.proyecto.DP.modeloDP;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "PROJECTDP_TIPO_PROYECTO")
public class TProyecto implements Serializable {

    /*Atributos de la entidad tipo proyecto*/
    @Id
    private int PK_PTIPRO_ID;
    private String PTIPRO_TIPO_PROYECTO;

    /*@ManyToOne
    @JoinColumn(name = "FK_PTIPRO_ID_PER")
    private Matriz matriz;
     */

    /*Configuracion para trabajar en un entorno de JPA*/
    @OneToMany(mappedBy = "tProyecto")
    private List<Matriz> matriz;

    /*Constructor con parametros de la entidad*/
    public TProyecto(int PK_PTIPRO_ID, String PTIPRO_TIPO_PROYECTO) {
        this.PK_PTIPRO_ID = PK_PTIPRO_ID;
        this.PTIPRO_TIPO_PROYECTO = PTIPRO_TIPO_PROYECTO;
    }

    /*Cosntructor vacio de la entidad*/
    public TProyecto() {
    }

    /*GET and SET de la entidad*/
    public int getPK_PTIPRO_ID() {
        return PK_PTIPRO_ID;
    }

    public void setPK_PTIPRO_ID(int PK_PTIPRO_ID) {
        this.PK_PTIPRO_ID = PK_PTIPRO_ID;
    }

    public String getPTIPRO_TIPO_PROYECTO() {
        return PTIPRO_TIPO_PROYECTO;
    }

    public void setPTIPRO_TIPO_PROYECTO(String PTIPRO_TIPO_PROYECTO) {
        this.PTIPRO_TIPO_PROYECTO = PTIPRO_TIPO_PROYECTO;
    }
}

