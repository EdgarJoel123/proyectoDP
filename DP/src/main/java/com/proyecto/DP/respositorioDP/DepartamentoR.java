package com.proyecto.DP.respositorioDP;


import com.proyecto.DP.modeloDP.Departamento;
import com.proyecto.DP.modeloDP.Matriz;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartamentoR{

    List<Departamento> ListarDepartamento();
}
