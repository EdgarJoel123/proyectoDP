package com.proyecto.DP.respositorioDP;

import com.proyecto.DP.modeloDP.TCompra;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TCompraR {

    List<TCompra> listarTipoCompra();
}
