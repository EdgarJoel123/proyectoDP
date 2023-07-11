package com.proyecto.DP.restDP;

import com.proyecto.DP.modeloDP.Departamento;
import com.proyecto.DP.modeloDP.Matriz;
import com.proyecto.DP.modeloDP.TCompra;
import com.proyecto.DP.serviciosDP.Busqueda;
import com.proyecto.DP.serviciosDP.DepartamentoS;
import com.proyecto.DP.serviciosDP.MatrizS;
import com.proyecto.DP.serviciosDP.TCompraS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/listar")
public class DepartamentosREST {
    @Autowired
    private DepartamentoS departamentoS;

    @GetMapping("/departamento")
    public List<Departamento> obtenerDatos() {
        // Utiliza el método de servicio para obtener los datos y enviarlos al cliente
        return departamentoS.ListarDepartamento();
    }

}
