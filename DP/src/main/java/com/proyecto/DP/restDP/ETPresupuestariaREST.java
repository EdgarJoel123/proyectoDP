package com.proyecto.DP.restDP;

import com.proyecto.DP.modeloDP.ETPresupuestaria;
import com.proyecto.DP.modeloDP.Matriz;
import com.proyecto.DP.serviciosDP.ETPresupuestariaS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/listar")
public class ETPresupuestariaREST {

    @Autowired
    private ETPresupuestariaS etPresupuestariaS;

    @GetMapping("/presupuestaria")
    public List<ETPresupuestaria> obtenerDatos() {
        // Utiliza el método de servicio para obtener los datos y enviarlos al cliente
        return etPresupuestariaS.listarEtapaPrespuestaria();
    }
}
