package com.bryan.ventas.ventas.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_clientes")
public class Clientes {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cli_codigo;

    @Column(nullable = false, length = 75)
    private String cli_apellidos;

    @Column(nullable = false, length = 75)
    private String cli_nombres;



    public Long getCli_codigo() {
        return cli_codigo;
    }

    public void setCli_codigo(Long cli_codigo) {
        this.cli_codigo = cli_codigo;
    }

    public String getCli_apellidos() {
        return cli_apellidos;
    }

    public void setCli_apellidos(String cli_apellidos) {
        this.cli_apellidos = cli_apellidos;
    }

    public String getCli_nombres() {
        return cli_nombres;
    }

    public void setCli_nombres(String cli_nombres) {
        this.cli_nombres = cli_nombres;
    }

}
