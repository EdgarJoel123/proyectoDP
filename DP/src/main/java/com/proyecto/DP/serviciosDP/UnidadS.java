package com.proyecto.DP.serviciosDP;

import com.proyecto.DP.modeloDP.Actividades;
import com.proyecto.DP.modeloDP.Unidad;
import com.proyecto.DP.respositorioDP.UnidadR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
public class UnidadS implements UnidadR {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Unidad> listarUnidades() {
        String sql = "SELECT *\n" +
                "FROM PROJECTDP_UNIDAD";

        return jdbcTemplate.query(sql, new  UnidadMapper());
    }
    class  UnidadMapper implements RowMapper<Unidad>{

        @Override
        public Unidad mapRow(ResultSet rs, int rowNum) throws SQLException {
            Unidad unidad = new Unidad();
            unidad.setPUNI_UNIDAD(rs.getString("PUNI_UNIDAD"));
            unidad.setPK_PUNI_ID(rs.getInt("PK_PUNI_ID"));
            return unidad;
        }
    }
}
