package com.proyecto.DP.respositorioDP;


import com.proyecto.DP.modeloDP.Procedimiento_Sercop;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Procedimiento_SercopR{

    List<Procedimiento_Sercop> listarProcedmientos();
}
