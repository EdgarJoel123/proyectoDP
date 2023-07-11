package com.proyecto.DP.modeloDP;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "PROJECTDP_TIPO_PRODUCTO")
public class TProducto implements Serializable {

    /*Atributos de la entidad tipo de producto*/
    @Id
    private int PK_PTIPO_ID;
    private String PTIPO_TIPO_PRODUCTO;

    /*@ManyToOne
    @JoinColumn(name = "FK_PTIPO_ID_PER")
    private Matriz matriz;
     */

    /*Configuracion para trabajar en un entorno de JPA*/
    @OneToMany(mappedBy = "tProducto")
    private List<Matriz> matriz;

    /*Constructo con parametros para la entidad*/
    public TProducto(int PK_PTIPO_ID, String PTIPO_TIPO_PRODUCTO) {
        this.PK_PTIPO_ID = PK_PTIPO_ID;
        this.PTIPO_TIPO_PRODUCTO = PTIPO_TIPO_PRODUCTO;
    }

    /*Constructo vacio de la entidad*/
    public TProducto() {
    }

    /*GET and SET de la entidad*/
    public int getPK_PTIPO_ID() {
        return PK_PTIPO_ID;
    }

    public void setPK_PTIPO_ID(int PK_PTIPO_ID) {
        this.PK_PTIPO_ID = PK_PTIPO_ID;
    }

    public String getPTIPO_TIPO_PRODUCTO() {
        return PTIPO_TIPO_PRODUCTO;
    }

    public void setPTIPO_TIPO_PRODUCTO(String PTIPO_TIPO_PRODUCTO) {
        this.PTIPO_TIPO_PRODUCTO = PTIPO_TIPO_PRODUCTO;
    }
}

