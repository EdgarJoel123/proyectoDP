package com.proyecto.DP.respositorioDP;


import com.proyecto.DP.modeloDP.Porcentaje;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Date;

public interface PorcentajeeR{

    void actualizarPorcentaje(Float PPOAVFIDE_PORCENTAJE_AVANCE_FI,
                               String PPOAVFIDE_OBSERVACIONES_PA,
                               Integer FK_PPRO_CODIGO_UNICO);

}
