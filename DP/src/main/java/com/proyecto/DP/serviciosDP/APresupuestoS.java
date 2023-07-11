package com.proyecto.DP.serviciosDP;

import com.proyecto.DP.respositorioDP.APresupuestoR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class APresupuestoS implements APresupuestoR {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void actualizarAvancePrespuesto(Float PPRES_ACTIVIDAD_ENERO, Float PPRES_ACTIVIDAD_FEBRERO, Float PPRES_ACTIVIDAD_MARZO, Float PPRES_ACTIVIDAD_ABRIL, Float PPRES_ACTIVIDAD_MAYO, Float PPRES_ACTIVIDAD_JUNIO, Float PPRES_ACTIVIDAD_JULIO, Float PPRES_ACTIVIDAD_AGOSTO, Float PPRES_ACTIVIDAD_SEPTIEMBRE, Float PPRES_ACTIVIDAD_OCTUBRE, Float PPRES_ACTIVIDAD_NOVIEMBRE, Float PPRES_ACTIVIDAD_DICIEMBRE, Integer FK_PPRO_CODIGO_UNICO) {
        if ((PPRES_ACTIVIDAD_ENERO !=null) && (PPRES_ACTIVIDAD_FEBRERO !=null) && (PPRES_ACTIVIDAD_MARZO !=null) && (PPRES_ACTIVIDAD_ABRIL !=null) && (PPRES_ACTIVIDAD_MAYO !=null) &&
                (PPRES_ACTIVIDAD_JUNIO !=null) && (PPRES_ACTIVIDAD_JULIO !=null) && (PPRES_ACTIVIDAD_AGOSTO !=null) && (PPRES_ACTIVIDAD_SEPTIEMBRE !=null) &&
                (PPRES_ACTIVIDAD_OCTUBRE !=null) && (PPRES_ACTIVIDAD_NOVIEMBRE !=null) && (PPRES_ACTIVIDAD_DICIEMBRE !=null)){
            String sql ="UPDATE PROYECTDP_PRESUPUESTO P\n" +
                    "SET     P.PPRES_ACTIVIDAD_ENERO=?,\n" +
                    "        P.PPRES_ACTIVIDAD_FEBRERO=?,\n" +
                    "        P.PPRES_ACTIVIDAD_MARZO=?,\n" +
                    "        P.PPRES_ACTIVIDAD_ABRIL=?,\n" +
                    "        P.PPRES_ACTIVIDAD_MAYO=?,\n" +
                    "        P.PPRES_ACTIVIDAD_JUNIO=?,\n" +
                    "        P.PPRES_ACTIVIDAD_JULIO=?,\n" +
                    "        P.PPRES_ACTIVIDAD_AGOSTO=?,\n" +
                    "        P.PPRES_ACTIVIDAD_SEPTIEMBRE=?,\n" +
                    "        P.PPRES_ACTIVIDAD_OCTUBRE=?,\n" +
                    "        P.PPRES_ACTIVIDAD_NOVIEMBRE=?,\n" +
                    "        P.PPRES_ACTIVIDAD_DICIEMBRE=?\n" +
                    "WHERE P.FK_PPRO_CODIGO_UNICO = ?";
            jdbcTemplate.update(sql,PPRES_ACTIVIDAD_ENERO,PPRES_ACTIVIDAD_FEBRERO, PPRES_ACTIVIDAD_MARZO, PPRES_ACTIVIDAD_ABRIL,PPRES_ACTIVIDAD_MAYO,PPRES_ACTIVIDAD_JUNIO,PPRES_ACTIVIDAD_JULIO,PPRES_ACTIVIDAD_AGOSTO,
                    PPRES_ACTIVIDAD_SEPTIEMBRE,PPRES_ACTIVIDAD_OCTUBRE,PPRES_ACTIVIDAD_NOVIEMBRE,PPRES_ACTIVIDAD_DICIEMBRE,FK_PPRO_CODIGO_UNICO);
        }
    }
}
