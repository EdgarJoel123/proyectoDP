package com.proyecto.DP.serviciosDP;


import com.proyecto.DP.modeloDP.ETPresupuestaria;
import com.proyecto.DP.respositorioDP.ETPresupuestarioR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
public class ETPresupuestariaS implements ETPresupuestarioR {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<com.proyecto.DP.modeloDP.ETPresupuestaria> listarEtapaPrespuestaria() {
        String sql = "SELECT *\n" +
                "FROM PROYECTDP_ETAPA_PRESUPUESTO";



        return jdbcTemplate.query(sql, new ETPresupuestariaMapper());


    }

    class ETPresupuestariaMapper implements RowMapper<ETPresupuestaria> {


        @Override
        public com.proyecto.DP.modeloDP.ETPresupuestaria mapRow(ResultSet rs, int rowNum) throws SQLException {
            ETPresupuestaria etPresupuestaria = new com.proyecto.DP.modeloDP.ETPresupuestaria();
            etPresupuestaria.setPK_PETAPRE_ID(rs.getString("PK_PETAPRE_ID"));
            etPresupuestaria.setPETAPRE_ETAPA_PRESUPUESTO(rs.getString("PETAPRE_ETAPA_PRESUPUESTO"));

            return etPresupuestaria;
        }
    }
}
