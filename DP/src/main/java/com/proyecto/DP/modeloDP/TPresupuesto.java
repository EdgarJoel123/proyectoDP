package com.proyecto.DP.modeloDP;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "PROJECTDP_TIPO_PRESUPUESTO")
public class TPresupuesto implements Serializable {

    /*Atributos de la entidad tipo de presupuesto*/
    @Id
    private int PK_PTIPRE_ID;
    private  String PTIPRE_TIPO_PRESUPUESTO;

    /*@ManyToOne
    @JoinColumn(name = "FK_PTIPRE_ID_PER")
    private Matriz matriz;
     */

    /*Configuracion para trabjar en un entorno de JPA*/
    @OneToMany(mappedBy = "tPresupuesto")
    private List<Matriz> matriz;

    /*Constructor con parametros de la entidad*/
    public TPresupuesto(int PK_PTIPRE_ID, String PTIPRE_TIPO_PRESUPUESTO) {
        this.PK_PTIPRE_ID = PK_PTIPRE_ID;
        this.PTIPRE_TIPO_PRESUPUESTO = PTIPRE_TIPO_PRESUPUESTO;
    }

    /*Constructor vacio de la entidad*/
    public TPresupuesto() {
    }

    /*GET and SET de la entidad*/
    public int getPK_PTIPRE_ID() {
        return PK_PTIPRE_ID;
    }

    public void setPK_PTIPRE_ID(int PK_PTIPRE_ID) {
        this.PK_PTIPRE_ID = PK_PTIPRE_ID;
    }

    public String getPTIPRE_TIPO_PRESUPUESTO() {
        return PTIPRE_TIPO_PRESUPUESTO;
    }

    public void setPTIPRE_TIPO_PRESUPUESTO(String PTIPRE_TIPO_PRESUPUESTO) {
        this.PTIPRE_TIPO_PRESUPUESTO = PTIPRE_TIPO_PRESUPUESTO;
    }
}

