package com.proyecto.DP.modeloDP;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "PROJECTDP_PROCEDIMIENTO_SERCOP")
public class Procedimiento_Sercop implements Serializable {

    /*Atributos de la entidad de procedimientos de la sercop*/
    @Id
    private int PK_PPRSE_ID;
    private String PPRSE_PROCEDIMIENTO_SERCOP;


    /*@ManyToOne
    @JoinColumn(name = "FK_PPRSE_ID_PER")
    private Matriz matriz;
     */

    /*Configuracion para trabajar en un entorno de JPA*/
    @OneToMany(mappedBy = "procedimiento_sercop")
    private List<Matriz> matriz;

    /*Constructor con parametros de la entidad*/
    public Procedimiento_Sercop(int PK_PPRSE_ID, String PPRSE_PROCEDIMIENTO_SERCOP) {
        this.PK_PPRSE_ID = PK_PPRSE_ID;
        this.PPRSE_PROCEDIMIENTO_SERCOP = PPRSE_PROCEDIMIENTO_SERCOP;
    }
    /*Constructor vacio de la entidad*/
    public Procedimiento_Sercop() {
    }

    /*GET and SET de la entidad*/
    public int getPK_PPRSE_ID() {
        return PK_PPRSE_ID;
    }

    public void setPK_PPRSE_ID(int PK_PPRSE_ID) {
        this.PK_PPRSE_ID = PK_PPRSE_ID;
    }

    public String getPPRSE_PROCEDIMIENTO_SERCOP() {
        return PPRSE_PROCEDIMIENTO_SERCOP;
    }

    public void setPPRSE_PROCEDIMIENTO_SERCOP(String PPRSE_PROCEDIMIENTO_SERCOP) {
        this.PPRSE_PROCEDIMIENTO_SERCOP = PPRSE_PROCEDIMIENTO_SERCOP;
    }
}
