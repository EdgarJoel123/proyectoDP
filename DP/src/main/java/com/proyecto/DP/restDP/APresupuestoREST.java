package com.proyecto.DP.restDP;


import com.proyecto.DP.modeloDP.APresupuesto;
import com.proyecto.DP.serviciosDP.APresupuestoS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/editar/presupuesto")
public class APresupuestoREST {

    @Autowired
    private APresupuestoS aPresupuestoS;

    @PutMapping("/{FK_PPRO_CODIGO_UNICO}")
    public ResponseEntity<APresupuesto> actualizarAvanceFisico(@PathVariable(value = "FK_PPRO_CODIGO_UNICO") Integer FK_PPRO_CODIGO_UNICO, @RequestParam(value = "PPRES_ACTIVIDAD_ENERO", required = false) Float PPRES_ACTIVIDAD_ENERO, @RequestParam(value = "PPRES_ACTIVIDAD_FEBRERO",required = false) Float PPRES_ACTIVIDAD_FEBRERO,
                                                               @RequestParam(value = "PPRES_ACTIVIDAD_MARZO",required = false) Float PPRES_ACTIVIDAD_MARZO, @RequestParam(value = "PPRES_ACTIVIDAD_ABRIL",required = false) Float PPRES_ACTIVIDAD_ABRIL, @RequestParam(value = "PPRES_ACTIVIDAD_MAYO",required = false) Float PPRES_ACTIVIDAD_MAYO,
                                                               @RequestParam(value = "PPRES_ACTIVIDAD_JUNIO",required = false) Float PPRES_ACTIVIDAD_JUNIO, @RequestParam(value = "PPRES_ACTIVIDAD_JULIO",required = false) Float PPRES_ACTIVIDAD_JULIO, @RequestParam(value = "PPRES_ACTIVIDAD_AGOSTO",required = false) Float PPRES_ACTIVIDAD_AGOSTO,
                                                               @RequestParam(value = "PPRES_ACTIVIDAD_SEPTIEMBRE",required = false) Float PPRES_ACTIVIDAD_SEPTIEMBRE, @RequestParam(value = "PPRES_ACTIVIDAD_OCTUBRE",required = false) Float PPRES_ACTIVIDAD_OCTUBRE, @RequestParam(value = "PPRES_ACTIVIDAD_NOVIEMBRE", required = false) Float PPRES_ACTIVIDAD_NOVIEMBRE,
                                                               @RequestParam(value = "PPRES_ACTIVIDAD_DICIEMBRE",required = false) Float PPRES_ACTIVIDAD_DICIEMBRE){
        aPresupuestoS.actualizarAvancePrespuesto(PPRES_ACTIVIDAD_ENERO,PPRES_ACTIVIDAD_FEBRERO,PPRES_ACTIVIDAD_MARZO,PPRES_ACTIVIDAD_ABRIL,PPRES_ACTIVIDAD_MAYO,PPRES_ACTIVIDAD_JUNIO,PPRES_ACTIVIDAD_JULIO,PPRES_ACTIVIDAD_AGOSTO,
                PPRES_ACTIVIDAD_SEPTIEMBRE,PPRES_ACTIVIDAD_OCTUBRE,PPRES_ACTIVIDAD_NOVIEMBRE,PPRES_ACTIVIDAD_DICIEMBRE,FK_PPRO_CODIGO_UNICO);
        return ResponseEntity.ok().build();

    }
}
