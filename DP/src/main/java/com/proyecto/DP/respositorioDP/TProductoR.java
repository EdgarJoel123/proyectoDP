package com.proyecto.DP.respositorioDP;


import com.proyecto.DP.modeloDP.TProducto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TProductoR {

    List<TProducto> listaTProducto();

}
