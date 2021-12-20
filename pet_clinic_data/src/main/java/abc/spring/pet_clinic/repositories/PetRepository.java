package abc.spring.pet_clinic.repositories;

import abc.spring.pet_clinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet,Long> {
}
