package com.proyecto.DP.modeloDP;
import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "PROJECTDP_PORCENTAJE_AVANCE_FI")
public class Porcentaje implements Serializable {

    /*Atributos de la entidad de porcetaje de avance fisico*/
    @Id
    private int PK_PPOAVFIDE_ID;
    private float PPOAVFIDE_PORCENTAJE_AVANCE_FI;
    private java.sql.Date PPOAVFIDE_FECHA_PA;
    private String PPOAVFIDE_OBSERVACIONES_PA;
    private int FK_PPRO_CODIGO_UNICO;

    /*@ManyToMany
    @JoinColumn(name = "FK_PPOAVFIDE_ID_PER")
    private Matriz matriz;
     */

    /*@ManyToMany
    @JoinTable(name = "PROJECTDP_PORCENTAJE_AVANCE_FI" ,
            joinColumns = @JoinColumn(name = "PK_PPOAVFIDE_ID"),
            inverseJoinColumns = @JoinColumn(name = "FK_PK_PPOAVFIDE_ID_PER"))
    private List<Matriz> matrizList;
     */

    /*Configuracion para trabajar en un entorno de JPA*/
    @OneToMany(mappedBy = "porcentaje")
    private List<Matriz> matriz;

    /*Constructor con parametros de la entidad*/
    public Porcentaje(float PPOAVFIDE_PORCENTAJE_AVANCE_FI, Date PPOAVFIDE_FECHA_PA, String PPOAVFIDE_OBSERVACIONES_PA, int FK_PPRO_CODIGO_UNICO) {
        this.PPOAVFIDE_PORCENTAJE_AVANCE_FI = PPOAVFIDE_PORCENTAJE_AVANCE_FI;
        this.PPOAVFIDE_FECHA_PA = PPOAVFIDE_FECHA_PA;
        this.PPOAVFIDE_OBSERVACIONES_PA = PPOAVFIDE_OBSERVACIONES_PA;
        this.FK_PPRO_CODIGO_UNICO = FK_PPRO_CODIGO_UNICO;
    }

    /*Constructor vacio de la entidad*/
    public Porcentaje() {
    }

    /*GET and SET de la entidad*/
    public float getPPOAVFIDE_PORCENTAJE_AVANCE_FI() {
        return PPOAVFIDE_PORCENTAJE_AVANCE_FI;
    }

    public void setPPOAVFIDE_PORCENTAJE_AVANCE_FI(float PPOAVFIDE_PORCENTAJE_AVANCE_FI) {
        this.PPOAVFIDE_PORCENTAJE_AVANCE_FI = PPOAVFIDE_PORCENTAJE_AVANCE_FI;
    }

    public Date getPPOAVFIDE_FECHA_PA() {
        return PPOAVFIDE_FECHA_PA;
    }

    public void setPPOAVFIDE_FECHA_PA(Date PPOAVFIDE_FECHA_PA) {
        this.PPOAVFIDE_FECHA_PA = PPOAVFIDE_FECHA_PA;
    }

    public String getPPOAVFIDE_OBSERVACIONES_PA() {
        return PPOAVFIDE_OBSERVACIONES_PA;
    }

    public void setPPOAVFIDE_OBSERVACIONES_PA(String PPOAVFIDE_OBSERVACIONES_PA) {
        this.PPOAVFIDE_OBSERVACIONES_PA = PPOAVFIDE_OBSERVACIONES_PA;
    }

    public int getFK_PPRO_CODIGO_UNICO() {
        return FK_PPRO_CODIGO_UNICO;
    }

    public void setFK_PPRO_CODIGO_UNICO(int FK_PPRO_CODIGO_UNICO) {
        this.FK_PPRO_CODIGO_UNICO = FK_PPRO_CODIGO_UNICO;
    }
}

