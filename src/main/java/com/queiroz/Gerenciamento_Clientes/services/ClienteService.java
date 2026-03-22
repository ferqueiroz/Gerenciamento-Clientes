package com.queiroz.Gerenciamento_Clientes.services;

import com.queiroz.Gerenciamento_Clientes.models.ClienteModel;
import com.queiroz.Gerenciamento_Clientes.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public ClienteModel criar(ClienteModel clienteModel) {
        return clienteRepository.save(clienteModel);
    }

    public List<ClienteModel> listar() {
        return clienteRepository.findAll();
    }

    public Optional<ClienteModel> buscar(Long id) {
        return clienteRepository.findById(id);
    }

    public void excluir(Long id) {
        clienteRepository.deleteById(id);
    }
}
