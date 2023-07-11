package com.proyecto.DP.modeloDP;
import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "PROJECTDP_VALOR_DEVENGADO")
public class Valor_Devengado implements Serializable {

    /*Atributos de la entidad valor devengado*/
    @Id
    private int PK_PVADE_ID;
    private float PVADE_VALOR_DEVENGADO;
    private java.sql.Date PVADE_FECHA_VD;
    private String PVADE_OBSERVACIONES_VD;
    private int FK_PPRO_CODIGO_UNICO;

   /* @ManyToOne
    @JoinColumn(name = "FK_PVADE_ID_PER")
    private Matriz matriz;
    */

    /*Configuracion para trabjar en un entorno JPA*/
   @OneToMany(mappedBy = "valor_devengado")
   private List<Matriz> matriz;

   /*Constructor con parametros de la entidad*/
    public Valor_Devengado(float PVADE_VALOR_DEVENGADO, Date PVADE_FECHA_VD, String PVADE_OBSERVACIONES_VD, int FK_PPRO_CODIGO_UNICO) {
        this.PVADE_VALOR_DEVENGADO = PVADE_VALOR_DEVENGADO;
        this.PVADE_FECHA_VD = PVADE_FECHA_VD;
        this.PVADE_OBSERVACIONES_VD = PVADE_OBSERVACIONES_VD;
        this.FK_PPRO_CODIGO_UNICO = FK_PPRO_CODIGO_UNICO;
    }

    /*Constructor vacio de la entidad*/
    public Valor_Devengado() {
    }

    /*GET and SET de la entidad*/
    public float getPVADE_VALOR_DEVENGADO() {
        return PVADE_VALOR_DEVENGADO;
    }

    public void setPVADE_VALOR_DEVENGADO(float PVADE_VALOR_DEVENGADO) {
        this.PVADE_VALOR_DEVENGADO = PVADE_VALOR_DEVENGADO;
    }

    public Date getPVADE_FECHA_VD() {
        return PVADE_FECHA_VD;
    }

    public void setPVADE_FECHA_VD(Date PVADE_FECHA_VD) {
        this.PVADE_FECHA_VD = PVADE_FECHA_VD;
    }

    public String getPVADE_OBSERVACIONES_VD() {
        return PVADE_OBSERVACIONES_VD;
    }

    public void setPVADE_OBSERVACIONES_VD(String PVADE_OBSERVACIONES_VD) {
        this.PVADE_OBSERVACIONES_VD = PVADE_OBSERVACIONES_VD;
    }

    public int getFK_PPRO_CODIGO_UNICO() {
        return FK_PPRO_CODIGO_UNICO;
    }

    public void setFK_PPRO_CODIGO_UNICO(int FK_PPRO_CODIGO_UNICO) {
        this.FK_PPRO_CODIGO_UNICO = FK_PPRO_CODIGO_UNICO;
    }
}
