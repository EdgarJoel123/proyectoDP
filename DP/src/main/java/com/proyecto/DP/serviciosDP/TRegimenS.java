package com.proyecto.DP.serviciosDP;


import com.proyecto.DP.modeloDP.TRegimen;
import com.proyecto.DP.respositorioDP.TRegimenR;
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
public class TRegimenS implements TRegimenR {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<TRegimen> listarTRegimen() {
        String sql = "SELECT *\n" +
                "FROM PROJECTDP_TIPO_REGIMEN";

        return jdbcTemplate.query(sql, new TRegimenMapper());

    }

    class TRegimenMapper implements RowMapper<TRegimen>{

        @Override
        public TRegimen mapRow(ResultSet rs, int rowNum) throws SQLException {
            TRegimen tRegimen = new TRegimen();
             tRegimen.setPTIRE_TIPO_REGIMEN(rs.getString("PTIRE_TIPO_REGIMEN"));
             tRegimen.setPK_PTIRE_ID(rs.getInt("PK_PTIRE_ID"));
            return tRegimen;
        }
    }
}
