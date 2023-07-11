package com.proyecto.DP.modeloDP;

public class APresupuesto {

    /*Atributos de la entidad de Presupuesto*/
    private float PPRES_ACTIVIDAD_ENERO;
    private float PPRES_ACTIVIDAD_NOVIEMBRE;
    private float PPRES_ACTIVIDAD_DICIEMBRE;
    private float PPRES_ACTIVIDAD_OCTUBRE;
    private float PPRES_ACTIVIDAD_SEPTIEMBRE;
    private float PPRES_ACTIVIDAD_JULIO;
    private float PPRES_ACTIVIDAD_JUNIO;
    private float PPRES_ACTIVIDAD_MAYO;
    private float PPRES_ACTIVIDAD_ABRIL;
    private float PPRES_ACTIVIDAD_MARZO;
    private float PPRES_ACTIVIDAD_FEBRERO;
    private int FK_PER_CODIGO_UNICO;

    /*Constructor con parametros de la entidad*/
    public APresupuesto(float PPRES_ACTIVIDAD_ENERO, float PPRES_ACTIVIDAD_NOVIEMBRE, float PPRES_ACTIVIDAD_DICIEMBRE, float PPRES_ACTIVIDAD_OCTUBRE, float PPRES_ACTIVIDAD_SEPTIEMBRE, float PPRES_ACTIVIDAD_JULIO, float PPRES_ACTIVIDAD_JUNIO, float PPRES_ACTIVIDAD_MAYO, float PPRES_ACTIVIDAD_ABRIL, float PPRES_ACTIVIDAD_MARZO, float PPRES_ACTIVIDAD_FEBRERO, int FK_PER_CODIGO_UNICO) {
        this.PPRES_ACTIVIDAD_ENERO = PPRES_ACTIVIDAD_ENERO;
        this.PPRES_ACTIVIDAD_NOVIEMBRE = PPRES_ACTIVIDAD_NOVIEMBRE;
        this.PPRES_ACTIVIDAD_DICIEMBRE = PPRES_ACTIVIDAD_DICIEMBRE;
        this.PPRES_ACTIVIDAD_OCTUBRE = PPRES_ACTIVIDAD_OCTUBRE;
        this.PPRES_ACTIVIDAD_SEPTIEMBRE = PPRES_ACTIVIDAD_SEPTIEMBRE;
        this.PPRES_ACTIVIDAD_JULIO = PPRES_ACTIVIDAD_JULIO;
        this.PPRES_ACTIVIDAD_JUNIO = PPRES_ACTIVIDAD_JUNIO;
        this.PPRES_ACTIVIDAD_MAYO = PPRES_ACTIVIDAD_MAYO;
        this.PPRES_ACTIVIDAD_ABRIL = PPRES_ACTIVIDAD_ABRIL;
        this.PPRES_ACTIVIDAD_MARZO = PPRES_ACTIVIDAD_MARZO;
        this.PPRES_ACTIVIDAD_FEBRERO = PPRES_ACTIVIDAD_FEBRERO;
        this.FK_PER_CODIGO_UNICO = FK_PER_CODIGO_UNICO;
    }

    /*Constructor vacio de la entidad*/
    public APresupuesto() {
    }

    /*Get and Set de la entidad*/
    public float getPPRES_ACTIVIDAD_ENERO() {
        return PPRES_ACTIVIDAD_ENERO;
    }

    public void setPPRES_ACTIVIDAD_ENERO(float PPRES_ACTIVIDAD_ENERO) {
        this.PPRES_ACTIVIDAD_ENERO = PPRES_ACTIVIDAD_ENERO;
    }

    public float getPPRES_ACTIVIDAD_NOVIEMBRE() {
        return PPRES_ACTIVIDAD_NOVIEMBRE;
    }

    public void setPPRES_ACTIVIDAD_NOVIEMBRE(float PPRES_ACTIVIDAD_NOVIEMBRE) {
        this.PPRES_ACTIVIDAD_NOVIEMBRE = PPRES_ACTIVIDAD_NOVIEMBRE;
    }

    public float getPPRES_ACTIVIDAD_DICIEMBRE() {
        return PPRES_ACTIVIDAD_DICIEMBRE;
    }

    public void setPPRES_ACTIVIDAD_DICIEMBRE(float PPRES_ACTIVIDAD_DICIEMBRE) {
        this.PPRES_ACTIVIDAD_DICIEMBRE = PPRES_ACTIVIDAD_DICIEMBRE;
    }

    public float getPPRES_ACTIVIDAD_OCTUBRE() {
        return PPRES_ACTIVIDAD_OCTUBRE;
    }

    public void setPPRES_ACTIVIDAD_OCTUBRE(float PPRES_ACTIVIDAD_OCTUBRE) {
        this.PPRES_ACTIVIDAD_OCTUBRE = PPRES_ACTIVIDAD_OCTUBRE;
    }

    public float getPPRES_ACTIVIDAD_SEPTIEMBRE() {
        return PPRES_ACTIVIDAD_SEPTIEMBRE;
    }

    public void setPPRES_ACTIVIDAD_SEPTIEMBRE(float PPRES_ACTIVIDAD_SEPTIEMBRE) {
        this.PPRES_ACTIVIDAD_SEPTIEMBRE = PPRES_ACTIVIDAD_SEPTIEMBRE;
    }

    public float getPPRES_ACTIVIDAD_JULIO() {
        return PPRES_ACTIVIDAD_JULIO;
    }

    public void setPPRES_ACTIVIDAD_JULIO(float PPRES_ACTIVIDAD_JULIO) {
        this.PPRES_ACTIVIDAD_JULIO = PPRES_ACTIVIDAD_JULIO;
    }

    public float getPPRES_ACTIVIDAD_JUNIO() {
        return PPRES_ACTIVIDAD_JUNIO;
    }

    public void setPPRES_ACTIVIDAD_JUNIO(float PPRES_ACTIVIDAD_JUNIO) {
        this.PPRES_ACTIVIDAD_JUNIO = PPRES_ACTIVIDAD_JUNIO;
    }

    public float getPPRES_ACTIVIDAD_MAYO() {
        return PPRES_ACTIVIDAD_MAYO;
    }

    public void setPPRES_ACTIVIDAD_MAYO(float PPRES_ACTIVIDAD_MAYO) {
        this.PPRES_ACTIVIDAD_MAYO = PPRES_ACTIVIDAD_MAYO;
    }

    public float getPPRES_ACTIVIDAD_ABRIL() {
        return PPRES_ACTIVIDAD_ABRIL;
    }

    public void setPPRES_ACTIVIDAD_ABRIL(float PPRES_ACTIVIDAD_ABRIL) {
        this.PPRES_ACTIVIDAD_ABRIL = PPRES_ACTIVIDAD_ABRIL;
    }

    public float getPPRES_ACTIVIDAD_MARZO() {
        return PPRES_ACTIVIDAD_MARZO;
    }

    public void setPPRES_ACTIVIDAD_MARZO(float PPRES_ACTIVIDAD_MARZO) {
        this.PPRES_ACTIVIDAD_MARZO = PPRES_ACTIVIDAD_MARZO;
    }

    public float getPPRES_ACTIVIDAD_FEBRERO() {
        return PPRES_ACTIVIDAD_FEBRERO;
    }

    public void setPPRES_ACTIVIDAD_FEBRERO(float PPRES_ACTIVIDAD_FEBRERO) {
        this.PPRES_ACTIVIDAD_FEBRERO = PPRES_ACTIVIDAD_FEBRERO;
    }

    public int getFK_PER_CODIGO_UNICO() {
        return FK_PER_CODIGO_UNICO;
    }

    public void setFK_PER_CODIGO_UNICO(int FK_PER_CODIGO_UNICO) {
        this.FK_PER_CODIGO_UNICO = FK_PER_CODIGO_UNICO;
    }
}