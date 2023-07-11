package com.proyecto.DP.restDP;

import com.proyecto.DP.modeloDP.Certificado;
import com.proyecto.DP.serviciosDP.PagadoS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/editar/pagado")
public class PagadoREST {

    @Autowired
    private PagadoS pagadoS;

    @PutMapping("/{FK_PPRO_CODIGO_UNICO}")
    public ResponseEntity<Certificado> actualizarAvanceFisico(@PathVariable(value = "FK_PPRO_CODIGO_UNICO") Integer FK_PPRO_CODIGO_UNICO, @RequestParam(value = "PPAG_ACTIVIDAD_ENERO", required = false) Float PPAG_ACTIVIDAD_ENERO, @RequestParam(value = "PPAG_ACTIVIDAD_FEBRERO",required = false) Float PPAG_ACTIVIDAD_FEBRERO,
                                                              @RequestParam(value = "PPAG_ACTIVIDAD_MARZO",required = false) Float PPAG_ACTIVIDAD_MARZO, @RequestParam(value = "PPAG_ACTIVIDAD_ABRIL",required = false) Float PPAG_ACTIVIDAD_ABRIL, @RequestParam(value = "PPAG_ACTIVIDAD_MAYO",required = false) Float PPAG_ACTIVIDAD_MAYO,
                                                              @RequestParam(value = "PPAG_ACTIVIDAD_JUNIO",required = false) Float PPAG_ACTIVIDAD_JUNIO, @RequestParam(value = "PPAG_ACTIVIDAD_JULIO",required = false) Float PPAG_ACTIVIDAD_JULIO, @RequestParam(value = "PPAG_ACTIVIDAD_AGOSTO",required = false) Float PPAG_ACTIVIDAD_AGOSTO,
                                                              @RequestParam(value = "PPAG_ACTIVIDAD_SEPTIEMBRE",required = false) Float PPAG_ACTIVIDAD_SEPTIEMBRE, @RequestParam(value = "PPAG_ACTIVIDAD_OCTUBRE",required = false) Float PPAG_ACTIVIDAD_OCTUBRE, @RequestParam(value = "PPAG_ACTIVIDAD_NOVIEMBRE", required = false) Float PPAG_ACTIVIDAD_NOVIEMBRE,
                                                              @RequestParam(value = "PPAG_ACTIVIDAD_DICIEMBRE",required = false) Float PPAG_ACTIVIDAD_DICIEMBRE){
        pagadoS.actualizarAvancePagado(PPAG_ACTIVIDAD_ENERO,PPAG_ACTIVIDAD_FEBRERO,PPAG_ACTIVIDAD_MARZO,PPAG_ACTIVIDAD_ABRIL,PPAG_ACTIVIDAD_MAYO,PPAG_ACTIVIDAD_JUNIO,PPAG_ACTIVIDAD_JULIO,PPAG_ACTIVIDAD_AGOSTO,
                PPAG_ACTIVIDAD_SEPTIEMBRE,PPAG_ACTIVIDAD_OCTUBRE,PPAG_ACTIVIDAD_NOVIEMBRE,PPAG_ACTIVIDAD_DICIEMBRE,FK_PPRO_CODIGO_UNICO);
        return ResponseEntity.ok().build();

    }
}
