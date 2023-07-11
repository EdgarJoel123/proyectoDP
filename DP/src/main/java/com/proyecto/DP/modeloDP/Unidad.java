package com.proyecto.DP.modeloDP;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "PROJECTDP_UNIDAD")
public class Unidad implements Serializable {

    /*Atributos de la entidad Unidad*/
    @Id
    private int PK_PUNI_ID;
    private  String PUNI_UNIDAD;

    /*@ManyToOne
    @JoinColumn(name = "FK_PUNI_ID_PER")
    private Matriz matriz;
     */

    /*Configuracion para trabjar en un entorno de JPA*/
    @OneToMany(mappedBy = "unidad")
    private List<Matriz> matriz;

    /*Constructor con parametros de la entidad*/
    public Unidad(int PK_PUNI_ID, String PUNI_UNIDAD) {
        this.PK_PUNI_ID = PK_PUNI_ID;
        this.PUNI_UNIDAD = PUNI_UNIDAD;
    }

    /*Cosntructor vacio de la entidad*/
    public Unidad() {
    }

    /*GET and SET de la entidad*/
    public int getPK_PUNI_ID() {
        return PK_PUNI_ID;
    }

    public void setPK_PUNI_ID(int PK_PUNI_ID) {
        this.PK_PUNI_ID = PK_PUNI_ID;
    }

    public String getPUNI_UNIDAD() {
        return PUNI_UNIDAD;
    }

    public void setPUNI_UNIDAD(String PUNI_UNIDAD) {
        this.PUNI_UNIDAD = PUNI_UNIDAD;
    }
}
