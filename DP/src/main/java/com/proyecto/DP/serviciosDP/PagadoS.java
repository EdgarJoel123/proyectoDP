package com.proyecto.DP.serviciosDP;

import com.proyecto.DP.respositorioDP.PagadaR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class PagadoS implements PagadaR {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void actualizarAvancePagado(Float PPAG_ACTIVIDAD_ENERO, Float PPAG_ACTIVIDAD_FEBRERO, Float PPAG_ACTIVIDAD_MARZO, Float PPAG_ACTIVIDAD_ABRIL, Float PPAG_ACTIVIDAD_MAYO, Float PPAG_ACTIVIDAD_JUNIO, Float PPAG_ACTIVIDAD_JULIO, Float PPAG_ACTIVIDAD_AGOSTO, Float PPAG_ACTIVIDAD_SEPTIEMBRE, Float PPAG_ACTIVIDAD_OCTUBRE, Float PPAG_ACTIVIDAD_NOVIEMBRE, Float PPAG_ACTIVIDAD_DICIEMBRE, Integer FK_PPRO_CODIGO_UNICO) {
        if ((PPAG_ACTIVIDAD_ENERO !=null) && (PPAG_ACTIVIDAD_FEBRERO !=null) && (PPAG_ACTIVIDAD_MARZO !=null) && (PPAG_ACTIVIDAD_ABRIL !=null) && (PPAG_ACTIVIDAD_MAYO !=null) &&
                (PPAG_ACTIVIDAD_JUNIO !=null) && (PPAG_ACTIVIDAD_JULIO !=null) && (PPAG_ACTIVIDAD_AGOSTO !=null) && (PPAG_ACTIVIDAD_SEPTIEMBRE !=null) &&
                (PPAG_ACTIVIDAD_OCTUBRE !=null) && (PPAG_ACTIVIDAD_NOVIEMBRE !=null) && (PPAG_ACTIVIDAD_DICIEMBRE !=null)){
            String sql ="UPDATE PROYECTDP_PAGADO PA\n" +
                    "SET     PA.PPAG_ACTIVIDAD_ENERO=?,\n" +
                    "        PA.PPAG_ACTIVIDAD_FEBRERO=?,\n" +
                    "        PA.PPAG_ACTIVIDAD_MARZO=?,\n" +
                    "        PA.PPAG_ACTIVIDAD_ABRIL=?,\n" +
                    "        PA.PPAG_ACTIVIDAD_MAYO=?,\n" +
                    "        PA.PPAG_ACTIVIDAD_JUNIO=?,\n" +
                    "        PA.PPAG_ACTIVIDAD_JULIO=?,\n" +
                    "        PA.PPAG_ACTIVIDAD_AGOSTO=?,\n" +
                    "        PA.PPAG_ACTIVIDAD_SEPTIEMBRE=?,\n" +
                    "        PA.PPAG_ACTIVIDAD_OCTUBRE=?,\n" +
                    "        PA.PPAG_ACTIVIDAD_NOVIEMBRE=?,\n" +
                    "        PA.PPAG_ACTIVIDAD_DICIEMBRE=?\n" +
                    "WHERE PA.FK_PPRO_CODIGO_UNICO=?\n";
            jdbcTemplate.update(sql,PPAG_ACTIVIDAD_ENERO,PPAG_ACTIVIDAD_FEBRERO, PPAG_ACTIVIDAD_MARZO, PPAG_ACTIVIDAD_ABRIL,PPAG_ACTIVIDAD_MAYO,PPAG_ACTIVIDAD_JUNIO,PPAG_ACTIVIDAD_JULIO,PPAG_ACTIVIDAD_AGOSTO,
                    PPAG_ACTIVIDAD_SEPTIEMBRE,PPAG_ACTIVIDAD_OCTUBRE,PPAG_ACTIVIDAD_NOVIEMBRE,PPAG_ACTIVIDAD_DICIEMBRE,FK_PPRO_CODIGO_UNICO);
        }
    }
}
