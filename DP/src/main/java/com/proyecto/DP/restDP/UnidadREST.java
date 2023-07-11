package com.proyecto.DP.restDP;

import com.proyecto.DP.modeloDP.Departamento;
import com.proyecto.DP.modeloDP.Unidad;
import com.proyecto.DP.serviciosDP.UnidadS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/listar")
public class UnidadREST {
    @Autowired
    private UnidadS unidadS;

    @GetMapping("/unidad")
    public List<Unidad> obtenerDatos() {
        // Utiliza el método de servicio para obtener los datos y enviarlos al cliente
        return unidadS.listarUnidades();
    }
}
