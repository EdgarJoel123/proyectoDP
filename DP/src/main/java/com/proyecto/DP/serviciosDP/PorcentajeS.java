package com.proyecto.DP.serviciosDP;

import com.proyecto.DP.modeloDP.Porcentaje;
import com.proyecto.DP.respositorioDP.PorcentajeeR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class PorcentajeS implements PorcentajeeR{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void actualizarPorcentaje(Float PPOAVFIDE_PORCENTAJE_AVANCE_FI, String PPOAVFIDE_OBSERVACIONES_PA, Integer FK_PPRO_CODIGO_UNICO) {
        if ((PPOAVFIDE_PORCENTAJE_AVANCE_FI != null) &&
                (PPOAVFIDE_OBSERVACIONES_PA != null)){
            String sql ="UPDATE PROJECTDP_PORCENTAJE_AVANCE_FI PA\n" +
                    "SET PA.PPOAVFIDE_PORCENTAJE_AVANCE_FI=?,\n" +
                    "    PA.PPOAVFIDE_FECHA_PA=TO_DATE(TO_CHAR(SYSDATE, 'DD-MM-YYYY'), 'DD-MM-YYYY'),\n" +
                    "    PA.PPOAVFIDE_OBSERVACIONES_PA=?\n" +
                    "WHERE PA.FK_PPRO_CODIGO_UNICO=?";
            jdbcTemplate.update(sql,PPOAVFIDE_PORCENTAJE_AVANCE_FI, PPOAVFIDE_OBSERVACIONES_PA, FK_PPRO_CODIGO_UNICO);

        }
    }
}
