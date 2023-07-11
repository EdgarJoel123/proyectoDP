package com.proyecto.DP.serviciosDP;

import com.proyecto.DP.modeloDP.Departamento;
import com.proyecto.DP.respositorioDP.DepartamentoR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


@Service
public class DepartamentoS implements DepartamentoR {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<Departamento> ListarDepartamento() {
        String sql = "SELECT *\n" +
                "FROM PROJECTDP_DEPARTAMENTO";

        return jdbcTemplate.query(sql, new DepartamentoMapper());

    }
    class  DepartamentoMapper implements RowMapper<Departamento>{

        @Override
        public Departamento mapRow(ResultSet rs, int rowNum) throws SQLException {
            Departamento departamento = new Departamento();
            departamento.setPDE_DEPARTAMENTO(rs.getString("PDE_DEPARTAMENTO"));
            departamento.setPK_PDE_DMEOR_CODIGO(rs.getString("PK_PDE_DMEOR_CODIGO"));
            return departamento;
        }
    }
}
