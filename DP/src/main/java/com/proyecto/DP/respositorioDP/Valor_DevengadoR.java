package com.proyecto.DP.respositorioDP;

import com.proyecto.DP.modeloDP.Valor_Devengado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Valor_DevengadoR {

    void actualizarValorDevengado(Float PVADE_VALOR_DEVENGADO,
                                  String PVADE_OBSERVACIONES_VD,
                                  Integer FK_PPRO_CODIGO_UNICO);
}
