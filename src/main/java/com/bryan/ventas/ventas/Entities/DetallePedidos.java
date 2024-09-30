package com.bryan.ventas.ventas.Entities;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_det_pedidos")
public class DetallePedidos {

    @EmbeddedId
    private DetallePedidosId id;

    @Column(nullable = false, length = 50)
    private String dpe_producto;

    @Column(nullable = false, precision = 5, scale = 2)
    private BigDecimal dpe_precio;

    @ManyToOne
    @MapsId("id")
    @JoinColumns({
        @JoinColumn(name = "tpe_codigo", referencedColumnName = "tpe_codigo"),
        @JoinColumn(name = "cpe_codigo", referencedColumnName = "cpe_codigo")
    })
    private CabeceraPedidos cabeceraPedidos;

    public String getDpe_producto() {
        return dpe_producto;
    }

    public void setDpe_producto(String dpe_producto) {
        this.dpe_producto = dpe_producto;
    }

    public BigDecimal getDpe_precio() {
        return dpe_precio;
    }

    public void setDpe_precio(BigDecimal dpe_precio) {
        this.dpe_precio = dpe_precio;
    }

    public CabeceraPedidos getCabeceraPedidos() {
        return cabeceraPedidos;
    }

    public void setCabeceraPedidos(CabeceraPedidos cabeceraPedidos) {
        this.cabeceraPedidos = cabeceraPedidos;
    }

    public DetallePedidosId getId() {
        return id;
    }

    public void setId(DetallePedidosId id) {
        this.id = id;
    }

}
