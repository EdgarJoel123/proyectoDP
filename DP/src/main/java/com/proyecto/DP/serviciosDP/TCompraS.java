package com.proyecto.DP.serviciosDP;


import com.proyecto.DP.modeloDP.TCompra;
import com.proyecto.DP.respositorioDP.TCompraR;
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
public class TCompraS implements TCompraR {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<TCompra> listarTipoCompra() {

        String sql  = "SELECT *\n" +
                "FROM PROJECTDP_TIPO_COMPRA";
        return jdbcTemplate.query(sql, new TCompraMapper());
    }
    class TCompraMapper implements RowMapper<TCompra>{

        @Override
        public TCompra mapRow(ResultSet rs, int rowNum) throws SQLException {
            TCompra tCompra = new TCompra();
            tCompra.setPK_PTICO_ID(rs.getInt("PK_PTICO_ID"));
            tCompra.setPTICO_TIPO_COMPRA(rs.getString("PTICO_TIPO_COMPRA"));
            return tCompra;
        }
    }

}
