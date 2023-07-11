package com.proyecto.DP.serviciosDP;


import com.proyecto.DP.modeloDP.Partida_Presupuestaria;
import com.proyecto.DP.respositorioDP.Partida_PresupuestariaR;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class Partida_PresupuestariaS implements Partida_PresupuestariaR {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public void actualizarPartidaPresuúestaria(String PPAPRE_PARTIDA_PRESUPUESTARIA, Integer FK_PPRO_CODIGO_UNICO) {

        if (PPAPRE_PARTIDA_PRESUPUESTARIA != null) {
            String sql = "UPDATE PROJECTDP_PARTIDA_PRESUPUESTAR PP\n" +
                    "SET   PP.PPAPRE_PARTIDA_PRESUPUESTARIA= ? \n" +
                    "WHERE PP.FK_PPRO_CODIGO_UNICO= ? ";
            jdbcTemplate.update(sql, PPAPRE_PARTIDA_PRESUPUESTARIA, FK_PPRO_CODIGO_UNICO);
        }

    }

}
