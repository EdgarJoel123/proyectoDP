package com.proyecto.DP.restDP;

import com.proyecto.DP.modeloDP.TCompra;
import com.proyecto.DP.modeloDP.TProyecto;
import com.proyecto.DP.serviciosDP.TCompraS;
import com.proyecto.DP.serviciosDP.TProyectoS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/listar")
public class TProyectoREST {
    @Autowired
    private TProyectoS tProyectoS;

    @GetMapping("/tproyecto")
    public List<TProyecto> obtenerDatos() {
        // Utiliza el método de servicio para obtener los datos y enviarlos al cliente
        return tProyectoS.listaProyectos();
    }
}
