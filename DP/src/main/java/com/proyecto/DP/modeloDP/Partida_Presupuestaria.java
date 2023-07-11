package com.proyecto.DP.modeloDP;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "PROJECTDP_PARTIDA_PRESUPUESTARIA")
public class Partida_Presupuestaria implements Serializable {

    /*Atributos de la entidad partida presupuestaria*/
    @Id
    private int PK_PPAPRE_ID;
    private String PPAPRE_PARTIDA_PRESUPUESTARIA;
    private int FK_PPRO_CODIGO_UNICO;

    /*@ManyToMany
    @JoinColumn(name = "FK_PPAPRE_ID_PER")
    private Matriz matriz;
     */

    /*@ManyToMany
    @JoinTable(name = "PROJECTDP_PARTIDA_PRESUPUESTARIA" ,
            joinColumns = @JoinColumn(name = "PK_PPAPRE_ID"),
            inverseJoinColumns = @JoinColumn(name = "FK_PPAPRE_ID_PER"))
    private List<Matriz> matrizList;
     */

    /*Configuracion para trabjar en un entorno de JPA*/
    @OneToMany(mappedBy = "partida_presupuestaria")
    private List<Matriz> matriz;

    /*Constructor con parametros de la entidad*/
    public Partida_Presupuestaria(int PK_PPAPRE_ID, String PPAPRE_PARTIDA_PRESUPUESTARIA, int FK_PPRO_CODIGO_UNICO) {
        this.PK_PPAPRE_ID = PK_PPAPRE_ID;
        this.PPAPRE_PARTIDA_PRESUPUESTARIA = PPAPRE_PARTIDA_PRESUPUESTARIA;
        this.FK_PPRO_CODIGO_UNICO = FK_PPRO_CODIGO_UNICO;
    }

    /*Cosntructor vacio de la entidad*/
    public Partida_Presupuestaria() {
    }

    /*GET and SET de la entidad */
    public int getPK_PPAPRE_ID() {
        return PK_PPAPRE_ID;
    }

    public void setPK_PPAPRE_ID(int PK_PPAPRE_ID) {
        this.PK_PPAPRE_ID = PK_PPAPRE_ID;
    }

    public String getPPAPRE_PARTIDA_PRESUPUESTARIA() {
        return PPAPRE_PARTIDA_PRESUPUESTARIA;
    }

    public void setPPAPRE_PARTIDA_PRESUPUESTARIA(String PPAPRE_PARTIDA_PRESUPUESTARIA) {
        this.PPAPRE_PARTIDA_PRESUPUESTARIA = PPAPRE_PARTIDA_PRESUPUESTARIA;
    }

    public int getFK_PPRO_CODIGO_UNICO() {
        return FK_PPRO_CODIGO_UNICO;
    }

    public void setFK_PPRO_CODIGO_UNICO(int FK_PPRO_CODIGO_UNICO) {
        this.FK_PPRO_CODIGO_UNICO = FK_PPRO_CODIGO_UNICO;
    }
}