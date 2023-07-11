package com.proyecto.DP.serviciosDP;

import com.proyecto.DP.respositorioDP.CertificadoR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class CertificadoS implements CertificadoR {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void actualizarAvanceCertificado(Float PCER_ACTIVIDAD_ENERO, Float PCER_ACTIVIDAD_FEBRERO, Float PCER_ACTIVIDAD_MARZO, Float PCER_ACTIVIDAD_ABRIL, Float PCER_ACTIVIDAD_MAYO, Float PCER_ACTIVIDAD_JUNIO, Float PCER_ACTIVIDAD_JULIO, Float PCER_ACTIVIDAD_AGOSTO, Float PCER_ACTIVIDAD_SEPTIEMBRE, Float PCER_ACTIVIDAD_OCTUBRE, Float PCER_ACTIVIDAD_NOVIEMBRE, Float PCER_ACTIVIDAD_DICIEMBRE, Integer FK_PPRO_CODIGO_UNICO) {
        if ((PCER_ACTIVIDAD_ENERO !=null) && (PCER_ACTIVIDAD_FEBRERO !=null) && (PCER_ACTIVIDAD_MARZO !=null) && (PCER_ACTIVIDAD_ABRIL !=null) && (PCER_ACTIVIDAD_MAYO !=null) &&
                (PCER_ACTIVIDAD_JUNIO !=null) && (PCER_ACTIVIDAD_JULIO !=null) && (PCER_ACTIVIDAD_AGOSTO !=null) && (PCER_ACTIVIDAD_SEPTIEMBRE !=null) &&
                (PCER_ACTIVIDAD_OCTUBRE !=null) && (PCER_ACTIVIDAD_NOVIEMBRE !=null) && (PCER_ACTIVIDAD_DICIEMBRE !=null)){
            String sql ="UPDATE PROYECTDP_CERTIFICADO C\n" +
                    "SET   C.PCER_ACTIVIDAD_ENERO=?,\n" +
                    "      C.PCER_ACTIVIDAD_FEBRERO=?,\n" +
                    "      C.PCER_ACTIVIDAD_MARZO=?,\n" +
                    "      C.PCER_ACTIVIDAD_ABRIL=?,\n" +
                    "      C.PCER_ACTIVIDAD_MAYO=?,\n" +
                    "      C.PCER_ACTIVIDAD_JUNIO=?,\n" +
                    "      C.PCER_ACTIVIDAD_JULIO=?,\n" +
                    "      C.PCER_ACTIVIDAD_AGOSTO=?,\n" +
                    "      C.PCER_ACTIVIDAD_SEPTIEMBRE=?,\n" +
                    "      C.PCER_ACTIVIDAD_OCTUBRE=?,\n" +
                    "      C.PCER_ACTIVIDAD_NOVIEMBRE=?,\n" +
                    "      C.PCER_ACTIVIDAD_DICIEMBRE=?\n" +
                    "WHERE C.FK_PPRO_CODIGO_UNICO=?";
            jdbcTemplate.update(sql,PCER_ACTIVIDAD_ENERO,PCER_ACTIVIDAD_FEBRERO, PCER_ACTIVIDAD_MARZO, PCER_ACTIVIDAD_ABRIL,PCER_ACTIVIDAD_MAYO,PCER_ACTIVIDAD_JUNIO,PCER_ACTIVIDAD_JULIO,PCER_ACTIVIDAD_AGOSTO,
                    PCER_ACTIVIDAD_SEPTIEMBRE,PCER_ACTIVIDAD_OCTUBRE,PCER_ACTIVIDAD_NOVIEMBRE,PCER_ACTIVIDAD_DICIEMBRE,FK_PPRO_CODIGO_UNICO);
        }
    }
}
