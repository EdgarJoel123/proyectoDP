package com.proyecto.DP.modeloDP;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "PROJECTDP_DEPARTAMENTO")
public class Departamento implements Serializable {

    /*Paramtros de la entidad departamento*/
    @Id
    private String PK_PDE_DMEOR_CODIGO;
    private String PDE_DEPARTAMENTO;

    /*@OneToOne(mappedBy = "PROJECTDP_DEPARTAMENTO")
    private Matriz matriz;
     */
    /*@ManyToOne
    @JoinColumn(name = "FK_PPRO_CODIGO_UNICO_PER")
    private Matriz matriz;
    /*@ManyToMany
    @JoinTable(name = "PROJECTDP_DEPARTAMENTO" ,
            joinColumns = @JoinColumn(name = "PK_PDE_DMEOR_CODIGO"),
            inverseJoinColumns = @JoinColumn(name = "FK_PPRO_CODIGO_UNICO_PER"))
     */

    /*Confihuracion para trabar en un entorno de JPA*/
    @OneToMany(mappedBy = "departamento")
    private List<Matriz> matriz;

    /*public String getPK_PDE_DMEOR_CODIGO() {
        return PK_PDE_DMEOR_CODIGO;
    }

    public void setPK_PDE_DMEOR_CODIGO(String PK_PDE_DMEOR_CODIGO) {
        this.PK_PDE_DMEOR_CODIGO = PK_PDE_DMEOR_CODIGO;
    }


     */

    /*Constructor con parametros para la entidad*/
    public Departamento(String PK_PDE_DMEOR_CODIGO, String PDE_DEPARTAMENTO) {
        this.PK_PDE_DMEOR_CODIGO = PK_PDE_DMEOR_CODIGO;
        this.PDE_DEPARTAMENTO = PDE_DEPARTAMENTO;
    }

    /*Constructor vacio de la entidad*/
    public Departamento() {
    }

    /*GET and SET de la entidad*/
    public String getPK_PDE_DMEOR_CODIGO() {
        return PK_PDE_DMEOR_CODIGO;
    }

    public void setPK_PDE_DMEOR_CODIGO(String PK_PDE_DMEOR_CODIGO) {
        this.PK_PDE_DMEOR_CODIGO = PK_PDE_DMEOR_CODIGO;
    }

    public String getPDE_DEPARTAMENTO() {
        return PDE_DEPARTAMENTO;
    }

    public void setPDE_DEPARTAMENTO(String PDE_DEPARTAMENTO) {
        this.PDE_DEPARTAMENTO = PDE_DEPARTAMENTO;
    }
}

