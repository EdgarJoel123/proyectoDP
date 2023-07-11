package com.proyecto.DP.modeloDP;

public class ETPresupuestaria {

    /*Parmetros de la entidad etapa presupuestaria*/
     private String PK_PETAPRE_ID;
      private String PETAPRE_ETAPA_PRESUPUESTO;

      /*Constructor con parametros de la entidad*/
    public ETPresupuestaria(String PK_PETAPRE_ID, String PETAPRE_ETAPA_PRESUPUESTO) {
        this.PK_PETAPRE_ID = PK_PETAPRE_ID;
        this.PETAPRE_ETAPA_PRESUPUESTO = PETAPRE_ETAPA_PRESUPUESTO;
    }

    /*Constructor vacio de la entidad*/
    public ETPresupuestaria() {
    }

    /*GET and SET de la entidad*/
    public String getPK_PETAPRE_ID() {
        return PK_PETAPRE_ID;
    }

    public void setPK_PETAPRE_ID(String PK_PETAPRE_ID) {
        this.PK_PETAPRE_ID = PK_PETAPRE_ID;
    }

    public String getPETAPRE_ETAPA_PRESUPUESTO() {
        return PETAPRE_ETAPA_PRESUPUESTO;
    }

    public void setPETAPRE_ETAPA_PRESUPUESTO(String PETAPRE_ETAPA_PRESUPUESTO) {
        this.PETAPRE_ETAPA_PRESUPUESTO = PETAPRE_ETAPA_PRESUPUESTO;
    }
}
