package com.proyecto.DP.serviciosDP;


import com.proyecto.DP.modeloDP.Procedimiento_Sercop;
import com.proyecto.DP.respositorioDP.Procedimiento_SercopR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class Procedimiento_SercopS implements Procedimiento_SercopR {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Procedimiento_Sercop> listarProcedmientos() {
        String sql= "SELECT *\n" +
                "FROM PROJECTDP_PROCEDIMIENTO_SERCOP";
        return jdbcTemplate.query(sql, new ProcedmientoMapper());
    }

    class ProcedmientoMapper implements RowMapper<Procedimiento_Sercop>{

        @Override
        public Procedimiento_Sercop mapRow(ResultSet rs, int rowNum) throws SQLException {
            Procedimiento_Sercop procedimiento_sercop = new Procedimiento_Sercop();
            procedimiento_sercop.setPK_PPRSE_ID(rs.getInt("PK_PPRSE_ID"));
            procedimiento_sercop.setPPRSE_PROCEDIMIENTO_SERCOP(rs.getString("PPRSE_PROCEDIMIENTO_SERCOP"));
            return procedimiento_sercop;
        }
    }
}
