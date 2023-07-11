package com.proyecto.DP.modeloDP;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "PROJECTDP_RESPONSABLE_TECNICO")
public class Responsable implements Serializable {

    /*Atributos de la entidad responsable tecnico*/
    @Id
    private String PK_PRETE_DMPER_CODIGO;
    private String PRETE_NOMBRE;
    private String PRETE_APELLIDO;
    private String PRETE_ROL;
    private String PRETE_DMEOR_CODIGO;
    private int FK_PPRO_CODIGO_UNICO;
    private String FK_DMPER_CODIGO;

    /*@ManyToMany
    @JoinTable(name = "PROJECTDP_RESPONSABLE_TECNICO" ,
                joinColumns = @JoinColumn(name = "PK_PRETE_DMPER_CODIGO"),
                inverseJoinColumns = @JoinColumn(name = "FK_PPRO_CODIGO_UNICO_PER"))
    private List<Matriz> matrizList;
     */

    /*Configuracion para trabajar en un entorno de JPA*/
    @ManyToOne
    @JoinColumn(name = "FK_PPRO_CODIGO_UNICO_PER")
    private Matriz matriz;

    /*Constructor con parametros de la entidad*/
    public Responsable(int FK_PPRO_CODIGO_UNICO, String FK_DMPER_CODIGO) {
        this.FK_PPRO_CODIGO_UNICO = FK_PPRO_CODIGO_UNICO;
        this.FK_DMPER_CODIGO = FK_DMPER_CODIGO;
    }

    /*Constructo vacio de la entidad*/
    public Responsable() {
    }

    /*GET and SET de la entidad*/
    public int getFK_PPRO_CODIGO_UNICO() {
        return FK_PPRO_CODIGO_UNICO;
    }

    public void setFK_PPRO_CODIGO_UNICO(int FK_PPRO_CODIGO_UNICO) {
        this.FK_PPRO_CODIGO_UNICO = FK_PPRO_CODIGO_UNICO;
    }

    public String getFK_DMPER_CODIGO() {
        return FK_DMPER_CODIGO;
    }

    public void setFK_DMPER_CODIGO(String FK_DMPER_CODIGO) {
        this.FK_DMPER_CODIGO = FK_DMPER_CODIGO;
    }
}

