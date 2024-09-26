package relacionamento_one_to_many.relacionamento_one_to_many.converters;

import java.util.List;

import relacionamento_one_to_many.relacionamento_one_to_many.dtos.response.CreateClienteDto;
import relacionamento_one_to_many.relacionamento_one_to_many.dtos.response.CreateComprasDto;
import relacionamento_one_to_many.relacionamento_one_to_many.entities.ClienteEntity;
import relacionamento_one_to_many.relacionamento_one_to_many.entities.ComprasEntity;

public class ComprasConverter {
        public static CreateComprasDto entityToDto(ComprasEntity entity){
        CreateComprasDto comprasDTO = new CreateComprasDto();

        comprasDTO.setProduto(entity.getProduto());
        List<String> compras = entity.getProduto().strip().map( produto ->produto.getProduto() ).toList();
        comprasDTO.setProduto(compras);

        

        return comprasDTO;
    }
}

