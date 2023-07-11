package com.proyecto.DP.restDP;

import com.proyecto.DP.modeloDP.Procedimiento_Sercop;
import com.proyecto.DP.modeloDP.TCompra;
import com.proyecto.DP.serviciosDP.Procedimiento_SercopS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/listar")
public class Procedimiento_SercopREST {
    @Autowired
    private Procedimiento_SercopS procedimientoSercopS;

    @GetMapping("/procedimiento")
    public List<Procedimiento_Sercop> obtenerDatos() {
        // Utiliza el método de servicio para obtener los datos y enviarlos al cliente
        return procedimientoSercopS.listarProcedmientos();
    }
}
