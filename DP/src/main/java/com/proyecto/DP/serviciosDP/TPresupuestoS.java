package com.proyecto.DP.serviciosDP;


import com.proyecto.DP.modeloDP.TPresupuesto;
import com.proyecto.DP.respositorioDP.TPresupuestoR;
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
public class TPresupuestoS implements TPresupuestoR {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<TPresupuesto> listarPresupuesto() {

        String sql = "SELECT *\n" +
                "FROM PROJECTDP_TIPO_PRESUPUESTO";
        return jdbcTemplate.query(sql, new TPresupuetoMapper());

    }
    class TPresupuetoMapper implements RowMapper<TPresupuesto>{

        @Override
        public TPresupuesto mapRow(ResultSet rs, int rowNum) throws SQLException {
            TPresupuesto tPresupuesto = new TPresupuesto();
            tPresupuesto.setPTIPRE_TIPO_PRESUPUESTO(rs.getString("PTIPRE_TIPO_PRESUPUESTO"));
            tPresupuesto.setPK_PTIPRE_ID(rs.getInt("PK_PTIPRE_ID"));
            return tPresupuesto;
        }
    }
}
