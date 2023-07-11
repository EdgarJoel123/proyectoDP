package com.proyecto.DP.restDP;

import com.proyecto.DP.modeloDP.Departamento;
import com.proyecto.DP.modeloDP.Matriz;
import com.proyecto.DP.serviciosDP.Busqueda;
import com.proyecto.DP.serviciosDP.MatrizS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/listar")
public class MatrizREST {
    @Autowired
    private MatrizS matrizS;
    private JdbcTemplate jdbcTemplate;

    public MatrizREST(MatrizS matrizS, JdbcTemplate jdbcTemplate, Busqueda busqueda) {
        this.matrizS = matrizS;
        this.jdbcTemplate = jdbcTemplate;
    }

    @GetMapping("/matriz")
    public List<Matriz> obtenerDatos() {
        // Ejecuta el método de populación de departamentos
        matrizS.populateDepartamento();
        matrizS.populateResponsable();

        // Utiliza el método de servicio para obtener los datos y enviarlos al cliente
        return matrizS.joinTables();
    }

    @GetMapping("/matrizN")
    public List<Matriz> obtenerDatosNuevos() {
        // Ejecuta el método de populación de departamentos
        matrizS.populateDepartamento();
        matrizS.populateResponsable();

        // Utiliza el método de servicio para obtener los datos y enviarlos al cliente
        return matrizS.joinTablesNuevos();
    }


    @GetMapping("/buscar/id")
    public ResponseEntity<List<Matriz>> buscarContrato(@RequestParam(value = "PK_PPRO_CODIGO_UNICO") Integer PK_PPRO_CODIGO_UNICO){
        List<Matriz> matrizs = matrizS.findID(PK_PPRO_CODIGO_UNICO);
        // Ejecuta el método de populación de departamentos
        matrizS.populateDepartamento();
        matrizS.populateResponsable();
        if (!matrizs.isEmpty()) {
            return ResponseEntity.ok(matrizs);
            // Ejecuta el método de populación de departamentos
        } else {
            return ResponseEntity.notFound().build();
        }
    }



    /*@GetMapping("/buscar/estado")
    public ResponseEntity<List<Matriz>> buscarEstado(@RequestParam(value = "estado") String estado){
        List<Matriz> matrizs = busqueda.findEstado(estado);
        if (!matrizs.isEmpty()) {
            return ResponseEntity.ok(matrizs);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

     */

    @PutMapping("/editar/{PK_PPRO_CODIGO_UNICO}")
    public ResponseEntity<Matriz> actualizarMatriz(@PathVariable(value = "PK_PPRO_CODIGO_UNICO") Integer PK_PPRO_CODIGO_UNICO, @RequestParam(value = "PPRO_ANIO", required = false) String PPRO_ANIO,
                                                   @RequestParam(value = "PPRO_CANTIDAD_ANUAL", required = false) String PPRO_CANTIDAD_ANUAL, @RequestParam(value = "PPRO_CATALOGO_ELECTRONICO", required = false) String PPRO_CATALOGO_ELECTRONICO,
                                                   @RequestParam(value = "PPRO_CODIGO_CATEGORIA_CPC", required = false) Float PPRO_CODIGO_CATEGORIA_CPC, @RequestParam(value = "PPRO_CODIGO_SERCOP", required = false) String PPRO_CODIGO_SERCOP,
                                                   @RequestParam(value = "PPRO_COSTO_UNITARIO", required = false) Float PPRO_COSTO_UNITARIO, @RequestParam(value ="PPRO_CUATRIMESTRE_N1", required = false) String PPRO_CUATRIMESTRE_N1,
                                                   @RequestParam(value ="PPRO_CUATRIMESTRE_N2", required = false) String PPRO_CUATRIMESTRE_N2, @RequestParam(value ="PPRO_CUATRIMESTRE_N3", required = false) String PPRO_CUATRIMESTRE_N3,
                                                   @RequestParam(value = "PPRO_DETALLE_PRODUCTO", required = false) String PPRO_DETALLE_PRODUCTO, @RequestParam(value = "PPRO_FECHA_FINAL", required = false) Date PPRO_FECHA_FINAL,
                                                   @RequestParam(value = "PPRO_FECHA_INICIAL", required = false) Date PPRO_FECHA_INICIAL,@RequestParam(value = "PPRO_FONDOS_BID", required = false) String PPRO_FONDOS_BID,
                                                   @RequestParam(value = "PPRO_NUMERO_CODIGO_OPERACION_P", required = false) String PPRO_NUMERO_CODIGO_OPERACION_P,@RequestParam(value = "PPRO_NUMERO_CODIGO_PROYECTO_BI", required = false) String PPRO_NUMERO_CODIGO_PROYECTO_BI,
                                                   @RequestParam(value = "PPRO_NUMERO_CONTRATO", required = false) String PPRO_NUMERO_CONTRATO,@RequestParam(value = "PPRO_OBSERVACIONES", required = false) String PPRO_OBSERVACIONES,
                                                   @RequestParam(value = "PPRO_PLAZO", required = false) String PPRO_PLAZO,@RequestParam(value = "PPRO_CODIGO_RAPIDO", required = false) String PPRO_CODIGO_RAPIDO,
                                                   @RequestParam(value = "PPRO_PRESUPUESTO_INICIAL", required = false) Float PPRO_PRESUPUESTO_INICIAL,@RequestParam(value = "PPRO_PRESUPUESTO_CODIFICADO", required = false) Float PPRO_PRESUPUESTO_CODIFICADO,
                                                   @RequestParam(value = "FK_PETAPRE_ID", required = false) String FK_PETAPRE_ID,@RequestParam(value = "FK_PDE_DMEOR_CODIGO", required = false) String FK_PDE_DMEOR_CODIGO,
                                                   @RequestParam(value = "FK_PPRSE_ID_PER", required = false) String FK_PPRSE_ID_PER,@RequestParam(value = "FK_PTICO_ID_PER", required = false) String FK_PTICO_ID_PER,
                                                   @RequestParam(value = "FK_PTIPRE_ID_PER", required = false) String FK_PTIPRE_ID_PER,@RequestParam(value = "FK_PTIPO_ID_PER", required = false) String FK_PTIPO_ID_PER,
                                                   @RequestParam(value = "FK_PTIPRO_ID_PER", required = false) String FK_PTIPRO_ID_PER,@RequestParam(value = "FK_PTIRE_ID_PER",required = false) String FK_PTIRE_ID_PER,
                                                   @RequestParam(value = "FK_PUNI_ID_PER",required = false) String FK_PUNI_ID_PER){
        matrizS.actualizarMatriz(PPRO_ANIO, PPRO_CANTIDAD_ANUAL,  PPRO_CATALOGO_ELECTRONICO, PPRO_CODIGO_CATEGORIA_CPC
                , PPRO_CODIGO_SERCOP,  PPRO_COSTO_UNITARIO,  PPRO_CUATRIMESTRE_N1, PPRO_CUATRIMESTRE_N2,
                 PPRO_CUATRIMESTRE_N3,  PPRO_DETALLE_PRODUCTO,  PPRO_FECHA_FINAL,  PPRO_FECHA_INICIAL,
                 PPRO_FONDOS_BID, PPRO_NUMERO_CODIGO_OPERACION_P, PPRO_NUMERO_CODIGO_PROYECTO_BI, PPRO_NUMERO_CONTRATO,
                 PPRO_OBSERVACIONES, PPRO_PLAZO, PPRO_CODIGO_RAPIDO, PPRO_PRESUPUESTO_INICIAL, PPRO_PRESUPUESTO_CODIFICADO,
                 FK_PETAPRE_ID, FK_PDE_DMEOR_CODIGO, FK_PPRSE_ID_PER,  FK_PTICO_ID_PER, FK_PTIPRE_ID_PER, FK_PTIPO_ID_PER,
                 FK_PTIPRO_ID_PER,  FK_PTIRE_ID_PER,  FK_PUNI_ID_PER, PK_PPRO_CODIGO_UNICO);
        return  ResponseEntity.ok().build();
    }
}
