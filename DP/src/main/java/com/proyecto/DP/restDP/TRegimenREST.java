package com.proyecto.DP.restDP;

import com.proyecto.DP.modeloDP.TCompra;
import com.proyecto.DP.modeloDP.TRegimen;
import com.proyecto.DP.serviciosDP.TCompraS;
import com.proyecto.DP.serviciosDP.TRegimenS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/listar")
public class TRegimenREST {

    @Autowired
    private TRegimenS tRegimenS;

    @GetMapping("/tregimen")
    public List<TRegimen> obtenerDatos() {
        // Utiliza el método de servicio para obtener los datos y enviarlos al cliente
        return tRegimenS.listarTRegimen();
    }
}
