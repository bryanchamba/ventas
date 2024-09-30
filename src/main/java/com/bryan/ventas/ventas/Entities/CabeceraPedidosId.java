package com.bryan.ventas.ventas.Entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Embeddable;

@Embeddable
public class CabeceraPedidosId implements Serializable {
    
    private String tpe_codigo;
    private int cpe_codigo;

    public CabeceraPedidosId(String tpe_codigo, int cpe_codigo) {
        this.tpe_codigo = tpe_codigo;
        this.cpe_codigo = cpe_codigo;
    }



    public String getTpe_codigo() {
        return tpe_codigo;
    }

    public void setTpe_codigo(String tpe_codigo) {
        this.tpe_codigo = tpe_codigo;
    }

    public int getCpe_codigo() {
        return cpe_codigo;
    }

    public void setCpe_codigo(int cpe_codigo) {
        this.cpe_codigo = cpe_codigo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CabeceraPedidosId)) return false;
        CabeceraPedidosId that = (CabeceraPedidosId) o;
        return tpe_codigo == that.tpe_codigo && cpe_codigo == that.cpe_codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tpe_codigo, cpe_codigo);
    }
}