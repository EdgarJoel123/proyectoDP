package com.proyecto.DP.restDP;



import com.google.gson.Gson;
import com.proyecto.DP.modeloDP.Actividades;
import com.proyecto.DP.prueba.OracleConexion;
import com.proyecto.DP.respositorioDP.ActividadesR;
import com.proyecto.DP.serviciosDP.ActividadesS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/editar/fisico")
public class ActividadesREST {

    @Autowired
    private ActividadesS actividadesS;

    @PutMapping("/{FK_PPRO_CODIGO_UNICO}")
    public ResponseEntity<Actividades> actualizarAvanceFisico(@PathVariable(value = "FK_PPRO_CODIGO_UNICO") Integer FK_PPRO_CODIGO_UNICO,@RequestParam(value = "PAC_ACTIVIDAD_ENERO", required = false) String PAC_ACTIVIDAD_ENERO,@RequestParam(value = "PAC_ACTIVIDAD_FEBRERO",required = false) String PAC_ACTIVIDAD_FEBRERO,
                                                              @RequestParam(value = "PAC_ACTIVIDAD_MARZO",required = false) String PAC_ACTIVIDAD_MARZO,@RequestParam(value = "PAC_ACTIVIDAD_ABRIL",required = false) String PAC_ACTIVIDAD_ABRIL,@RequestParam(value = "PAC_ACTIVIDAD_MAYO",required = false) String PAC_ACTIVIDAD_MAYO,
                                                              @RequestParam(value = "PAC_ACTIVIDAD_JUNIO",required = false) String PAC_ACTIVIDAD_JUNIO,@RequestParam(value = "PAC_ACTIVIDAD_JULIO",required = false) String PAC_ACTIVIDAD_JULIO,@RequestParam(value = "PAC_ACTIVIDAD_AGOSTO",required = false) String PAC_ACTIVIDAD_AGOSTO,
                                                              @RequestParam(value = "PAC_ACTIVIDAD_SEPTIEMBRE",required = false) String PAC_ACTIVIDAD_SEPTIEMBRE,@RequestParam(value = "PAC_ACTIVIDAD_OCTUBRE",required = false) String PAC_ACTIVIDAD_OCTUBRE, @RequestParam(value = "PAC_ACTIVIDAD_NOVIEMBRE", required = false) String PAC_ACTIVIDAD_NOVIEMBRE,
                                                              @RequestParam(value = "PAC_ACTIVIDAD_DICIEMBRE",required = false) String PAC_ACTIVIDAD_DICIEMBRE){
        actividadesS.actualizarAvanceFisico(PAC_ACTIVIDAD_ENERO,PAC_ACTIVIDAD_FEBRERO,PAC_ACTIVIDAD_MARZO,PAC_ACTIVIDAD_ABRIL,PAC_ACTIVIDAD_MAYO,PAC_ACTIVIDAD_JUNIO,PAC_ACTIVIDAD_JULIO,PAC_ACTIVIDAD_AGOSTO,
                PAC_ACTIVIDAD_SEPTIEMBRE,PAC_ACTIVIDAD_OCTUBRE,PAC_ACTIVIDAD_NOVIEMBRE,PAC_ACTIVIDAD_DICIEMBRE,FK_PPRO_CODIGO_UNICO);
        return ResponseEntity.ok().build();

    }
}
