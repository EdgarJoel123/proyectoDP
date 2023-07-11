package com.proyecto.DP.prueba;

import org.springframework.stereotype.Component;

import java.sql.*;

@Component
public class OracleConexion {
    private final String url = "jdbc:oracle:thin:@//raceeaamb-scan.eeasa.com:1521/pdbamb";
    private final String user = "proyectosdp";
    private final String password = "ProyDP";

    public void consultarTabla() {

        try (Connection con = DriverManager.getConnection(url, user, password);
             PreparedStatement pst = con.prepareStatement("SELECT * FROM PROJECTDP_ACTIVIDADES");
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                // process resultados de la consulta
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
