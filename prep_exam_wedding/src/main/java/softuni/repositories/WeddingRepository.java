package softuni.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import softuni.entities.Wedding;

@Repository
public interface WeddingRepository extends JpaRepository<Wedding,Long>{
}