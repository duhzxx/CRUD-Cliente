package com.duhzx.clientes.controllers;

import com.duhzx.clientes.dto.ClienteDTO;
import com.duhzx.clientes.service.ClienteService;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping(value = "/{id}")
    public ClienteDTO findById(@PathVariable Long id) {
        return clienteService.findById(id);
    }

    @PostMapping
    public ClienteDTO insert(@Valid @RequestBody ClienteDTO dto) {
        return clienteService.insert(dto);
    }

    @PutMapping(value = "/{id}")
    public ClienteDTO update(@PathVariable Long id, @Valid @RequestBody ClienteDTO dto) {
        return clienteService.update(id, dto);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id) {
        clienteService.delete(id);
    }
}
