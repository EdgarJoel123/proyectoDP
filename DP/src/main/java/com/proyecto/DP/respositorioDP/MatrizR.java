package com.proyecto.DP.respositorioDP;


import com.proyecto.DP.modeloDP.Matriz;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Date;
import java.util.List;

public interface MatrizR {
   List<Matriz> findID(Integer PK_PPRO_CODIGO_UNICO);
   List<Matriz> joinTables();
    List<Matriz> joinTablesNuevos();
    void populateDepartamento();
     void populateResponsable();

    void actualizarMatriz(String PPRO_ANIO,
                          String PPRO_CANTIDAD_ANUAL,
                          String PPRO_CATALOGO_ELECTRONICO,
                          Float PPRO_CODIGO_CATEGORIA_CPC,
                          String PPRO_CODIGO_SERCOP,
                          Float PPRO_COSTO_UNITARIO,
                          String PPRO_CUATRIMESTRE_N1,
                          String PPRO_CUATRIMESTRE_N2,
                          String PPRO_CUATRIMESTRE_N3,
                          String PPRO_DETALLE_PRODUCTO,
                          Date PPRO_FECHA_FINAL,
                          Date PPRO_FECHA_INICIAL,
                          String PPRO_FONDOS_BID,
                          String PPRO_NUMERO_CODIGO_OPERACION_P,
                          String PPRO_NUMERO_CODIGO_PROYECTO_BI,
                          String PPRO_NUMERO_CONTRATO,
                          String PPRO_OBSERVACIONES,
                          String PPRO_PLAZO,
                          String PPRO_CODIGO_RAPIDO,
                          Float PPRO_PRESUPUESTO_INICIAL,
                          Float PPRO_PRESUPUESTO_CODIFICADO,
                          String FK_PETAPRE_ID,
                          String FK_PDE_DMEOR_CODIGO,
                          String FK_PPRSE_ID_PER,
                          String FK_PTICO_ID_PER,
                          String FK_PTIPRE_ID_PER,
                          String FK_PTIPO_ID_PER,
                          String FK_PTIPRO_ID_PER,
                          String FK_PTIRE_ID_PER,
                          String FK_PUNI_ID_PER,
                          Integer PK_PPRO_CODIGO_UNICO);



}
