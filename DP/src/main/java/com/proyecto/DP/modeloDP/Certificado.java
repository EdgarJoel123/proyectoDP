package com.proyecto.DP.modeloDP;

public class Certificado {

    /*Atributos de la entidad cetificado*/
    private float PCER_ACTIVIDAD_ENERO;
    private float PCER_ACTIVIDAD_NOVIEMBRE;
    private float PCER_ACTIVIDAD_DICIEMBRE;
    private float PCER_ACTIVIDAD_OCTUBRE;
    private float PCER_ACTIVIDAD_SEPTIEMBRE;
    private float PCER_ACTIVIDAD_JULIO;
    private float PCER_ACTIVIDAD_JUNIO;
    private float PCER_ACTIVIDAD_MAYO;
    private float PCER_ACTIVIDAD_ABRIL;
    private float PCER_ACTIVIDAD_MARZO;
    private float PCER_ACTIVIDAD_FEBRERO;
    private int FK_PER_CODIGO_UNICO;


    /*Constructor de parametros de la entidad*/
    public Certificado(float PCER_ACTIVIDAD_ENERO, float PCER_ACTIVIDAD_NOVIEMBRE, float PCER_ACTIVIDAD_DICIEMBRE, float PCER_ACTIVIDAD_OCTUBRE, float PCER_ACTIVIDAD_SEPTIEMBRE, float PCER_ACTIVIDAD_JULIO, float PCER_ACTIVIDAD_JUNIO, float PCER_ACTIVIDAD_MAYO, float PCER_ACTIVIDAD_ABRIL, float PCER_ACTIVIDAD_MARZO, float PCER_ACTIVIDAD_FEBRERO, int FK_PER_CODIGO_UNICO) {
        this.PCER_ACTIVIDAD_ENERO = PCER_ACTIVIDAD_ENERO;
        this.PCER_ACTIVIDAD_NOVIEMBRE = PCER_ACTIVIDAD_NOVIEMBRE;
        this.PCER_ACTIVIDAD_DICIEMBRE = PCER_ACTIVIDAD_DICIEMBRE;
        this.PCER_ACTIVIDAD_OCTUBRE = PCER_ACTIVIDAD_OCTUBRE;
        this.PCER_ACTIVIDAD_SEPTIEMBRE = PCER_ACTIVIDAD_SEPTIEMBRE;
        this.PCER_ACTIVIDAD_JULIO = PCER_ACTIVIDAD_JULIO;
        this.PCER_ACTIVIDAD_JUNIO = PCER_ACTIVIDAD_JUNIO;
        this.PCER_ACTIVIDAD_MAYO = PCER_ACTIVIDAD_MAYO;
        this.PCER_ACTIVIDAD_ABRIL = PCER_ACTIVIDAD_ABRIL;
        this.PCER_ACTIVIDAD_MARZO = PCER_ACTIVIDAD_MARZO;
        this.PCER_ACTIVIDAD_FEBRERO = PCER_ACTIVIDAD_FEBRERO;
        this.FK_PER_CODIGO_UNICO = FK_PER_CODIGO_UNICO;
    }

    /*Constructor vacio de la entidad*/
    public Certificado() {
    }

    /*Get and Set de la entidad*/
    public float getPCER_ACTIVIDAD_ENERO() {
        return PCER_ACTIVIDAD_ENERO;
    }

    public void setPCER_ACTIVIDAD_ENERO(float PCER_ACTIVIDAD_ENERO) {
        this.PCER_ACTIVIDAD_ENERO = PCER_ACTIVIDAD_ENERO;
    }

    public float getPCER_ACTIVIDAD_NOVIEMBRE() {
        return PCER_ACTIVIDAD_NOVIEMBRE;
    }

    public void setPCER_ACTIVIDAD_NOVIEMBRE(float PCER_ACTIVIDAD_NOVIEMBRE) {
        this.PCER_ACTIVIDAD_NOVIEMBRE = PCER_ACTIVIDAD_NOVIEMBRE;
    }

    public float getPCER_ACTIVIDAD_DICIEMBRE() {
        return PCER_ACTIVIDAD_DICIEMBRE;
    }

    public void setPCER_ACTIVIDAD_DICIEMBRE(float PCER_ACTIVIDAD_DICIEMBRE) {
        this.PCER_ACTIVIDAD_DICIEMBRE = PCER_ACTIVIDAD_DICIEMBRE;
    }

    public float getPCER_ACTIVIDAD_OCTUBRE() {
        return PCER_ACTIVIDAD_OCTUBRE;
    }

    public void setPCER_ACTIVIDAD_OCTUBRE(float PCER_ACTIVIDAD_OCTUBRE) {
        this.PCER_ACTIVIDAD_OCTUBRE = PCER_ACTIVIDAD_OCTUBRE;
    }

    public float getPCER_ACTIVIDAD_SEPTIEMBRE() {
        return PCER_ACTIVIDAD_SEPTIEMBRE;
    }

    public void setPCER_ACTIVIDAD_SEPTIEMBRE(float PCER_ACTIVIDAD_SEPTIEMBRE) {
        this.PCER_ACTIVIDAD_SEPTIEMBRE = PCER_ACTIVIDAD_SEPTIEMBRE;
    }

    public float getPCER_ACTIVIDAD_JULIO() {
        return PCER_ACTIVIDAD_JULIO;
    }

    public void setPCER_ACTIVIDAD_JULIO(float PCER_ACTIVIDAD_JULIO) {
        this.PCER_ACTIVIDAD_JULIO = PCER_ACTIVIDAD_JULIO;
    }

    public float getPCER_ACTIVIDAD_JUNIO() {
        return PCER_ACTIVIDAD_JUNIO;
    }

    public void setPCER_ACTIVIDAD_JUNIO(float PCER_ACTIVIDAD_JUNIO) {
        this.PCER_ACTIVIDAD_JUNIO = PCER_ACTIVIDAD_JUNIO;
    }

    public float getPCER_ACTIVIDAD_MAYO() {
        return PCER_ACTIVIDAD_MAYO;
    }

    public void setPCER_ACTIVIDAD_MAYO(float PCER_ACTIVIDAD_MAYO) {
        this.PCER_ACTIVIDAD_MAYO = PCER_ACTIVIDAD_MAYO;
    }

    public float getPCER_ACTIVIDAD_ABRIL() {
        return PCER_ACTIVIDAD_ABRIL;
    }

    public void setPCER_ACTIVIDAD_ABRIL(float PCER_ACTIVIDAD_ABRIL) {
        this.PCER_ACTIVIDAD_ABRIL = PCER_ACTIVIDAD_ABRIL;
    }

    public float getPCER_ACTIVIDAD_MARZO() {
        return PCER_ACTIVIDAD_MARZO;
    }

    public void setPCER_ACTIVIDAD_MARZO(float PCER_ACTIVIDAD_MARZO) {
        this.PCER_ACTIVIDAD_MARZO = PCER_ACTIVIDAD_MARZO;
    }

    public float getPCER_ACTIVIDAD_FEBRERO() {
        return PCER_ACTIVIDAD_FEBRERO;
    }

    public void setPCER_ACTIVIDAD_FEBRERO(float PCER_ACTIVIDAD_FEBRERO) {
        this.PCER_ACTIVIDAD_FEBRERO = PCER_ACTIVIDAD_FEBRERO;
    }

    public int getFK_PER_CODIGO_UNICO() {
        return FK_PER_CODIGO_UNICO;
    }

    public void setFK_PER_CODIGO_UNICO(int FK_PER_CODIGO_UNICO) {
        this.FK_PER_CODIGO_UNICO = FK_PER_CODIGO_UNICO;
    }
}

