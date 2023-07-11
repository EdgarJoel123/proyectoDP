package com.proyecto.DP.respositorioDP;


import com.proyecto.DP.modeloDP.TPresupuesto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TPresupuestoR{

    List<TPresupuesto> listarPresupuesto();
}
