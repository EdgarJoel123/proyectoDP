package com.proyecto.DP.serviciosDP;


import com.proyecto.DP.modeloDP.Valor_Devengado;
import com.proyecto.DP.respositorioDP.Valor_DevengadoR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class Valor_DevengadoS implements Valor_DevengadoR {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void actualizarValorDevengado(Float PVADE_VALOR_DEVENGADO, String PVADE_OBSERVACIONES_VD, Integer FK_PPRO_CODIGO_UNICO) {

        if ((PVADE_VALOR_DEVENGADO != null) && (PVADE_OBSERVACIONES_VD != null)) {
            String sql = "UPDATE PROJECTDP_VALOR_DEVENGADO VA\n" +
                    "SET VA.PVADE_VALOR_DEVENGADO=?, \n" +
                    "    VA.PVADE_FECHA_VD=TO_DATE(TO_CHAR(SYSDATE, 'DD-MM-YYYY'), 'DD-MM-YYYY'),\n" +
                    "    VA.PVADE_OBSERVACIONES_VD=?\n" +
                    "WHERE  VA.FK_PPRO_CODIGO_UNICO=?";
            jdbcTemplate.update(sql, PVADE_VALOR_DEVENGADO, PVADE_OBSERVACIONES_VD, FK_PPRO_CODIGO_UNICO);
        }
    }
}
