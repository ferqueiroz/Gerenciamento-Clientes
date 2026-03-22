package com.queiroz.Gerenciamento_Clientes.controllers;

import com.queiroz.Gerenciamento_Clientes.models.ClienteModel;
import com.queiroz.Gerenciamento_Clientes.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public ResponseEntity<ClienteModel> criar(@RequestBody ClienteModel clienteModel) {
        return ResponseEntity.status(201).body(clienteService.criar(clienteModel));
    }

    @GetMapping
    public ResponseEntity<List<ClienteModel>> lista() {
        return ResponseEntity.ok().body(clienteService.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClienteModel> buscar(@PathVariable Long id) {
        Optional<ClienteModel> livro = clienteService.buscar(id);

        if (livro.isPresent())
            return ResponseEntity.ok().body(livro.get());
        else
            return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ClienteModel> deletar(@PathVariable Long id) {
        clienteService.excluir(id);

        return ResponseEntity.noContent().build();
    }
}
