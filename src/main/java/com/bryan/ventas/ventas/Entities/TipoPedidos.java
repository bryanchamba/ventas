package com.bryan.ventas.ventas.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_tip_pedidos")
public class TipoPedidos {

    @Id
    @Column(nullable = false, length = 2)
    private String tpe_codigo;

    @Column(nullable = false, length = 50)
    private String tpe_descripcion;

    public String getTpe_codigo() {
        return tpe_codigo;
    }

    public void setTpe_codigo(String tpe_codigo) {
        this.tpe_codigo = tpe_codigo;
    }

    public String getTpe_descripcion() {
        return tpe_descripcion;
    }

    public void setTpe_descripcion(String tpe_descripcion) {
        this.tpe_descripcion = tpe_descripcion;
    }

}
