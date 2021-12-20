package abc.spring.pet_clinic.repositories;

import abc.spring.pet_clinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner,Long> {

}
