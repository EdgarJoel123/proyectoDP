package com.proyecto.DP.restDP;


import com.proyecto.DP.modeloDP.Porcentaje;
import com.proyecto.DP.serviciosDP.PorcentajeS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;

@RestController
@RequestMapping("/editar/porcentaje")
public class PorcentajeREST {

    @Autowired
    private PorcentajeS porcentajeS;

    @PutMapping("/{FK_PPRO_CODIGO_UNICO}")
    public ResponseEntity<Porcentaje> actualizarResponsable(@PathVariable(value = "FK_PPRO_CODIGO_UNICO") Integer FK_PPRO_CODIGO_UNICO,
                                                            @RequestParam(value = "PPOAVFIDE_PORCENTAJE_AVANCE_FI",required = false) Float PPOAVFIDE_PORCENTAJE_AVANCE_FI,
                                                            @RequestParam(value = "PPOAVFIDE_OBSERVACIONES_PA", required = false) String PPOAVFIDE_OBSERVACIONES_PA){

         porcentajeS.actualizarPorcentaje(PPOAVFIDE_PORCENTAJE_AVANCE_FI,PPOAVFIDE_OBSERVACIONES_PA, FK_PPRO_CODIGO_UNICO);
        return ResponseEntity.ok().build();

    }

}
