package br.com.luhf.cliente.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import br.com.luhf.cliente.domain.Cliente;

public interface IClienteRepository extends MongoRepository<Cliente, String> {
    Optional<Cliente> findByCpf(String cpf);
}
