package com.bryan.ventas.ventas.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bryan.ventas.ventas.Repositories.ClientesRepository;
import com.bryan.ventas.ventas.Entities.Clientes;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/clientes")
public class ClientesController {

    @Autowired
    private ClientesRepository clientesRepository;

    @GetMapping
    public List<Clientes> getAllClientes(){
        return clientesRepository.findAll();
    }

    @GetMapping("/{id}")
    public Clientes getClienteById(@PathVariable Long id){
        return clientesRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("No se encontró el cliente con el ID: " + id));
    }
    
    
    @PostMapping
    public Clientes createClientes(@RequestBody Clientes cliente){
        return clientesRepository.save(cliente);
    }

    @PutMapping("/{id}")
    public Clientes updateClientes(@PathVariable Long id, @RequestBody Clientes detailsCliente){
        Clientes cliente = clientesRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("No se encontró el cliente con el ID: " + id));

        cliente.setCli_apellidos(detailsCliente.getCli_apellidos());
        cliente.setCli_nombres(detailsCliente.getCli_nombres());

        return clientesRepository.save(cliente);
    }

    @DeleteMapping("/{id}")
    public String deleteCliente(@PathVariable Long id){
        Clientes cliente = clientesRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("No se encontró el cliente con el ID: " + id));
        
        clientesRepository.delete(cliente);

        return "Cliente eliminado correctamente";
    }

}
