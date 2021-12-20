package abc.spring.pet_clinic.repositories;

import abc.spring.pet_clinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository extends CrudRepository<Speciality,Long> {
}
