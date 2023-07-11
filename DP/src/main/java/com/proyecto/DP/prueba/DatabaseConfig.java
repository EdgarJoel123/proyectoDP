package com.proyecto.DP.prueba;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;


import javax.sql.DataSource;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;


@Configuration
public class DatabaseConfig {

    /*Atributos necesarios para una conexion a la BD de manera local*/
    @Value("${spring.datasource.url}")
    private String dbUrl;

    @Value("${spring.datasource.username}")
    private String dbUsername;

    @Value("${spring.datasource.password}")
    private String dbPassword;

    @Bean
    public DataSource dataSource() {
        DataSource dataSource = null;

        /*Try para controlar si es una conexion local y una en un servidor*/
        try {
            InitialContext initialContext = new InitialContext();
            /*Nombre del dataSouce que tiene todos los atributos para la conexion a la base*/
            dataSource = (DataSource) initialContext.lookup("java:comp/env/jdbc/ProyectosDP");
        } catch (NamingException e) {
            // Fall back to local dataSource configuration
            dataSource = DataSourceBuilder.create()
                    .url(dbUrl)
                    .username(dbUsername)
                    .password(dbPassword)
                    .build();
        }

        return dataSource;
    }

    /*Conexion para trabajar en un entorno de JDBC*/
    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
}