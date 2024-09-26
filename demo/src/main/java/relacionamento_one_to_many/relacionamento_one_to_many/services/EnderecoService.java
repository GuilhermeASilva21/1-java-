package relacionamento_one_to_many.relacionamento_one_to_many.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import relacionamento_one_to_many.relacionamento_one_to_many.entities.EnderecoEntity;
import relacionamento_one_to_many.relacionamento_one_to_many.repositories.EnderecoRepository;

public class EnderecoService {
      @Autowired
    EnderecoRepository enderecoRepository;

    public List<EnderecoEntity> getAllEndereco(){
        return enderecoRepository.findAll();
    }
}
