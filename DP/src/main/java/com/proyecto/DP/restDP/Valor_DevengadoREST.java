package com.proyecto.DP.restDP;

import com.proyecto.DP.modeloDP.Valor_Devengado;
import com.proyecto.DP.serviciosDP.Valor_DevengadoS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/editar/devengado")
public class Valor_DevengadoREST {

    @Autowired
    private Valor_DevengadoS valorDevengadoS;

    @PutMapping("/{FK_PPRO_CODIGO_UNICO}")
    public ResponseEntity<Valor_Devengado> actualizarValoDevengado(@PathVariable(value = "FK_PPRO_CODIGO_UNICO") Integer FK_PPRO_CODIGO_UNICO,
                                                                   @RequestParam(value = "PVADE_VALOR_DEVENGADO",required = false) Float PVADE_VALOR_DEVENGADO,
                                                                   @RequestParam(value = "PVADE_OBSERVACIONES_VD",required = false) String PVADE_OBSERVACIONES_VD){
        valorDevengadoS.actualizarValorDevengado(PVADE_VALOR_DEVENGADO,PVADE_OBSERVACIONES_VD,FK_PPRO_CODIGO_UNICO);
        return  ResponseEntity.ok().build();
    }
}
