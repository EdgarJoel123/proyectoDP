package com.proyecto.DP.serviciosDP;


import com.proyecto.DP.modeloDP.TProyecto;
import com.proyecto.DP.respositorioDP.TProyectoR;
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
public class TProyectoS implements TProyectoR {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<TProyecto> listaProyectos() {
        String sql = "SELECT *\n" +
                "FROM PROJECTDP_TIPO_PROYECTO";
        return jdbcTemplate.query(sql, new TproyectoMapper());
    }
    class TproyectoMapper implements RowMapper<TProyecto>{

        @Override
        public TProyecto mapRow(ResultSet rs, int rowNum) throws SQLException {
            TProyecto tProyecto = new TProyecto();
            tProyecto.setPTIPRO_TIPO_PROYECTO(rs.getString("PTIPRO_TIPO_PROYECTO"));
            tProyecto.setPK_PTIPRO_ID(rs.getInt("PK_PTIPRO_ID"));
            return tProyecto;
        }
    }
}
