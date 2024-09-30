package com.bryan.ventas.ventas.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bryan.ventas.ventas.Entities.Clientes;

public interface ClientesRepository extends JpaRepository<Clientes, Long> {

    

}
