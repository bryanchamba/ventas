package com.bryan.ventas.ventas.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_cab_pedidos")
public class CabeceraPedidos {
    
    @EmbeddedId
    private CabeceraPedidosId id;

    @Column(nullable = false)
    private int cli_codigo;

    @Column(nullable = false)
    private java.sql.Date cpe_fecha;

    @ManyToOne
    @JoinColumn(name = "cli_codigo", insertable = false, updatable = false)
    private Clientes cliente;

    @ManyToOne
    @MapsId("tpe_codigo")
    @JoinColumn(name = "tpe_codigo", insertable = false, updatable = false)
    private TipoPedidos tipoPedido;


    
    public CabeceraPedidosId getId() {
        return id;
    }

    public void setId(CabeceraPedidosId id) {
        this.id = id;
    }

    public int getCli_codigo() {
        return cli_codigo;
    }

    public void setCli_codigo(int cli_codigo) {
        this.cli_codigo = cli_codigo;
    }

    public java.sql.Date getCpe_fecha() {
        return cpe_fecha;
    }

    public void setCpe_fecha(java.sql.Date cpe_fecha) {
        this.cpe_fecha = cpe_fecha;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public TipoPedidos getTipoPedido() {
        return tipoPedido;
    }

    public void setTipoPedido(TipoPedidos tipoPedido) {
        this.tipoPedido = tipoPedido;
    }

}