package abc.spring.pet_clinic.repositories;

import abc.spring.pet_clinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet,Long> {
}
