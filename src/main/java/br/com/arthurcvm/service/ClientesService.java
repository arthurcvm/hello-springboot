package br.com.arthurcvm.service;

import br.com.arthurcvm.model.Cliente;
import br.com.arthurcvm.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {

    @Autowired
    private ClientesRepository repository;

    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        ClientesRepository clientesRepository = new ClientesRepository();
        clientesRepository.persistir(cliente);
    }

    public void validarCliente(Cliente cliente){
        //aplica validações
    }
}
