package com.proyecto.DP.respositorioDP;


import com.proyecto.DP.modeloDP.TRegimen;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TRegimenR{
    List<TRegimen> listarTRegimen();

}
