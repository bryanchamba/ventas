package com.bryan.ventas.ventas.Entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Embeddable;

@Embeddable
public class DetallePedidosId implements Serializable {

    private String tpe_codigo;
    private int cpe_codigo;
    private short dpe_codigo;

    public DetallePedidosId(String tpe_codigo, int cpe_codigo, short dpe_codigo) {
        this.tpe_codigo = tpe_codigo;
        this.cpe_codigo = cpe_codigo;
        this.dpe_codigo = dpe_codigo;
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

    public short getDpe_codigo() {
        return dpe_codigo;
    }

    public void setDpe_codigo(short dpe_codigo) {
        this.dpe_codigo = dpe_codigo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DetallePedidosId)) return false;
        DetallePedidosId that = (DetallePedidosId) o;
        return tpe_codigo == that.tpe_codigo && cpe_codigo == that.cpe_codigo && dpe_codigo == that.dpe_codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tpe_codigo, cpe_codigo, dpe_codigo);
    }

}
