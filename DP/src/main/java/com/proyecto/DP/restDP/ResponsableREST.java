package com.proyecto.DP.restDP;

import com.proyecto.DP.modeloDP.Matriz;
import com.proyecto.DP.modeloDP.Responsable;
import com.proyecto.DP.serviciosDP.Busqueda;
import com.proyecto.DP.serviciosDP.ResponsableS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/editar/responsable")
public class ResponsableREST {
    @Autowired
    private ResponsableS responsableS;



    @PutMapping("/{FK_PPRO_CODIGO_UNICO}")
    public ResponseEntity<Responsable> editarDetalleResponsable(@PathVariable(value = "FK_PPRO_CODIGO_UNICO") Integer FK_PPRO_CODIGO_UNICO, @RequestParam(value = "FK_DMPER_CODIGO", required = false) String FK_DMPER_CODIGO) {
        responsableS.actualizarDetalleResponsables(FK_DMPER_CODIGO,FK_PPRO_CODIGO_UNICO);
        return ResponseEntity.ok().build();


    }
}
