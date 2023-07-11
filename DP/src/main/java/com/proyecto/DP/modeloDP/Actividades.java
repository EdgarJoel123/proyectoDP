package com.proyecto.DP.modeloDP;



import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "PROJECTDP_ACTIVIDADES" )
public class Actividades implements Serializable {

    /*Se ponen todos los atributos de la tabla */
    @Id
    private int PK_PAC_ID;
    private String PAC_ACTIVIDAD_ENERO;
    private String PAC_ACTIVIDAD_NOVIEMBRE;
    private String PAC_ACTIVIDAD_DICIEMBRE;
    private String PAC_ACTIVIDAD_OCTUBRE;
    private String PAC_ACTIVIDAD_SEPTIEMBRE;
    private String PAC_ACTIVIDAD_AGOSTO;
    private String PAC_ACTIVIDAD_JULIO;
    private String PAC_ACTIVIDAD_JUNIO;
    private String PAC_ACTIVIDAD_MAYO;
    private String PAC_ACTIVIDAD_ABRIL;
    private String PAC_ACTIVIDAD_MARZO;
    private String PAC_ACTIVIDAD_FEBRERO;
    private int FK_PER_CODIGO_UNICO;

    /*@ManyToOne
    @JoinColumn(name = "FK_PAC_ID_PER")
    private Matriz matriz;
     */
/*Para trabajar en un entorno de JPA*/
    @OneToMany(mappedBy = "actividades")
    private List<Matriz> matriz;

    /*@ManyToMany
    @JoinTable(name = "PROJECTDP_ACTIVIDADES",
            joinColumns = @JoinColumn(name = "PK_PAC_ID"),
            inverseJoinColumns = @JoinColumn(name = "FK_PAC_ID_PER"))
    private List<Matriz> matrizList;
     */

    /*Constructor de la entidad actividades*/
    public Actividades(String PAC_ACTIVIDAD_ENERO, String PAC_ACTIVIDAD_NOVIEMBRE, String PAC_ACTIVIDAD_DICIEMBRE, String PAC_ACTIVIDAD_OCTUBRE, String PAC_ACTIVIDAD_SEPTIEMBRE, String PAC_ACTIVIDAD_AGOSTO, String PAC_ACTIVIDAD_JULIO, String PAC_ACTIVIDAD_JUNIO, String PAC_ACTIVIDAD_MAYO, String PAC_ACTIVIDAD_ABRIL, String PAC_ACTIVIDAD_MARZO, String PAC_ACTIVIDAD_FEBRERO, int FK_PER_CODIGO_UNICO) {
        this.PAC_ACTIVIDAD_ENERO = PAC_ACTIVIDAD_ENERO;
        this.PAC_ACTIVIDAD_NOVIEMBRE = PAC_ACTIVIDAD_NOVIEMBRE;
        this.PAC_ACTIVIDAD_DICIEMBRE = PAC_ACTIVIDAD_DICIEMBRE;
        this.PAC_ACTIVIDAD_OCTUBRE = PAC_ACTIVIDAD_OCTUBRE;
        this.PAC_ACTIVIDAD_SEPTIEMBRE = PAC_ACTIVIDAD_SEPTIEMBRE;
        this.PAC_ACTIVIDAD_AGOSTO = PAC_ACTIVIDAD_AGOSTO;
        this.PAC_ACTIVIDAD_JULIO = PAC_ACTIVIDAD_JULIO;
        this.PAC_ACTIVIDAD_JUNIO = PAC_ACTIVIDAD_JUNIO;
        this.PAC_ACTIVIDAD_MAYO = PAC_ACTIVIDAD_MAYO;
        this.PAC_ACTIVIDAD_ABRIL = PAC_ACTIVIDAD_ABRIL;
        this.PAC_ACTIVIDAD_MARZO = PAC_ACTIVIDAD_MARZO;
        this.PAC_ACTIVIDAD_FEBRERO = PAC_ACTIVIDAD_FEBRERO;
        this.FK_PER_CODIGO_UNICO = FK_PER_CODIGO_UNICO;
    }

    /*Constructor vacio de la entidad actividades*/
    public Actividades() {
    }

    /*Get y Set de la entidad actividades*/
    public String getPAC_ACTIVIDAD_ENERO() {
        return PAC_ACTIVIDAD_ENERO;
    }

    public void setPAC_ACTIVIDAD_ENERO(String PAC_ACTIVIDAD_ENERO) {
        this.PAC_ACTIVIDAD_ENERO = PAC_ACTIVIDAD_ENERO;
    }

    public String getPAC_ACTIVIDAD_NOVIEMBRE() {
        return PAC_ACTIVIDAD_NOVIEMBRE;
    }

    public void setPAC_ACTIVIDAD_NOVIEMBRE(String PAC_ACTIVIDAD_NOVIEMBRE) {
        this.PAC_ACTIVIDAD_NOVIEMBRE = PAC_ACTIVIDAD_NOVIEMBRE;
    }

    public String getPAC_ACTIVIDAD_DICIEMBRE() {
        return PAC_ACTIVIDAD_DICIEMBRE;
    }

    public void setPAC_ACTIVIDAD_DICIEMBRE(String PAC_ACTIVIDAD_DICIEMBRE) {
        this.PAC_ACTIVIDAD_DICIEMBRE = PAC_ACTIVIDAD_DICIEMBRE;
    }

    public String getPAC_ACTIVIDAD_OCTUBRE() {
        return PAC_ACTIVIDAD_OCTUBRE;
    }

    public void setPAC_ACTIVIDAD_OCTUBRE(String PAC_ACTIVIDAD_OCTUBRE) {
        this.PAC_ACTIVIDAD_OCTUBRE = PAC_ACTIVIDAD_OCTUBRE;
    }

    public String getPAC_ACTIVIDAD_SEPTIEMBRE() {
        return PAC_ACTIVIDAD_SEPTIEMBRE;
    }

    public void setPAC_ACTIVIDAD_SEPTIEMBRE(String PAC_ACTIVIDAD_SEPTIEMBRE) {
        this.PAC_ACTIVIDAD_SEPTIEMBRE = PAC_ACTIVIDAD_SEPTIEMBRE;
    }

    public String getPAC_ACTIVIDAD_AGOSTO() {
        return PAC_ACTIVIDAD_AGOSTO;
    }

    public void setPAC_ACTIVIDAD_AGOSTO(String PAC_ACTIVIDAD_AGOSTO) {
        this.PAC_ACTIVIDAD_AGOSTO = PAC_ACTIVIDAD_AGOSTO;
    }

    public String getPAC_ACTIVIDAD_JULIO() {
        return PAC_ACTIVIDAD_JULIO;
    }

    public void setPAC_ACTIVIDAD_JULIO(String PAC_ACTIVIDAD_JULIO) {
        this.PAC_ACTIVIDAD_JULIO = PAC_ACTIVIDAD_JULIO;
    }

    public String getPAC_ACTIVIDAD_JUNIO() {
        return PAC_ACTIVIDAD_JUNIO;
    }

    public void setPAC_ACTIVIDAD_JUNIO(String PAC_ACTIVIDAD_JUNIO) {
        this.PAC_ACTIVIDAD_JUNIO = PAC_ACTIVIDAD_JUNIO;
    }

    public String getPAC_ACTIVIDAD_MAYO() {
        return PAC_ACTIVIDAD_MAYO;
    }

    public void setPAC_ACTIVIDAD_MAYO(String PAC_ACTIVIDAD_MAYO) {
        this.PAC_ACTIVIDAD_MAYO = PAC_ACTIVIDAD_MAYO;
    }

    public String getPAC_ACTIVIDAD_ABRIL() {
        return PAC_ACTIVIDAD_ABRIL;
    }

    public void setPAC_ACTIVIDAD_ABRIL(String PAC_ACTIVIDAD_ABRIL) {
        this.PAC_ACTIVIDAD_ABRIL = PAC_ACTIVIDAD_ABRIL;
    }

    public String getPAC_ACTIVIDAD_MARZO() {
        return PAC_ACTIVIDAD_MARZO;
    }

    public void setPAC_ACTIVIDAD_MARZO(String PAC_ACTIVIDAD_MARZO) {
        this.PAC_ACTIVIDAD_MARZO = PAC_ACTIVIDAD_MARZO;
    }

    public String getPAC_ACTIVIDAD_FEBRERO() {
        return PAC_ACTIVIDAD_FEBRERO;
    }

    public void setPAC_ACTIVIDAD_FEBRERO(String PAC_ACTIVIDAD_FEBRERO) {
        this.PAC_ACTIVIDAD_FEBRERO = PAC_ACTIVIDAD_FEBRERO;
    }

    public int getFK_PER_CODIGO_UNICO() {
        return FK_PER_CODIGO_UNICO;
    }

    public void setFK_PER_CODIGO_UNICO(int FK_PER_CODIGO_UNICO) {
        this.FK_PER_CODIGO_UNICO = FK_PER_CODIGO_UNICO;
    }
}

