package com.proyecto.DP.restDP;

import com.proyecto.DP.modeloDP.ETPresupuestaria;
import com.proyecto.DP.modeloDP.TCompra;
import com.proyecto.DP.serviciosDP.TCompraS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/listar")
public class TCompraREST {

    @Autowired
    private TCompraS tCompraS;

    @GetMapping("/tcompra")
    public List<TCompra> obtenerDatos() {
        // Utiliza el método de servicio para obtener los datos y enviarlos al cliente
        return tCompraS.listarTipoCompra();
    }
}
