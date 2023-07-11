package com.proyecto.DP.restDP;


import com.proyecto.DP.modeloDP.Partida_Presupuestaria;
import com.proyecto.DP.serviciosDP.Partida_PresupuestariaS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/editar/partida")
public class Partida_PresupuestariaREST {

    @Autowired
    private Partida_PresupuestariaS partidaPresupuestariaS;

    @PutMapping("/{FK_PPRO_CODIGO_UNICO}")
    public ResponseEntity<Partida_Presupuestaria> actualizarNombreUsuario(@PathVariable(value = "FK_PPRO_CODIGO_UNICO") Integer FK_PPRO_CODIGO_UNICO, @RequestParam(value = "PPAPRE_PARTIDA_PRESUPUESTARIA", required = false) String PPAPRE_PARTIDA_PRESUPUESTARIA) {
        partidaPresupuestariaS.actualizarPartidaPresuúestaria(PPAPRE_PARTIDA_PRESUPUESTARIA, FK_PPRO_CODIGO_UNICO);
        return ResponseEntity.ok().build();
    }


}
