package com.proyecto.DP.respositorioDP;


import com.proyecto.DP.modeloDP.Unidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UnidadR{
    List<Unidad> listarUnidades();
}
