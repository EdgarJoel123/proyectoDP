package com.proyecto.DP.modeloDP;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "PROJECTDP_TIPO_COMPRA")
public class TCompra implements Serializable {

    /*Atributos de la entidad TIPO de compra */
    @Id
    private int PK_PTICO_ID;
    private String PTICO_TIPO_COMPRA;

    /*@ManyToOne
    @JoinColumn(name = "FK_PTICO_ID_PER")
    private Matriz matriz;
     */

    /*Configuracion para trabajar en un entorno JPA */
    @OneToMany(mappedBy = "tCompra")
    private List<Matriz> matriz;

    /*Constructor con parametros de la entidad*/
    public TCompra(int PK_PTICO_ID, String PTICO_TIPO_COMPRA) {
        this.PK_PTICO_ID = PK_PTICO_ID;
        this.PTICO_TIPO_COMPRA = PTICO_TIPO_COMPRA;
    }

    /*Constructor vacio de la entidad*/
    public TCompra() {
    }

    /*GET and SET de la entidad*/
    public int getPK_PTICO_ID() {
        return PK_PTICO_ID;
    }

    public void setPK_PTICO_ID(int PK_PTICO_ID) {
        this.PK_PTICO_ID = PK_PTICO_ID;
    }

    public String getPTICO_TIPO_COMPRA() {
        return PTICO_TIPO_COMPRA;
    }

    public void setPTICO_TIPO_COMPRA(String PTICO_TIPO_COMPRA) {
        this.PTICO_TIPO_COMPRA = PTICO_TIPO_COMPRA;
    }
}
