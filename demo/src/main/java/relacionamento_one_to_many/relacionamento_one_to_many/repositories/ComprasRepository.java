package relacionamento_one_to_many.relacionamento_one_to_many.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import relacionamento_one_to_many.relacionamento_one_to_many.entities.ComprasEntity;

public interface ComprasRepository extends JpaRepository<ComprasEntity, Long>  {
    
}