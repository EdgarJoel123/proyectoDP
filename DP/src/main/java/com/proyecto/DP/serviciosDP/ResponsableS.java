package com.proyecto.DP.serviciosDP;

import com.proyecto.DP.modeloDP.Matriz;
import com.proyecto.DP.respositorioDP.ResponsableR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ResponsableS implements ResponsableR {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<Matriz> findResponsable(String nombre, String apellido) {
        return null;
    }

    @Override
    public void actualizarDetalleResponsables(String FK_DMPER_CODIGO, Integer FK_PPRO_CODIGO_UNICO) {
        if ((FK_DMPER_CODIGO != null) && (FK_PPRO_CODIGO_UNICO != null)){

            String sql = "UPDATE PROYECTDP_DETALLE_RESPONSABLE DR\n" +
                    "SET DR.FK_DMPER_CODIGO = ?\n" +
                    "WHERE DR.FK_PPRO_CODIGO_UNICO = ?";

            jdbcTemplate.update(sql, FK_DMPER_CODIGO, FK_PPRO_CODIGO_UNICO);

        }

    }
}
