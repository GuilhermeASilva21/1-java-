package relacionamento_one_to_many.relacionamento_one_to_many.converters;

import relacionamento_one_to_many.relacionamento_one_to_many.dtos.response.CreateEnderecoDto;
import relacionamento_one_to_many.relacionamento_one_to_many.entities.EnderecoEntity;

public class EnderecoConverter {
    public static CreateEnderecoDto entityToDto(EnderecoEntity entity){
        CreateEnderecoDto response = new CreateEnderecoDto();
        response.setRua(entity.getRua());

        return response;
    }
}
