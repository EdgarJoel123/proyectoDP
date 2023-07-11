package com.proyecto.DP.restDP;

import com.proyecto.DP.modeloDP.APresupuesto;
import com.proyecto.DP.modeloDP.Certificado;
import com.proyecto.DP.serviciosDP.CertificadoS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/editar/certificado")
public class CertifcadoREST {
    @Autowired
    private CertificadoS certificadoS;

    @PutMapping("/{FK_PPRO_CODIGO_UNICO}")
    public ResponseEntity<Certificado> actualizarAvanceFisico(@PathVariable(value = "FK_PPRO_CODIGO_UNICO") Integer FK_PPRO_CODIGO_UNICO, @RequestParam(value = "PCER_ACTIVIDAD_ENERO", required = false) Float PCER_ACTIVIDAD_ENERO, @RequestParam(value = "PCER_ACTIVIDAD_FEBRERO",required = false) Float PCER_ACTIVIDAD_FEBRERO,
                                                              @RequestParam(value = "PCER_ACTIVIDAD_MARZO",required = false) Float PCER_ACTIVIDAD_MARZO, @RequestParam(value = "PCER_ACTIVIDAD_ABRIL",required = false) Float PCER_ACTIVIDAD_ABRIL, @RequestParam(value = "PCER_ACTIVIDAD_MAYO",required = false) Float PCER_ACTIVIDAD_MAYO,
                                                              @RequestParam(value = "PCER_ACTIVIDAD_JUNIO",required = false) Float PCER_ACTIVIDAD_JUNIO, @RequestParam(value = "PCER_ACTIVIDAD_JULIO",required = false) Float PCER_ACTIVIDAD_JULIO, @RequestParam(value = "PCER_ACTIVIDAD_AGOSTO",required = false) Float PCER_ACTIVIDAD_AGOSTO,
                                                              @RequestParam(value = "PCER_ACTIVIDAD_SEPTIEMBRE",required = false) Float PCER_ACTIVIDAD_SEPTIEMBRE, @RequestParam(value = "PCER_ACTIVIDAD_OCTUBRE",required = false) Float PCER_ACTIVIDAD_OCTUBRE, @RequestParam(value = "PCER_ACTIVIDAD_NOVIEMBRE", required = false) Float PCER_ACTIVIDAD_NOVIEMBRE,
                                                              @RequestParam(value = "PCER_ACTIVIDAD_DICIEMBRE",required = false) Float PCER_ACTIVIDAD_DICIEMBRE){
        certificadoS.actualizarAvanceCertificado(PCER_ACTIVIDAD_ENERO,PCER_ACTIVIDAD_FEBRERO,PCER_ACTIVIDAD_MARZO,PCER_ACTIVIDAD_ABRIL,PCER_ACTIVIDAD_MAYO,PCER_ACTIVIDAD_JUNIO,PCER_ACTIVIDAD_JULIO,PCER_ACTIVIDAD_AGOSTO,
                PCER_ACTIVIDAD_SEPTIEMBRE,PCER_ACTIVIDAD_OCTUBRE,PCER_ACTIVIDAD_NOVIEMBRE,PCER_ACTIVIDAD_DICIEMBRE,FK_PPRO_CODIGO_UNICO);
        return ResponseEntity.ok().build();

    }
}
