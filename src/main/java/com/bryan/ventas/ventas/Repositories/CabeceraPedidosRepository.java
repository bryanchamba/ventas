package com.bryan.ventas.ventas.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bryan.ventas.ventas.Entities.CabeceraPedidos;
import com.bryan.ventas.ventas.Entities.CabeceraPedidosId;

public interface CabeceraPedidosRepository extends JpaRepository<CabeceraPedidos, CabeceraPedidosId> {
    
}