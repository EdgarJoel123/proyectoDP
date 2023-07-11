package com.proyecto.DP.respositorioDP;


import com.proyecto.DP.modeloDP.Matriz;
import com.proyecto.DP.modeloDP.Responsable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ResponsableR{
    List<Matriz> findResponsable(String nombre, String apellido);

    void actualizarDetalleResponsables(String FK_DMPER_CODIGO, Integer FK_PPRO_CODIGO_UNICO);
}
