package com.proyecto.DP.respositorioDP;


import com.proyecto.DP.modeloDP.TProyecto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TProyectoR  {
    List<TProyecto> listaProyectos();
}
