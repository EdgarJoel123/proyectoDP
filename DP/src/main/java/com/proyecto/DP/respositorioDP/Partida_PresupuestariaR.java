package com.proyecto.DP.respositorioDP;


import com.proyecto.DP.modeloDP.Partida_Presupuestaria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Partida_PresupuestariaR {

    void actualizarPartidaPresuúestaria(String PPAPRE_PARTIDA_PRESUPUESTARIA, Integer FK_PPRO_CODIGO_UNICO);
}
