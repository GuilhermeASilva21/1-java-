package relacionamento_one_to_many.relacionamento_one_to_many.converters;


import java.util.List;
import relacionamento_one_to_many.relacionamento_one_to_many.dtos.response.CreateClienteDto;
import relacionamento_one_to_many.relacionamento_one_to_many.entities.ClienteEntity;


public class ClienteConverters {
    public static CreateClienteDto entityToDto(ClienteEntity entity){
        CreateClienteDto clienteDTO = new CreateClienteDto();

        clienteDTO.setName(entity.getNome());
        List<String> endereco = entity.getEndereco().stream().map( cliente ->cliente.getRua() ).toList();
        clienteDTO.setEndereco(endereco);

        

        return clienteDTO;
    }
}