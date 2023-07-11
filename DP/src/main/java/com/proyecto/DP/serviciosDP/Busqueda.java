package com.proyecto.DP.serviciosDP;

import com.proyecto.DP.modeloDP.Departamento;
import com.proyecto.DP.modeloDP.Matriz;
import com.proyecto.DP.respositorioDP.DepartamentoR;
import com.proyecto.DP.respositorioDP.MatrizR;
import com.proyecto.DP.respositorioDP.ResponsableR;
import oracle.jdbc.driver.DatabaseError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class Busqueda {
   /* @Autowired
    private final JdbcTemplate jdbcTemplate;

    public Busqueda(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Matriz> findID(Integer PK_PPRO_CODIGO_UNICO) {
        String query = "SELECT M.PK_PPRO_CODIGO_UNICO,\n" +
                "      M.PPRO_ANIO,\n" +
                "      M.PPRO_CANTIDAD_ANUAL,\n" +
                "      M.PPRO_CATALOGO_ELECTRONICO,\n" +
                "      M.PPRO_CODIGO_CATEGORIA_CPC,\n" +
                "      M.PPRO_CODIGO_SERCOP,\n" +
                "      M.PPRO_COSTO_UNITARIO,\n" +
                "      M.PPRO_CUATRIMESTRE_N1,\n" +
                "      M.PPRO_CUATRIMESTRE_N2,\n" +
                "      M.PPRO_CUATRIMESTRE_N3,\n" +
                "      M.PPRO_DETALLE_PRODUCTO,\n" +
                "      M.PPRO_FECHA_FINAL,\n" +
                "      M.PPRO_FECHA_INICIAL,\n" +
                "      M.PPRO_FONDOS_BID,\n" +
                "      M.PPRO_NUMERO_CODIGO_OPERACION_P,\n" +
                "      M.PPRO_NUMERO_CODIGO_PROYECTO_BI,\n" +
                "      M.PPRO_NUMERO_CONTRATO,\n" +
                "      M.PPRO_OBSERVACIONES,\n" +
                "      M.PPRO_PLAZO,\n" +
                "      M.PPRO_CODIGO_RAPIDO,\n" +
                "      M.PPRO_PRESUPUESTO_INICIAL,\n" +
                "      M.PPRO_PRESUPUESTO_CODIFICADO,\n" +
                "      EP.PETAPRE_ETAPA_PRESUPUESTO,\n" +
                "      EP.PK_PETAPRE_ID,\n" +
                "      A.PAC_ACTIVIDAD_ENERO,\n" +
                "      A.PAC_ACTIVIDAD_FEBRERO,\n" +
                "      A.PAC_ACTIVIDAD_MARZO,\n" +
                "      A.PAC_ACTIVIDAD_ABRIL,\n" +
                "      A.PAC_ACTIVIDAD_MAYO,\n" +
                "      A.PAC_ACTIVIDAD_JUNIO,\n" +
                "      A.PAC_ACTIVIDAD_JULIO,\n" +
                "      A.PAC_ACTIVIDAD_AGOSTO,\n" +
                "      A.PAC_ACTIVIDAD_SEPTIEMBRE,\n" +
                "      A.PAC_ACTIVIDAD_OCTUBRE,\n" +
                "      A.PAC_ACTIVIDAD_NOVIEMBRE,\n" +
                "      A.PAC_ACTIVIDAD_DICIEMBRE,\n" +
                "      AP.PPRES_ACTIVIDAD_ENERO,\n" +
                "      AP.PPRES_ACTIVIDAD_FEBRERO,\n" +
                "      AP.PPRES_ACTIVIDAD_MARZO,\n" +
                "      AP.PPRES_ACTIVIDAD_ABRIL,\n" +
                "      AP.PPRES_ACTIVIDAD_MAYO,\n" +
                "      AP.PPRES_ACTIVIDAD_JUNIO,\n" +
                "      AP.PPRES_ACTIVIDAD_JULIO,\n" +
                "      AP.PPRES_ACTIVIDAD_AGOSTO,\n" +
                "      AP.PPRES_ACTIVIDAD_SEPTIEMBRE,\n" +
                "      AP.PPRES_ACTIVIDAD_OCTUBRE,\n" +
                "      AP.PPRES_ACTIVIDAD_NOVIEMBRE,\n" +
                "      AP.PPRES_ACTIVIDAD_DICIEMBRE,\n" +
                "      AC.PCER_ACTIVIDAD_ENERO,\n" +
                "      AC.PCER_ACTIVIDAD_FEBRERO,\n" +
                "      AC.PCER_ACTIVIDAD_MARZO,\n" +
                "      AC.PCER_ACTIVIDAD_ABRIL,\n" +
                "      AC.PCER_ACTIVIDAD_MAYO,\n" +
                "      AC.PCER_ACTIVIDAD_JUNIO,\n" +
                "      AC.PCER_ACTIVIDAD_JULIO,\n" +
                "      AC.PCER_ACTIVIDAD_AGOSTO,\n" +
                "      AC.PCER_ACTIVIDAD_SEPTIEMBRE,\n" +
                "      AC.PCER_ACTIVIDAD_OCTUBRE,\n" +
                "      AC.PCER_ACTIVIDAD_NOVIEMBRE,\n" +
                "      AC.PCER_ACTIVIDAD_DICIEMBRE,\n" +
                "      APA.PPAG_ACTIVIDAD_ENERO,\n" +
                "      APA.PPAG_ACTIVIDAD_FEBRERO,\n" +
                "      APA.PPAG_ACTIVIDAD_MARZO,\n" +
                "      APA.PPAG_ACTIVIDAD_ABRIL,\n" +
                "      APA.PPAG_ACTIVIDAD_MAYO,\n" +
                "      APA.PPAG_ACTIVIDAD_JUNIO,\n" +
                "      APA.PPAG_ACTIVIDAD_JULIO,\n" +
                "      APA.PPAG_ACTIVIDAD_AGOSTO,\n" +
                "      APA.PPAG_ACTIVIDAD_SEPTIEMBRE,\n" +
                "      APA.PPAG_ACTIVIDAD_OCTUBRE,\n" +
                "      APA.PPAG_ACTIVIDAD_NOVIEMBRE,\n" +
                "      APA.PPAG_ACTIVIDAD_DICIEMBRE,\n" +
                "      D.PDE_DEPARTAMENTO,\n" +
                "      D.PK_PDE_DMEOR_CODIGO,\n" +
                "      PP.PPAPRE_PARTIDA_PRESUPUESTARIA,\n" +
                "      PA.PPOAVFIDE_PORCENTAJE_AVANCE_FI *100 AS PORCENTAJE,\n" +
                "      PA.PPOAVFIDE_OBSERVACIONES_PA,\n" +
                "      PA.PPOAVFIDE_FECHA_PA,\n" +
                "      PS.PPRSE_PROCEDIMIENTO_SERCOP,\n" +
                "      PS.PK_PPRSE_ID,\n" +
                "      TC.PTICO_TIPO_COMPRA,\n" +
                "      TC.PK_PTICO_ID,\n" +
                "      TPRE.PTIPRE_TIPO_PRESUPUESTO,\n" +
                "      TPRE.PK_PTIPRE_ID,\n" +
                "      TPROD.PTIPO_TIPO_PRODUCTO,\n" +
                "      TPROD.PK_PTIPO_ID,\n" +
                "      TPRO.PTIPRO_TIPO_PROYECTO,\n" +
                "      TPRO.PK_PTIPRO_ID,\n" +
                "      TR.PTIRE_TIPO_REGIMEN,\n" +
                "      TR.PK_PTIRE_ID,\n" +
                "      U.PUNI_UNIDAD,\n" +
                "      U.PK_PUNI_ID,\n" +
                "      VA.PVADE_VALOR_DEVENGADO,\n" +
                "      VA.PVADE_OBSERVACIONES_VD,\n" +
                "      VA.PVADE_FECHA_VD,\n" +
                "      RT.PRETE_NOMBRE,\n" +
                "      RT.PRETE_APELLIDO,\n" +
                "      RT.PRETE_ROL,\n" +
                "      RT.PRETE_DMEOR_CODIGO,\n" +
                "      CASE\n" +
                "    WHEN SYSDATE >= M.PPRO_FECHA_FINAL THEN 'RETRASADO'\n" +
                "    ELSE 'VIGENTE'\n" +
                "END AS ESTADO\n" +
                "FROM PROJECTDP_PROYECTOS M  \n" +
                "LEFT OUTER JOIN PROYECTDP_DETALLE_RESPONSABLE DR\n" +
                "ON  M.PK_PPRO_CODIGO_UNICO = DR.FK_PPRO_CODIGO_UNICO\n" +
                "LEFT OUTER JOIN PROYECTDP_RESPONSABLE_TECNICO RT\n" +
                "ON DR.FK_DMPER_CODIGO = RT.PK_PRETE_DMPER_CODIGO\n" +
                "LEFT OUTER JOIN PROJECTDP_ACTIVIDADES A \n" +
                "ON M.PK_PPRO_CODIGO_UNICO = A.FK_PER_CODIGO_UNICO\n" +
                "LEFT OUTER JOIN PROYECTDP_PRESUPUESTO AP \n" +
                "ON M.PK_PPRO_CODIGO_UNICO = AP.FK_PPRO_CODIGO_UNICO\n" +
                "LEFT OUTER JOIN PROYECTDP_CERTIFICADO AC \n" +
                "ON M.PK_PPRO_CODIGO_UNICO = AC.FK_PPRO_CODIGO_UNICO\n" +
                "LEFT OUTER JOIN PROYECTDP_PAGADO APA \n" +
                "ON M.PK_PPRO_CODIGO_UNICO = APA.FK_PPRO_CODIGO_UNICO\n" +
                "LEFT OUTER JOIN PROJECTDP_DEPARTAMENTO D \n" +
                "ON M.FK_PDE_DMEOR_CODIGO = D.PK_PDE_DMEOR_CODIGO\n" +

                "LEFT OUTER JOIN PROJECTDP_PARTIDA_PRESUPUESTAR PP \n" +
                "ON M.PK_PPRO_CODIGO_UNICO = PP.FK_PPRO_CODIGO_UNICO\n" +

                "LEFT OUTER JOIN PROJECTDP_PORCENTAJE_AVANCE_FI PA \n" +
                "ON M.PK_PPRO_CODIGO_UNICO = PA.FK_PPRO_CODIGO_UNICO\n" +

                "LEFT OUTER JOIN PROJECTDP_PROCEDIMIENTO_SERCOP PS \n" +
                "ON M.FK_PPRSE_ID_PER = PS.PK_PPRSE_ID\n" +
                "LEFT OUTER JOIN PROJECTDP_TIPO_COMPRA TC \n" +
                "ON M.FK_PTICO_ID_PER = TC.PK_PTICO_ID\n" +
                "LEFT OUTER JOIN PROJECTDP_TIPO_PRESUPUESTO TPRE \n" +
                "ON M.FK_PTIPRE_ID_PER = TPRE.PK_PTIPRE_ID\n" +
                "LEFT OUTER JOIN PROJECTDP_TIPO_PRODUCTO TPROD \n" +
                "ON M.FK_PTIPO_ID_PER = TPROD.PK_PTIPO_ID\n" +
                "LEFT OUTER JOIN PROJECTDP_TIPO_PROYECTO TPRO \n" +
                "ON M.FK_PTIPRO_ID_PER = TPRO.PK_PTIPRO_ID\n" +
                "LEFT OUTER JOIN PROJECTDP_TIPO_REGIMEN TR \n" +
                "ON M.FK_PTIRE_ID_PER = TR.PK_PTIRE_ID\n" +
                "LEFT OUTER JOIN PROJECTDP_UNIDAD U \n" +
                "ON M.FK_PUNI_ID_PER = U.PK_PUNI_ID\n" +
                "LEFT OUTER JOIN PROYECTDP_ETAPA_PRESUPUESTO EP\n" +
                "ON M.FK_PETAPRE_ID = EP.PK_PETAPRE_ID\n"+

                "LEFT OUTER JOIN PROJECTDP_VALOR_DEVENGADO VA \n" +
                "ON M.PK_PPRO_CODIGO_UNICO = VA.FK_PPRO_CODIGO_UNICO \n" +

                "WHERE M.PK_PPRO_CODIGO_UNICO = ? \n" +
                "ORDER BY M.PK_PPRO_CODIGO_UNICO";



        return jdbcTemplate.query(query, new Object[]{PK_PPRO_CODIGO_UNICO}, new MatrizMapper());
    }

    @Override
    public List<Matriz> joinTables() {
        String query = "SELECT M.PK_PPRO_CODIGO_UNICO,\n" +
                "      M.PPRO_ANIO,\n" +
                "      M.PPRO_CANTIDAD_ANUAL,\n" +
                "      M.PPRO_CATALOGO_ELECTRONICO,\n" +
                "      M.PPRO_CODIGO_CATEGORIA_CPC,\n" +
                "      M.PPRO_CODIGO_SERCOP,\n" +
                "      M.PPRO_COSTO_UNITARIO,\n" +
                "      M.PPRO_CUATRIMESTRE_N1,\n" +
                "      M.PPRO_CUATRIMESTRE_N2,\n" +
                "      M.PPRO_CUATRIMESTRE_N3,\n" +
                "      M.PPRO_DETALLE_PRODUCTO,\n" +
                "      M.PPRO_FECHA_FINAL,\n" +
                "      M.PPRO_FECHA_INICIAL,\n" +
                "      M.PPRO_FONDOS_BID,\n" +
                "      M.PPRO_NUMERO_CODIGO_OPERACION_P,\n" +
                "      M.PPRO_NUMERO_CODIGO_PROYECTO_BI,\n" +
                "      M.PPRO_NUMERO_CONTRATO,\n" +
                "      M.PPRO_OBSERVACIONES,\n" +
                "      M.PPRO_PLAZO,\n" +
                "      M.PPRO_CODIGO_RAPIDO,\n" +
                "      M.PPRO_PRESUPUESTO_INICIAL,\n" +
                "      M.PPRO_PRESUPUESTO_CODIFICADO,\n" +
                "      EP.PETAPRE_ETAPA_PRESUPUESTO,\n" +
                "      EP.PK_PETAPRE_ID,\n" +
                "      A.PAC_ACTIVIDAD_ENERO,\n" +
                "      A.PAC_ACTIVIDAD_FEBRERO,\n" +
                "      A.PAC_ACTIVIDAD_MARZO,\n" +
                "      A.PAC_ACTIVIDAD_ABRIL,\n" +
                "      A.PAC_ACTIVIDAD_MAYO,\n" +
                "      A.PAC_ACTIVIDAD_JUNIO,\n" +
                "      A.PAC_ACTIVIDAD_JULIO,\n" +
                "      A.PAC_ACTIVIDAD_AGOSTO,\n" +
                "      A.PAC_ACTIVIDAD_SEPTIEMBRE,\n" +
                "      A.PAC_ACTIVIDAD_OCTUBRE,\n" +
                "      A.PAC_ACTIVIDAD_NOVIEMBRE,\n" +
                "      A.PAC_ACTIVIDAD_DICIEMBRE,\n" +
                "      AP.PPRES_ACTIVIDAD_ENERO,\n" +
                "      AP.PPRES_ACTIVIDAD_FEBRERO,\n" +
                "      AP.PPRES_ACTIVIDAD_MARZO,\n" +
                "      AP.PPRES_ACTIVIDAD_ABRIL,\n" +
                "      AP.PPRES_ACTIVIDAD_MAYO,\n" +
                "      AP.PPRES_ACTIVIDAD_JUNIO,\n" +
                "      AP.PPRES_ACTIVIDAD_JULIO,\n" +
                "      AP.PPRES_ACTIVIDAD_AGOSTO,\n" +
                "      AP.PPRES_ACTIVIDAD_SEPTIEMBRE,\n" +
                "      AP.PPRES_ACTIVIDAD_OCTUBRE,\n" +
                "      AP.PPRES_ACTIVIDAD_NOVIEMBRE,\n" +
                "      AP.PPRES_ACTIVIDAD_DICIEMBRE,\n" +
                "      AC.PCER_ACTIVIDAD_ENERO,\n" +
                "      AC.PCER_ACTIVIDAD_FEBRERO,\n" +
                "      AC.PCER_ACTIVIDAD_MARZO,\n" +
                "      AC.PCER_ACTIVIDAD_ABRIL,\n" +
                "      AC.PCER_ACTIVIDAD_MAYO,\n" +
                "      AC.PCER_ACTIVIDAD_JUNIO,\n" +
                "      AC.PCER_ACTIVIDAD_JULIO,\n" +
                "      AC.PCER_ACTIVIDAD_AGOSTO,\n" +
                "      AC.PCER_ACTIVIDAD_SEPTIEMBRE,\n" +
                "      AC.PCER_ACTIVIDAD_OCTUBRE,\n" +
                "      AC.PCER_ACTIVIDAD_NOVIEMBRE,\n" +
                "      AC.PCER_ACTIVIDAD_DICIEMBRE,\n" +
                "      APA.PPAG_ACTIVIDAD_ENERO,\n" +
                "      APA.PPAG_ACTIVIDAD_FEBRERO,\n" +
                "      APA.PPAG_ACTIVIDAD_MARZO,\n" +
                "      APA.PPAG_ACTIVIDAD_ABRIL,\n" +
                "      APA.PPAG_ACTIVIDAD_MAYO,\n" +
                "      APA.PPAG_ACTIVIDAD_JUNIO,\n" +
                "      APA.PPAG_ACTIVIDAD_JULIO,\n" +
                "      APA.PPAG_ACTIVIDAD_AGOSTO,\n" +
                "      APA.PPAG_ACTIVIDAD_SEPTIEMBRE,\n" +
                "      APA.PPAG_ACTIVIDAD_OCTUBRE,\n" +
                "      APA.PPAG_ACTIVIDAD_NOVIEMBRE,\n" +
                "      APA.PPAG_ACTIVIDAD_DICIEMBRE,\n" +
                "      D.PDE_DEPARTAMENTO,\n" +
                "      D.PK_PDE_DMEOR_CODIGO,\n" +
                "      PP.PPAPRE_PARTIDA_PRESUPUESTARIA,\n" +
                "      PA.PPOAVFIDE_PORCENTAJE_AVANCE_FI *100 AS PORCENTAJE,\n" +
                "      PA.PPOAVFIDE_OBSERVACIONES_PA,\n" +
                "      PA.PPOAVFIDE_FECHA_PA,\n" +
                "      PS.PPRSE_PROCEDIMIENTO_SERCOP,\n" +
                "      PS.PK_PPRSE_ID,\n" +
                "      TC.PTICO_TIPO_COMPRA,\n" +
                "      TC.PK_PTICO_ID,\n" +
                "      TPRE.PTIPRE_TIPO_PRESUPUESTO,\n" +
                "      TPRE.PK_PTIPRE_ID,\n" +
                "      TPROD.PTIPO_TIPO_PRODUCTO,\n" +
                "      TPROD.PK_PTIPO_ID,\n" +
                "      TPRO.PTIPRO_TIPO_PROYECTO,\n" +
                "      TPRO.PK_PTIPRO_ID,\n" +
                "      TR.PTIRE_TIPO_REGIMEN,\n" +
                "      TR.PK_PTIRE_ID,\n" +
                "      U.PUNI_UNIDAD,\n" +
                "      U.PK_PUNI_ID,\n" +
                "      VA.PVADE_VALOR_DEVENGADO,\n" +
                "      VA.PVADE_OBSERVACIONES_VD,\n" +
                "      VA.PVADE_FECHA_VD,\n" +
                "      RT.PRETE_NOMBRE,\n" +
                "      RT.PRETE_APELLIDO,\n" +
                "      RT.PRETE_ROL,\n" +
                "      RT.PRETE_DMEOR_CODIGO,\n" +
                "      CASE\n" +
                "    WHEN SYSDATE >= M.PPRO_FECHA_FINAL THEN 'RETRASADO'\n" +
                "    ELSE 'VIGENTE'\n" +
                "END AS ESTADO\n" +
                "FROM PROJECTDP_PROYECTOS M  \n" +
                "LEFT OUTER JOIN PROYECTDP_DETALLE_RESPONSABLE DR\n" +
                "ON  M.PK_PPRO_CODIGO_UNICO = DR.FK_PPRO_CODIGO_UNICO\n" +
                "LEFT OUTER JOIN PROYECTDP_RESPONSABLE_TECNICO RT\n" +
                "ON DR.FK_DMPER_CODIGO = RT.PK_PRETE_DMPER_CODIGO\n" +
                "LEFT OUTER JOIN PROJECTDP_ACTIVIDADES A \n" +
                "ON M.PK_PPRO_CODIGO_UNICO = A.FK_PER_CODIGO_UNICO\n" +
                "LEFT OUTER JOIN PROYECTDP_PRESUPUESTO AP \n" +
                "ON M.PK_PPRO_CODIGO_UNICO = AP.FK_PPRO_CODIGO_UNICO\n" +
                "LEFT OUTER JOIN PROYECTDP_CERTIFICADO AC \n" +
                "ON M.PK_PPRO_CODIGO_UNICO = AC.FK_PPRO_CODIGO_UNICO\n" +
                "LEFT OUTER JOIN PROYECTDP_PAGADO APA \n" +
                "ON M.PK_PPRO_CODIGO_UNICO = APA.FK_PPRO_CODIGO_UNICO\n" +
                "LEFT OUTER JOIN PROJECTDP_DEPARTAMENTO D \n" +
                "ON M.FK_PDE_DMEOR_CODIGO = D.PK_PDE_DMEOR_CODIGO\n" +

                "LEFT OUTER JOIN PROJECTDP_PARTIDA_PRESUPUESTAR PP \n" +
                "ON M.PK_PPRO_CODIGO_UNICO = PP.FK_PPRO_CODIGO_UNICO\n" +

                "LEFT OUTER JOIN PROJECTDP_PORCENTAJE_AVANCE_FI PA \n" +
                "ON M.PK_PPRO_CODIGO_UNICO = PA.FK_PPRO_CODIGO_UNICO\n" +

                "LEFT OUTER JOIN PROJECTDP_PROCEDIMIENTO_SERCOP PS \n" +
                "ON M.FK_PPRSE_ID_PER = PS.PK_PPRSE_ID\n" +
                "LEFT OUTER JOIN PROJECTDP_TIPO_COMPRA TC \n" +
                "ON M.FK_PTICO_ID_PER = TC.PK_PTICO_ID\n" +
                "LEFT OUTER JOIN PROJECTDP_TIPO_PRESUPUESTO TPRE \n" +
                "ON M.FK_PTIPRE_ID_PER = TPRE.PK_PTIPRE_ID\n" +
                "LEFT OUTER JOIN PROJECTDP_TIPO_PRODUCTO TPROD \n" +
                "ON M.FK_PTIPO_ID_PER = TPROD.PK_PTIPO_ID\n" +
                "LEFT OUTER JOIN PROJECTDP_TIPO_PROYECTO TPRO \n" +
                "ON M.FK_PTIPRO_ID_PER = TPRO.PK_PTIPRO_ID\n" +
                "LEFT OUTER JOIN PROJECTDP_TIPO_REGIMEN TR \n" +
                "ON M.FK_PTIRE_ID_PER = TR.PK_PTIRE_ID\n" +
                "LEFT OUTER JOIN PROJECTDP_UNIDAD U \n" +
                "ON M.FK_PUNI_ID_PER = U.PK_PUNI_ID\n" +
                "LEFT OUTER JOIN PROYECTDP_ETAPA_PRESUPUESTO EP\n" +
                "ON M.FK_PETAPRE_ID = EP.PK_PETAPRE_ID\n"+
                "LEFT OUTER JOIN PROJECTDP_VALOR_DEVENGADO VA \n" +
                "ON M.PK_PPRO_CODIGO_UNICO = VA.FK_PPRO_CODIGO_UNICO \n" +
                "ORDER BY M.PK_PPRO_CODIGO_UNICO";

        return jdbcTemplate.query(query, new MatrizMapper());

    }

    @Override
    public void populateDepartamento() {

    }

    @Override
    public void populateResponsable() {

    }

    @Override
    public void actualizarMatriz(String PPRO_ANIO, String PPRO_CANTIDAD_ANUAL, String PPRO_CATALOGO_ELECTRONICO, Float PPRO_CODIGO_CATEGORIA_CPC, String PPRO_CODIGO_SERCOP, Float PPRO_COSTO_UNITARIO, String PPRO_CUATRIMESTRE_N1, String PPRO_CUATRIMESTRE_N2, String PPRO_CUATRIMESTRE_N3, String PPRO_DETALLE_PRODUCTO, Date PPRO_FECHA_FINAL, Date PPRO_FECHA_INICIAL, String PPRO_FONDOS_BID, String PPRO_NUMERO_CODIGO_OPERACION_P, String PPRO_NUMERO_CODIGO_PROYECTO_BI, String PPRO_NUMERO_CONTRATO, String PPRO_OBSERVACIONES, String PPRO_PLAZO, String PPRO_CODIGO_RAPIDO, Float PPRO_PRESUPUESTO_INICIAL, Float PPRO_PRESUPUESTO_CODIFICADO, String FK_PETAPRE_ID, String FK_PDE_DMEOR_CODIGO, String FK_PPRSE_ID_PER, String FK_PTICO_ID_PER, String FK_PTIPRE_ID_PER, String FK_PTIPO_ID_PER, String FK_PTIPRO_ID_PER, String FK_PTIRE_ID_PER, String FK_PUNI_ID_PER, Integer PK_PPRO_CODIGO_UNICO) {

       if ((PPRO_ANIO != null) && (PPRO_CANTIDAD_ANUAL != null) && (PPRO_CATALOGO_ELECTRONICO != null) &&
                (PPRO_CODIGO_CATEGORIA_CPC != null) &&
               (PPRO_CODIGO_SERCOP != null) &&(PPRO_COSTO_UNITARIO != null) &&(PPRO_CUATRIMESTRE_N1 != null) &&
               (PPRO_CUATRIMESTRE_N2 != null) && (PPRO_CUATRIMESTRE_N3 != null) && (PPRO_DETALLE_PRODUCTO != null) &&
               (PPRO_FECHA_FINAL != null )&& (PPRO_FECHA_INICIAL != null) && (PPRO_FONDOS_BID != null) &&
               (PPRO_NUMERO_CODIGO_OPERACION_P != null )&& (PPRO_NUMERO_CODIGO_PROYECTO_BI != null) &&
               (PPRO_NUMERO_CONTRATO != null) &&(PPRO_OBSERVACIONES != null)&& (PPRO_PLAZO != null) &&
               (PPRO_CODIGO_RAPIDO != null) &&(PPRO_PRESUPUESTO_INICIAL != null) &&(PPRO_PRESUPUESTO_CODIFICADO != null) &&
               (FK_PETAPRE_ID != null) &&(FK_PDE_DMEOR_CODIGO != null) &&(FK_PPRSE_ID_PER != null) &&
               (FK_PTICO_ID_PER!= null) && (FK_PTIPRE_ID_PER != null) &&(FK_PTIPO_ID_PER != null) &&
               (FK_PTIPRO_ID_PER != null) && (FK_PTIRE_ID_PER != null) &&(FK_PUNI_ID_PER != null) &&
               (PK_PPRO_CODIGO_UNICO != null)){
           String sql = "UPDATE PROJECTDP_PROYECTOS M\n" +
                   "SET M.PPRO_ANIO=?,\n" +
                   "M.PPRO_CANTIDAD_ANUAL=?,\n" +
                   "M.PPRO_CATALOGO_ELECTRONICO =?,\n" +
                   "M.PPRO_CODIGO_CATEGORIA_CPC=?,\n" +
                   "M.PPRO_CODIGO_SERCOP=?,\n" +
                   "M.PPRO_COSTO_UNITARIO=?,\n" +
                   "M.PPRO_CUATRIMESTRE_N1=?,\n" +
                   "M.PPRO_CUATRIMESTRE_N2=?,\n" +
                   "M.PPRO_CUATRIMESTRE_N3=?,\n" +
                   "M.PPRO_DETALLE_PRODUCTO=?,\n" +
                   "M.PPRO_FECHA_FINAL=TO_DATE(?, 'MM/DD/YYYY'),\n" +
                   "M.PPRO_FECHA_INICIAL=TO_DATE(?, 'MM/DD/YYYY'),\n" +
                   "M.PPRO_FONDOS_BID=?,\n" +
                   "M.PPRO_NUMERO_CODIGO_OPERACION_P=?,\n" +
                   "M.PPRO_NUMERO_CODIGO_PROYECTO_BI=?,\n" +
                   "M.PPRO_NUMERO_CONTRATO=?,\n" +
                   "M.PPRO_OBSERVACIONES=?,\n" +
                   "M.PPRO_PLAZO=?,\n" +
                   "M.PPRO_CODIGO_RAPIDO=?,\n" +
                   "M.PPRO_PRESUPUESTO_INICIAL=?,\n" +
                   "M.PPRO_PRESUPUESTO_CODIFICADO=?,\n" +
                   "M.FK_PETAPRE_ID=?,\n" +
                   "M.FK_PDE_DMEOR_CODIGO=?,\n" +
                   "M.FK_PPRSE_ID_PER=?,\n" +
                   "M.FK_PTICO_ID_PER=?,\n" +
                   "M.FK_PTIPRE_ID_PER=?,\n" +
                   "M.FK_PTIPO_ID_PER=?,\n" +
                   "M.FK_PTIPRO_ID_PER=?,\n" +
                   "M.FK_PTIRE_ID_PER =?,\n" +
                   "M.FK_PUNI_ID_PER = ?\n" +
                   "WHERE M.PK_PPRO_CODIGO_UNICO = ?";
           jdbcTemplate.update(sql, PPRO_ANIO,PPRO_CANTIDAD_ANUAL,PPRO_CATALOGO_ELECTRONICO,PPRO_CODIGO_CATEGORIA_CPC,
                   PPRO_CODIGO_SERCOP, PPRO_COSTO_UNITARIO, PPRO_CUATRIMESTRE_N1,PPRO_CUATRIMESTRE_N2,PPRO_CUATRIMESTRE_N3,
                   PPRO_DETALLE_PRODUCTO, PPRO_FECHA_FINAL, PPRO_FECHA_INICIAL, PPRO_FONDOS_BID, PPRO_NUMERO_CODIGO_OPERACION_P,
                   PPRO_NUMERO_CODIGO_PROYECTO_BI, PPRO_NUMERO_CONTRATO, PPRO_OBSERVACIONES, PPRO_PLAZO, PPRO_CODIGO_RAPIDO,
                   PPRO_PRESUPUESTO_INICIAL, PPRO_PRESUPUESTO_CODIFICADO,FK_PETAPRE_ID, FK_PDE_DMEOR_CODIGO,FK_PPRSE_ID_PER,
                   FK_PTICO_ID_PER,FK_PTIPRE_ID_PER,FK_PTIPO_ID_PER, FK_PTIPRO_ID_PER,FK_PTIRE_ID_PER,FK_PUNI_ID_PER,PK_PPRO_CODIGO_UNICO);
       }
    }
}

class MatrizMapper implements RowMapper<Matriz> {
    @Override
    public Matriz mapRow(ResultSet rs, int rowNum) throws SQLException {
        Matriz matriz = new Matriz();

        matriz.setPK_PPRO_CODIGO_UNICO(rs.getInt("PK_PPRO_CODIGO_UNICO"));
        matriz.setPPRO_CODIGO_CATEGORIA_CPC(rs.getFloat("PPRO_CODIGO_CATEGORIA_CPC"));
        matriz.setPPRO_DETALLE_PRODUCTO(rs.getString("PPRO_DETALLE_PRODUCTO"));
        matriz.setPPRO_CUATRIMESTRE_N1(rs.getString("PPRO_CUATRIMESTRE_N1"));
        matriz.setPPRO_CUATRIMESTRE_N2(rs.getString("PPRO_CUATRIMESTRE_N2"));
        matriz.setPPRO_CUATRIMESTRE_N3(rs.getString("PPRO_CUATRIMESTRE_N3"));
        matriz.setPPRO_CATALOGO_ELECTRONICO(rs.getString("PPRO_CATALOGO_ELECTRONICO"));
        matriz.setPPRO_FONDOS_BID(rs.getString("PPRO_FONDOS_BID"));
        matriz.setPPRO_NUMERO_CODIGO_OPERACION_P(rs.getString("PPRO_NUMERO_CODIGO_OPERACION_P"));
        matriz.setPPRO_NUMERO_CODIGO_PROYECTO_BI(rs.getString("PPRO_NUMERO_CODIGO_PROYECTO_BI"));
        matriz.setPPRO_PLAZO(rs.getString("PPRO_PLAZO"));
        matriz.setPPRO_FECHA_INICIAL(rs.getDate("PPRO_FECHA_INICIAL"));
        matriz.setPPRO_FECHA_FINAL(rs.getDate("PPRO_FECHA_FINAL"));
        matriz.setPPRO_OBSERVACIONES(rs.getString("PPRO_OBSERVACIONES"));
        matriz.setPPRO_NUMERO_CONTRATO(rs.getString("PPRO_NUMERO_CONTRATO"));
        matriz.setPPRO_CODIGO_SERCOP(rs.getString("PPRO_CODIGO_SERCOP"));
        matriz.setPPRO_CANTIDAD_ANUAL(rs.getString("PPRO_CANTIDAD_ANUAL"));
        matriz.setPPRO_COSTO_UNITARIO(rs.getInt("PPRO_COSTO_UNITARIO"));
        matriz.setPPRO_ANIO(rs.getString("PPRO_ANIO"));

        matriz.setPPRO_CODIGO_RAPIDO(rs.getString("PPRO_CODIGO_RAPIDO"));
        matriz.setPPRO_PRESUPUESTO_INICIAL(rs.getFloat("PPRO_PRESUPUESTO_INICIAL"));
        matriz.setPPRO_PRESUPUESTO_CODIFICADO(rs.getFloat("PPRO_PRESUPUESTO_CODIFICADO"));
        matriz.setPETAPRE_ETAPA_PRESUPUESTO(rs.getString("PETAPRE_ETAPA_PRESUPUESTO"));

        matriz.setPK_PETAPRE_ID(rs.getString("PK_PETAPRE_ID"));



        matriz.setPAC_ACTIVIDAD_ENERO(rs.getString("PAC_ACTIVIDAD_ENERO"));
        matriz.setPAC_ACTIVIDAD_FEBRERO(rs.getString("PAC_ACTIVIDAD_FEBRERO"));
        matriz.setPAC_ACTIVIDAD_MARZO(rs.getString("PAC_ACTIVIDAD_MARZO"));
        matriz.setPAC_ACTIVIDAD_ABRIL(rs.getString("PAC_ACTIVIDAD_ABRIL"));
        matriz.setPAC_ACTIVIDAD_MAYO(rs.getString("PAC_ACTIVIDAD_MAYO"));
        matriz.setPAC_ACTIVIDAD_JUNIO(rs.getString("PAC_ACTIVIDAD_JUNIO"));
        matriz.setPAC_ACTIVIDAD_JULIO(rs.getString("PAC_ACTIVIDAD_JULIO"));
        matriz.setPAC_ACTIVIDAD_AGOSTO(rs.getString("PAC_ACTIVIDAD_AGOSTO"));
        matriz.setPAC_ACTIVIDAD_SEPTIEMBRE(rs.getString("PAC_ACTIVIDAD_SEPTIEMBRE"));
        matriz.setPAC_ACTIVIDAD_OCTUBRE(rs.getString("PAC_ACTIVIDAD_OCTUBRE"));
        matriz.setPAC_ACTIVIDAD_NOVIEMBRE(rs.getString("PAC_ACTIVIDAD_NOVIEMBRE"));
        matriz.setPAC_ACTIVIDAD_DICIEMBRE(rs.getString("PAC_ACTIVIDAD_DICIEMBRE"));

        matriz.setPPRES_ACTIVIDAD_ENERO(rs.getFloat("PPRES_ACTIVIDAD_ENERO"));
        matriz.setPPRES_ACTIVIDAD_FEBRERO(rs.getFloat("PPRES_ACTIVIDAD_FEBRERO"));
        matriz.setPPRES_ACTIVIDAD_MARZO(rs.getFloat("PPRES_ACTIVIDAD_MARZO"));
        matriz.setPPRES_ACTIVIDAD_ABRIL(rs.getFloat("PPRES_ACTIVIDAD_ABRIL"));
        matriz.setPPRES_ACTIVIDAD_MAYO(rs.getFloat("PPRES_ACTIVIDAD_MAYO"));
        matriz.setPPRES_ACTIVIDAD_JUNIO(rs.getFloat("PPRES_ACTIVIDAD_JUNIO"));
        matriz.setPPRES_ACTIVIDAD_JULIO(rs.getFloat("PPRES_ACTIVIDAD_JULIO"));
        matriz.setPPRES_ACTIVIDAD_AGOSTO(rs.getFloat("PPRES_ACTIVIDAD_AGOSTO"));
        matriz.setPPRES_ACTIVIDAD_SEPTIEMBRE(rs.getFloat("PPRES_ACTIVIDAD_SEPTIEMBRE"));
        matriz.setPPRES_ACTIVIDAD_OCTUBRE(rs.getFloat("PPRES_ACTIVIDAD_OCTUBRE"));
        matriz.setPPRES_ACTIVIDAD_NOVIEMBRE(rs.getFloat("PPRES_ACTIVIDAD_NOVIEMBRE"));
        matriz.setPPRES_ACTIVIDAD_DICIEMBRE(rs.getFloat("PPRES_ACTIVIDAD_DICIEMBRE"));

        matriz.setPCER_ACTIVIDAD_ENERO(rs.getFloat("PCER_ACTIVIDAD_ENERO"));
        matriz.setPCER_ACTIVIDAD_FEBRERO(rs.getFloat("PCER_ACTIVIDAD_FEBRERO"));
        matriz.setPCER_ACTIVIDAD_MARZO(rs.getFloat("PCER_ACTIVIDAD_MARZO"));
        matriz.setPCER_ACTIVIDAD_ABRIL(rs.getFloat("PCER_ACTIVIDAD_ABRIL"));
        matriz.setPCER_ACTIVIDAD_MAYO(rs.getFloat("PCER_ACTIVIDAD_MAYO"));
        matriz.setPCER_ACTIVIDAD_JUNIO(rs.getFloat("PCER_ACTIVIDAD_JUNIO"));
        matriz.setPCER_ACTIVIDAD_JULIO(rs.getFloat("PCER_ACTIVIDAD_JULIO"));
        matriz.setPCER_ACTIVIDAD_AGOSTO(rs.getFloat("PCER_ACTIVIDAD_AGOSTO"));
        matriz.setPCER_ACTIVIDAD_SEPTIEMBRE(rs.getFloat("PCER_ACTIVIDAD_SEPTIEMBRE"));
        matriz.setPCER_ACTIVIDAD_OCTUBRE(rs.getFloat("PCER_ACTIVIDAD_OCTUBRE"));
        matriz.setPCER_ACTIVIDAD_NOVIEMBRE(rs.getFloat("PCER_ACTIVIDAD_NOVIEMBRE"));
        matriz.setPCER_ACTIVIDAD_DICIEMBRE(rs.getFloat("PCER_ACTIVIDAD_DICIEMBRE"));

        matriz.setPPAG_ACTIVIDAD_ENERO(rs.getFloat("PPAG_ACTIVIDAD_ENERO"));
        matriz.setPPAG_ACTIVIDAD_FEBRERO(rs.getFloat("PPAG_ACTIVIDAD_FEBRERO"));
        matriz.setPPAG_ACTIVIDAD_MARZO(rs.getFloat("PPAG_ACTIVIDAD_MARZO"));
        matriz.setPPAG_ACTIVIDAD_ABRIL(rs.getFloat("PPAG_ACTIVIDAD_ABRIL"));
        matriz.setPPAG_ACTIVIDAD_MAYO(rs.getFloat("PPAG_ACTIVIDAD_MAYO"));
        matriz.setPPAG_ACTIVIDAD_JUNIO(rs.getFloat("PPAG_ACTIVIDAD_JUNIO"));
        matriz.setPPAG_ACTIVIDAD_JULIO(rs.getFloat("PPAG_ACTIVIDAD_JULIO"));
        matriz.setPPAG_ACTIVIDAD_AGOSTO(rs.getFloat("PPAG_ACTIVIDAD_AGOSTO"));
        matriz.setPPAG_ACTIVIDAD_SEPTIEMBRE(rs.getFloat("PPAG_ACTIVIDAD_SEPTIEMBRE"));
        matriz.setPPAG_ACTIVIDAD_OCTUBRE(rs.getFloat("PPAG_ACTIVIDAD_OCTUBRE"));
        matriz.setPPAG_ACTIVIDAD_NOVIEMBRE(rs.getFloat("PPAG_ACTIVIDAD_NOVIEMBRE"));
        matriz.setPPAG_ACTIVIDAD_DICIEMBRE(rs.getFloat("PPAG_ACTIVIDAD_DICIEMBRE"));







        matriz.setPDE_DEPARTAMENTO(rs.getString("PDE_DEPARTAMENTO"));
        matriz.setPK_PDE_DMEOR_CODIGO(rs.getString("PK_PDE_DMEOR_CODIGO"));

        matriz.setPRETE_NOMBRE(rs.getString("PRETE_NOMBRE"));
        matriz.setPRETE_APELLIDO(rs.getString("PRETE_APELLIDO"));

        matriz.setPPAPRE_PARTIDA_PRESUPUESTARIA(rs.getString("PPAPRE_PARTIDA_PRESUPUESTARIA"));

        matriz.setPPOAVFIDE_PORCENTAJE_AVANCE_FI(rs.getFloat("PORCENTAJE"));

        matriz.setPPOAVFIDE_OBSERVACIONES_PA(rs.getString("PPOAVFIDE_OBSERVACIONES_PA"));
        matriz.setPPOAVFIDE_FECHA_PA(rs.getDate("PPOAVFIDE_FECHA_PA"));

        matriz.setPPRSE_PROCEDIMIENTO_SERCOP(rs.getString("PPRSE_PROCEDIMIENTO_SERCOP"));
        matriz.setPK_PPRSE_ID(rs.getInt("PK_PPRSE_ID"));

        matriz.setPTICO_TIPO_COMPRA(rs.getString("PTICO_TIPO_COMPRA"));
        matriz.setPK_PTICO_ID(rs.getInt("PK_PTICO_ID"));

        matriz.setPTIPRE_TIPO_PRESUPUESTO(rs.getString("PTIPRE_TIPO_PRESUPUESTO"));
        matriz.setPK_PTIPRE_ID(rs.getInt("PK_PTIPRE_ID"));

        matriz.setPTIPO_TIPO_PRODUCTO(rs.getString("PTIPO_TIPO_PRODUCTO"));
        matriz.setPK_PTIPO_ID(rs.getInt("PK_PTIPO_ID"));

        matriz.setPTIPRO_TIPO_PROYECTO(rs.getString("PTIPRO_TIPO_PROYECTO"));
        matriz.setPK_PTIPRO_ID(rs.getInt("PK_PTIPRO_ID"));

        matriz.setPTIRE_TIPO_REGIMEN(rs.getString("PTIRE_TIPO_REGIMEN"));
        matriz.setPK_PTIRE_ID(rs.getInt("PK_PTIRE_ID"));

        matriz.setPUNI_UNIDAD(rs.getString("PUNI_UNIDAD"));
        matriz.setPK_PUNI_ID(rs.getInt("PK_PUNI_ID"));

        matriz.setPVADE_VALOR_DEVENGADO(rs.getFloat("PVADE_VALOR_DEVENGADO"));
        matriz.setPVADE_FECHA_VA(rs.getDate("PVADE_FECHA_VD"));
        matriz.setPVADE_OBSERVACIONES_VA(rs.getString("PVADE_OBSERVACIONES_VD"));
        matriz.setESTADO(rs.getString("ESTADO"));
        return matriz;
    }*/
}
