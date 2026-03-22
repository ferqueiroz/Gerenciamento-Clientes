package com.queiroz.Gerenciamento_Clientes.repositories;

import com.queiroz.Gerenciamento_Clientes.models.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ClienteModel, Long> {
}
