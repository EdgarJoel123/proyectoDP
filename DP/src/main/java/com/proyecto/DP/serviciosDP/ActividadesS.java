package com.proyecto.DP.serviciosDP;


import com.proyecto.DP.modeloDP.Actividades;
import com.proyecto.DP.respositorioDP.ActividadesR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public  class ActividadesS implements  ActividadesR{
   @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public void actualizarAvanceFisico(String PAC_ACTIVIDAD_ENERO, String PAC_ACTIVIDAD_FEBRERO, String PAC_ACTIVIDAD_MARZO, String PAC_ACTIVIDAD_ABRIL, String PAC_ACTIVIDAD_MAYO, String PAC_ACTIVIDAD_JUNIO, String PAC_ACTIVIDAD_JULIO, String PAC_ACTIVIDAD_AGOSTO, String PAC_ACTIVIDAD_SEPTIEMBRE, String PAC_ACTIVIDAD_OCTUBRE, String PAC_ACTIVIDAD_NOVIEMBRE, String PAC_ACTIVIDAD_DICIEMBRE, Integer FK_PPRO_CODIGO_UNICO) {
        if ((PAC_ACTIVIDAD_ENERO !=null) && (PAC_ACTIVIDAD_FEBRERO !=null) && (PAC_ACTIVIDAD_MARZO !=null) && (PAC_ACTIVIDAD_ABRIL !=null) && (PAC_ACTIVIDAD_MAYO !=null) &&
                (PAC_ACTIVIDAD_JUNIO !=null) && (PAC_ACTIVIDAD_JULIO !=null) && (PAC_ACTIVIDAD_AGOSTO !=null) && (PAC_ACTIVIDAD_SEPTIEMBRE !=null) &&
                (PAC_ACTIVIDAD_OCTUBRE !=null) && (PAC_ACTIVIDAD_NOVIEMBRE !=null) && (PAC_ACTIVIDAD_DICIEMBRE !=null)){
            String sql ="UPDATE PROJECTDP_ACTIVIDADES A\n" +
                    "SET A.PAC_ACTIVIDAD_ENERO=?,\n" +
                    "    A.PAC_ACTIVIDAD_FEBRERO=?,\n" +
                    "    A.PAC_ACTIVIDAD_MARZO=?,\n" +
                    "    A.PAC_ACTIVIDAD_ABRIL=?,\n" +
                    "    A.PAC_ACTIVIDAD_MAYO=?,\n" +
                    "    A.PAC_ACTIVIDAD_JUNIO=?,\n" +
                    "    A.PAC_ACTIVIDAD_JULIO=?,\n" +
                    "    A.PAC_ACTIVIDAD_AGOSTO=?,\n" +
                    "    A.PAC_ACTIVIDAD_SEPTIEMBRE=?,\n" +
                    "    A.PAC_ACTIVIDAD_OCTUBRE=?,\n" +
                    "    A.PAC_ACTIVIDAD_NOVIEMBRE=?,\n" +
                    "    A.PAC_ACTIVIDAD_DICIEMBRE=? \n" +
                    "WHERE A.FK_PER_CODIGO_UNICO = ?";
            jdbcTemplate.update(sql,PAC_ACTIVIDAD_ENERO,PAC_ACTIVIDAD_FEBRERO, PAC_ACTIVIDAD_MARZO, PAC_ACTIVIDAD_ABRIL,PAC_ACTIVIDAD_MAYO,PAC_ACTIVIDAD_JUNIO,PAC_ACTIVIDAD_JULIO,PAC_ACTIVIDAD_AGOSTO,
                    PAC_ACTIVIDAD_SEPTIEMBRE,PAC_ACTIVIDAD_OCTUBRE,PAC_ACTIVIDAD_NOVIEMBRE,PAC_ACTIVIDAD_DICIEMBRE,FK_PPRO_CODIGO_UNICO);
        }
    }
}
