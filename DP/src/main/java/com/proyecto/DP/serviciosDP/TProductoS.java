package com.proyecto.DP.serviciosDP;


import com.proyecto.DP.modeloDP.TProducto;
import com.proyecto.DP.respositorioDP.TProductoR;
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
public class TProductoS implements TProductoR {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<TProducto> listaTProducto() {

        String sql = "SELECT *\n" +
                "FROM PROJECTDP_TIPO_PRODUCTO";

        return jdbcTemplate.query(sql, new TProductoMapper());
    }
 class  TProductoMapper implements RowMapper<TProducto>{

     @Override
     public TProducto mapRow(ResultSet rs, int rowNum) throws SQLException {
         TProducto tProducto = new TProducto();
         tProducto.setPTIPO_TIPO_PRODUCTO(rs.getString("PTIPO_TIPO_PRODUCTO"));
         tProducto.setPK_PTIPO_ID(rs.getInt("PK_PTIPO_ID"));

         return tProducto;


     }
 }


}
