package com.proyecto.DP.restDP;

import com.proyecto.DP.modeloDP.TCompra;
import com.proyecto.DP.modeloDP.TPresupuesto;
import com.proyecto.DP.serviciosDP.TCompraS;
import com.proyecto.DP.serviciosDP.TPresupuestoS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/listar")
public class TPresupuestoREST {

    @Autowired
    private TPresupuestoS tPresupuestoS;

    @GetMapping("/tpresupuesto")
    public List<TPresupuesto> obtenerDatos() {
        // Utiliza el método de servicio para obtener los datos y enviarlos al cliente
        return tPresupuestoS.listarPresupuesto();
    }
}
