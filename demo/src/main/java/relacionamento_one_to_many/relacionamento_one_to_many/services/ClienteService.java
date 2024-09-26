package relacionamento_one_to_many.relacionamento_one_to_many.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import relacionamento_one_to_many.relacionamento_one_to_many.converters.ClienteConverters;
import relacionamento_one_to_many.relacionamento_one_to_many.dtos.response.CreateClienteDto;
import relacionamento_one_to_many.relacionamento_one_to_many.entities.ClienteEntity;
import relacionamento_one_to_many.relacionamento_one_to_many.repositories.ClienteRepository;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    public List<CreateClienteDto> getAllcliente() {
        List<ClienteEntity> result = clienteRepository.findAll();

        List<CreateClienteDto> response = result.stream().map((entity) -> {
            return ClienteConverters.entityToDto(entity);
        }).toList();

        return response;
    }
}
