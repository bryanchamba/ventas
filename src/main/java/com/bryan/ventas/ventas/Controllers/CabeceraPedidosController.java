package com.bryan.ventas.ventas.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bryan.ventas.ventas.Repositories.CabeceraPedidosRepository;
import com.bryan.ventas.ventas.Entities.CabeceraPedidos;
import com.bryan.ventas.ventas.Entities.CabeceraPedidosId;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/cabecera_pedidos")
public class CabeceraPedidosController {

    @Autowired
    private CabeceraPedidosRepository cabeceraPedidosRepository;

    @GetMapping
    public List<CabeceraPedidos> getAllCabeceraPedidos() {
        return cabeceraPedidosRepository.findAll();
    }

    @GetMapping("/{id}")
    public CabeceraPedidos getCabeceraPedidosById(@PathVariable CabeceraPedidosId id) {
        return cabeceraPedidosRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No se encontró el pedido con el ID: " + id));
    }

    @PostMapping
    public CabeceraPedidos createCabeceraPedidos(@RequestBody CabeceraPedidos cabeceraPedidos) {
        return cabeceraPedidosRepository.save(cabeceraPedidos);
    }

    @PutMapping("/{id}")
    public CabeceraPedidos updateCabeceraPedidos(@PathVariable CabeceraPedidosId id, @RequestBody CabeceraPedidos detailsCabeceraPedidos) {
        CabeceraPedidos cabeceraPedidos = cabeceraPedidosRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No se encontró el pedido con el ID: " + id));

        cabeceraPedidos.setCpe_fecha(detailsCabeceraPedidos.getCpe_fecha());
        // Otros campos que quieras actualizar

        return cabeceraPedidosRepository.save(cabeceraPedidos);
    }

    @DeleteMapping("/{id}")
    public String deleteCabeceraPedidos(@PathVariable CabeceraPedidosId id) {
        CabeceraPedidos cabeceraPedidos = cabeceraPedidosRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No se encontró el pedido con el ID: " + id));
        
        cabeceraPedidosRepository.delete(cabeceraPedidos);

        return "Pedido eliminado correctamente";
    }
}
