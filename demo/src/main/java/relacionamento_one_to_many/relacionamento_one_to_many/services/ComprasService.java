package relacionamento_one_to_many.relacionamento_one_to_many.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import relacionamento_one_to_many.relacionamento_one_to_many.entities.ComprasEntity;
import relacionamento_one_to_many.relacionamento_one_to_many.repositories.ComprasRepository;

public class ComprasService {
      @Autowired
    ComprasRepository comprasRepository;

    public List<ComprasEntity> getAllCompras(){
        return comprasRepository.findAll();
    }
}
