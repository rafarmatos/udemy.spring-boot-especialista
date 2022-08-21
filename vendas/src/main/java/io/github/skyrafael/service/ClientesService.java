package io.github.skyrafael.service;

import io.github.skyrafael.model.Cliente;
import io.github.skyrafael.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {

    private ClientesRepository repository;

    public ClientesService( ClientesRepository repository){
        this.repository = repository;
    }

    public void salvarCliente(Cliente cliente) {
        validarCliente(cliente);
        this.repository.persistir(cliente);

    }

    private void validarCliente(Cliente cliente) {
    }
}
